/*
create or replace procedure Cursor1(no in number  ,details  out  sys_refcursor)
as
begin
open details for
select ename,sal, addr from emp where eno= no;
end;
/
*/

import java.sql.*;
import java.util.*;
import oracle.jdbc.*;


public class Cursor1 
{
	public static void main(String[] args)	 throws Exception
	{

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

		String qry = "{  call  Cursor1(?,?) }";
		CallableStatement cs = con.prepareCall(qry);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp Number	:	");		
		int no = sc.nextInt();
		cs.setInt(1,no);

		cs.registerOutParameter(2,OracleTypes.CURSOR);

		cs.execute();

		ResultSet rs = (ResultSet)cs.getObject(2);

		while(rs.next())
			{
			
		System.out.println(rs.getString(1)+"		"+rs.getInt(2)+"			"+rs.getString(3));		
			
			}
	}
}
