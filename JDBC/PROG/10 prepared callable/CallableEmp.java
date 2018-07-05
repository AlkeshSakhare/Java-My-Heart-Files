/*
create or replace procedure CallableEmp(name out varchar2,	desig out varchar2, salr out number, no in number ) 
as
begin
		select ename,design,sal into  name,desig,salr from emp where eno = no;
end;
/	
*/

import java.sql.*;
import java.io.*;
import java.util.*;

class CallableEmp
{
	public static void main(String[] args)  throws Exception
	{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
	
	String qry = "{call CallableEmp(?,?,?,?)}";

	CallableStatement cs = con.prepareCall(qry);

	Scanner  sc = new 	Scanner(System.in);
	
	System.out.println("Enter Emp Number	:	");	
	int no = sc.nextInt();
	cs.setInt(4,no);

	
	cs.registerOutParameter(1,Types.VARCHAR);
	cs.registerOutParameter(2,Types.VARCHAR);
	cs.registerOutParameter(3,Types.INTEGER);
	
	System.out.println("cs.registerOutParameter	:DONE	");	
	

	boolean rs = cs.execute();//false if exceute
	System.out.println("rs	 :"+rs);	


			System.out.println("NAME IS		:	"+cs.getString(1));	
			System.out.println("DESGNATION IS	:	"+cs.getString(2));	
			System.out.println("SALARY IS	:	"+cs.getInt(3));	

	}
}
