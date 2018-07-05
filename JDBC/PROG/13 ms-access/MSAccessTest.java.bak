

import java.sql.*;
import java.util.*;

class  MSAccessTest
{
	public static void main(String[] args)	 throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:accdsn");	

		Statement st = con.createStatement();

		String qry = "select * from product";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		}

	}
}
