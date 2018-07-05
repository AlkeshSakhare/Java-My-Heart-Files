//		{22}InsertRecord			------>	insert into student values(108,'Amma','hyd');

import java.sql.*;
import java.util.*;

class  InsertRecord
{
	public static void main(String[] args)  throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number	:	");
		int no = sc.nextInt();

		System.out.println("Enter Name	:	");
		String s1 = sc.next();

		System.out.println("Enter Address	:	");
		String s2 = sc.next();

		String qry = "	insert into student values("+no+",'"+s1+"','"+s2+"')";

		System.out.println("QRY		:	"+qry);
		

		int res = st.executeUpdate(qry);

		if(res==0)
				System.out.println("NO RECORD ADDED");
		else
				System.out.println(res + "RECORD is ADDED");
	}
}
