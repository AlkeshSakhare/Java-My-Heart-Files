//{21}DeleteWithCondition	------>	delete from student where sadd = 'hyd' and (sno>=100 and sno<= 300)


import java.sql.*;
import java.util.*;

class DeleteWithCondition 
{
	public static void main(String[] args)		throws Exception
	{

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Delete peson Imformation		-->	1.Address	:	");
		String s1 = sc.next();

		System.out.println("2.Minimum Range	:	");
		int n1 = sc.nextInt();

		System.out.println("3.Maximum Range	:	");
		int n2 = sc.nextInt();

		String qry = "delete from student where sadd = '"+s1+"' and (sno>="+n1+" and sno<= "+n2+")";

		int res = st.executeUpdate(qry);

		if(res == 0)
		System.out.println("No Records Found");
		else
			System.out.println(res+"	 Students Are Deleted");
	}
}
