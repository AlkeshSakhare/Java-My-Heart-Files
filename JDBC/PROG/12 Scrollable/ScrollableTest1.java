import java.sql.*;
import java.util.*;

class ScrollableTest1 
{
	public static void main(String[] args)  throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = st.executeQuery("select * from student");

		System.out.println("From Using Next	");

		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));		
		}


		System.out.println("From Using Previous	");
		while(rs.previous())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));		
		}

		System.out.println("randomly...................	");


		rs.last();
		System.out.println("LAST RECORD...................	"+rs.getRow()+"--->"+rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));

		rs.first();
		System.out.println("LAST RECORD...................	"+rs.getRow()+"--->"+rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));

		
		System.out.println("absolute");
		rs.absolute(4);
		System.out.println("Absolute...................	"+rs.getRow()+"--->"+rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));

		System.out.println("relative");
		rs.relative(-2);
		System.out.println("relative...................	"+rs.getRow()+"--->"+rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));


	}
}
