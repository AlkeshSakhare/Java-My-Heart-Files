//CreateTable
//create table tv (no number, chanel varchar(15));

import java.sql.*;
import java.util.*;

class CreateTable
{
	public static void main(String[] args)  throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		String qry	=	"create table tv (no number, chanel varchar(15))";;

		System.out.println("Query	:	"+qry);

		int res = st.executeUpdate(qry);
		if (res==0)
		
			System.out.println("Already  created");
		
		else

		System.out.println(res+ "is created");
		

		
	}
}
