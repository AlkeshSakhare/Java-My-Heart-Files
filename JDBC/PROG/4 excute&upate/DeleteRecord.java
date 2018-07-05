//{20}DeleteRecord			------>	delete from student where sno = 205;

import java.sql.*;
import java.util.*;

class DeleteRecord 
{
	public static void main(String[] args)  throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student no To Delete	:");
		int no = sc.nextInt();

		String qry = "delete from student where sno = "+no;

		int res = st.executeUpdate(qry);

		if(res==0)
			System.out.println(" Student Number NOT Found	");
		else
			System.out.println(res+" Student DATA DELETED");

	}
}
