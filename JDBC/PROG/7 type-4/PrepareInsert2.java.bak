import java.sql.*;
import java.util.*;


class PrepareInsert2
{
	public static void main(String[] args)  throws Exception
	{

			Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con =		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");

			Scanner sc = new Scanner(System,in);

			System.out.println("How many student detals u want to enter");

			int n = sc.nextInt();

			for(int i=0; i<n ;i++)
			{

			System.out.println("Enter	Numebr");
			int no = sc.nextInt();
			ps.setInt(1,no);


			System.out.println("Enter	Name");
			String nam = sc.next();
			ps.setString(2,nam);
		
			System.out.println("Enter	Address");
			String add = sc.next();
			ps.setString(3,add);

			int res = ps.executeUpdate();

		}

		System.out.println("Result	:	"+res);
	}
}
