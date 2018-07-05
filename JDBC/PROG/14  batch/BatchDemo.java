

import java.sql.*;
import java.io.*;


 public class  BatchDemo
{
	public static void main(String[] args)  throws Exception
	{	

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection	con=DriverManager.getConnection("jdbc:odbc:oradsn","system","a");

		Statement st = con.createStatement();
			st.addBatch("insert into  student	 values(81, 'Syam', 'mtm')");
			st.addBatch("insert into  student	 values(11, 'ram', 'mum')");
			st.addBatch("insert into  student	 values(14, 'bam', 'kuk')");
			st.addBatch("insert into  student	 values(44, 'pram', 'secu')");
	
		 int	 rs[] =	st.executeBatch();
			int sum=0;
		 for(int i=0;i<rs.length;i++)
		{
		 sum = sum+i;
		  }
		System.out.println(sum+"Record are UPDATED using BATCH");
	}
}
