//{23}UpdateTable			----->	update  student set sname = 'nanna' , sadd = 'kanur' where sno = 129;

import java.sql.*;
import java.util.*;

class  UpdateTable
{
	public static void main(String[] args)	 throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a"); 

		Statement st = con.createStatement();

		String qry	=	"update  student set sname = 'nanna' , sadd = 'kanur' where sno = 129";

		int res = st.executeUpdate(qry);

				if(res==0)
				System.out.println("NOT UPDATED");
				else
				System.out.println(res + "	row Updated SUCCESFULLY");



	}
}
