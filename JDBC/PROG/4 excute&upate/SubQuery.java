//{19}SubQuery			------>	select * from  student where sno = (select max(sno) from student)

import java.sql.*;
import java.util.*;

class SubQuery 
{
	public static void main(String[] args) throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();
		
		String qry = "select * from  student where sno = (select max(sno) from student)";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		
				System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		}

	}
}
