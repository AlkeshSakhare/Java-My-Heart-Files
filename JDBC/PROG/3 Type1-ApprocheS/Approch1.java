//Approch1 : Prog to make a connction using Type-1 Driver

import java.sql.*;

class  Approch1
{
	public static void main(String[] args)  throws Exception
	{
		//0. create Object for JdbcOdbcDriver class

		sun.jdbc.odbc.JdbcOdbcDriver  od = new 		sun.jdbc.odbc.JdbcOdbcDriver();			
		//1st time regster...bcoz of Static method

		//1.registerDriver with DriverManager

		DriverManager.registerDriver(od);	//2nd time regster...bcoz of Explicit Register

		//2.load Driver usng url...and make connection

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

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
