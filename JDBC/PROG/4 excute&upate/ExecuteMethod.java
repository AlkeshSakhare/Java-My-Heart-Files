//{23}ExecuteMethod			----->	alter table student add constraint p primary key(sno);

import java.sql.*;
import java.util.*;

public class  ExecuteMethod
{
	public static void main(String[] args)	 throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a"); 

		Statement st = con.createStatement();

		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter Query	 on student : SELECT	/ NON- SELECT");
		
		String qry = sc.next();
		
		System.out.println(" Query	 "+qry);
		*/
		
		//String qry = args[0];

		boolean b = st.execute("select * from student");
		

		

		if(b == true)
		{
		
		ResultSet rs = st.getResultSet();
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		
		}


		
		}//if

		else
		{

		int res = st.getUpdateCount();

				if(res==0)
				System.out.println("NOT Alterd");
				else
				System.out.println(res + "ALTERD SUCCESFULLY");

	}//else
}//main
}//class

/*

D:\study\BOOKS LIBRARY\JDBC@May@WithNotes\Apps\excute&upate>java  ExecuteMethod "select * from student"

100             satya           vjw
103             srnu            kanur
345             das             hyd
*/