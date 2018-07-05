//{16}	ByConditions1---------->		select detals of one whose sno>= 100 and add is 'hyd' or 'kanur'
	//									select * from student where sno >= 100 and sadd in('hyd', 'kanur') 
//_____________________________________________________________________________________________________

import java.sql.*;
import java.util.*;

class  ByConditions1
{
	public static void main(String[] args)	 throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");	

		Statement st = con.createStatement();

		String qry = "select * from student where sno >= 100 and sadd in('hyd', 'kanur') ";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		}

	}
}
