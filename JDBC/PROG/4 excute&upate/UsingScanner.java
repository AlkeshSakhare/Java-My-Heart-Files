//UsingScanner

import java.sql.*;
import java.util.*;

public class UsingScanner
{
	public static void main(String[] args)		throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		//cretr scanner class

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Starting Range	 :	");
		int str	=	sc.nextInt();

		System.out.println("Enter Ending Range	 :	");
		int end	=	sc.nextInt();

		String qry = "select * from student where sno >= "+str+"and sno<= "+end;
		
		ResultSet rs = st.executeQuery(qry);												//rs		------------>   101		satya	hyd

				if(con!= null)
				{
				System.out.println("conn...ok");		
				
				}

			//process the Result Set Obj

			System.out.println("sno		sname			sadd");		
			System.out.println("________________________________________________________________________________________");		
		
			while(rs.next())
			{
			
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));		
			
			}

		//close Connection & all

			st.close();
			con.close();

	}
}
