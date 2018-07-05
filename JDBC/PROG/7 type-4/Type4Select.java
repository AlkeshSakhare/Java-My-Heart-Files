import  java.sql.*;


class Type4Select 
{
	public static void main(String[] args)  throws Exception
	{

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

			System.out.println("ok");

			Statement st = con.createStatement();

			String qry = "select * from student";

						System.out.println(qry);

			ResultSet rs = st.executeQuery(qry);

			System.out.println("ok");

			while(rs.next())
		{
		System.out.println(rs.getString(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
		}
	}
}
