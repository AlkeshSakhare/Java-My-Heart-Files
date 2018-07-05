//AggrigateFun1	---------->	select count(*) from student;

import java.sql.*;
import java.util.*;

class AggrigateFun1
{
	public static void main(String[] args)  throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		String qry = "select count(*) from student";

		ResultSet rs = st.executeQuery(qry);
		rs.next();

		System.out.println("Count	using INDEX		:	"+rs.getInt(1));
	//	System.out.println("Count	using COL NAME	:	"+rs.getInt("count"));
	}
}
