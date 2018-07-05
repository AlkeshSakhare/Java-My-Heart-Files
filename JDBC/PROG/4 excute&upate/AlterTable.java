//{23}AlterTable			----->	alter table student add constraint p primary key(sno);

import java.sql.*;
import java.util.*;

class  AlterTable
{
	public static void main(String[] args)	 throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a"); 

		Statement st = con.createStatement();

		String qry	=	"alter table student add constraint p primary key(sno)";

		int res = st.executeUpdate(qry);

				if(res==0)
				System.out.println("NOT Alterd");
				else
				System.out.println(res + "ALTERD SUCCESFULLY");



	}
}
