import  java.sql.*;


public class Type2Select 
{
	public static void main(String[] args)  throws Exception
	{

			Class.forName("oracle.jdbc.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:oci8:@orcl", "system", "a");

			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("select * from student");

			while(rs.next())
			{
				System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getString(3));	
			}

	}
}
