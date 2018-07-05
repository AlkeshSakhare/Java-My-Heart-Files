//{18}MultipleAggrigateFun	------>	select count(*), max(sno), min(sno), sum(sno), avg(sno) from student;

import java.sql.*;
import java.util.*;

class MultipleAggrigateFun 
{
	public static void main(String[] args)  throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		String qry	=	 "select count(*), max(sno), min(sno), sum(sno), avg(sno) from student";

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{
		System.out.println("Count		:"+	rs.getInt(1));
		System.out.println("MAX	 	:"+	rs.getInt(2));
		System.out.println("MIN	 	:"+	rs.getInt(3));
		System.out.println("SUM		:"+	rs.getFloat(4));
		System.out.println("AVG		:"+	rs.getDouble(5));
		
		}
		st.close();
		con.close();

	}
}
