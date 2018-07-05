//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

public class  Approch8

{
	public static void main(String[] args)  throws Exception
	{

		Class.forName(System.getProperty("dname"));

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

		if(con != null)
		{
			System.out.println("Success");
			System.out.println("Connection Obj	:	"+con.getClass());//class sun.jdbc.odbc.JdbcOdbcConnection
		}
		else
		{
			System.out.println("Fail");
		}
	}
}


/*

java  -D dname = sun.jdbc.odbc.JdbcOdbcDriver  Approch8

*/