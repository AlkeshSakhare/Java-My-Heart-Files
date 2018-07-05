import java.sql.*;
import java.util.*;


class PrepareInsert 
{
	public static void main(String[] args)  throws Exception
	{

			Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con =		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");

			ps.setInt(1,40);
			ps.setString(2,"sri");
			ps.setString(3,"mum");

			int res = ps.executeUpdate();

		System.out.println("Result	:	"+res);
	}
}
