//DropTable
//drop table tv ;

import java.sql.*;
import java.util.*;

class DropTable
{
	public static void main(String[] args)  throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		String qry	=	"drop table tv";

		System.out.println("Query	:	"+qry);

		int res = st.executeUpdate(qry);
		if (res==0)
		
			System.out.println("Already  Dropd");
		
		else

		System.out.println(res+ "is Dropd");
		

		
	}
}
