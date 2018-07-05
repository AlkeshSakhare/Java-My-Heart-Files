
import java.sql.*;
import java.util.*;

class Type2Select
{
	public static void main(String[] args)  throws Exception
	{
			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@xe","system","a");

			Statement st = con.createStatement();

			String qry = "select * from student ";

			boolean res = st.execute(qry);

	if(res)
		{

				ResultSet rs = st.getResultSet();

				while(rs.next())
				{
				
									System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
				}

		
		}

		else
		{
		
				int rs = 	st.getUpdateCount();
	
				if(rs==0)
							System.out.println("NOT DONE");
		
				else
							System.out.println(rs+"rows Updated");

		
		}


	}
}
