//ByLikeLetter		:select * from student where sname like 's%';

import java.sql.*;
import java.util.*;

class ByLikeLetter 
{
	public static void main(String[] args)  throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Starting Letter u Want	 :	");

		String s1 = sc.next();

		String letter	=	s1+"%'";
		String qry	=	"select * from student where sname like '"+letter;

		//String qry = "select * from student where sname like 's%'";

		System.out.println("Query	:	"+qry);

		ResultSet rs = st.executeQuery(qry);

		while(rs.next())
		{

		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		
		}

		
	}
}
