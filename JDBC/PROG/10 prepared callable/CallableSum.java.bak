/*
create or replace procedure CallableSum(x in number, y in number, z out number) 
is
begin
	z := x+y;
end;
/	
*/

import java.sql.*;
import java.io.*;
import java.util.*;

class CallableSum 
{
	public static void main(String[] args)  throws Exception
	{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
	
	String qry = "{call CallableSum(?,?,?)}";

	CallableStatement cs = con.prepareCall(qry);

	Scanner  sc = new 	Scanner(System.in);
	
	System.out.println("Enter X	:	");	
	int x = sc.nextInt();
	cs.setInt(1,x);

	System.out.println("Enter Y	:	");	
	int y = sc.nextInt();
	cs.setInt(2,y);

	cs.registerOutParameter(3,Types.INTEGER);
	
	System.out.println("cs.registerOutParameter(3,Types.INTEGER)	:DONE	");	
	

	boolean rs = cs.execute();//false if exceute
	System.out.println("rs	 :"+rs);	


			System.out.println("SUM IS	:	"+cs.getInt(3));	

	}
}
