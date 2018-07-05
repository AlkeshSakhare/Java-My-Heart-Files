/*create or replace procedure deletestudent(addr in  string,cnt out number )
as
begin
delete from student where address = addr;
cnt := SQL%ROWCOUNT;
end;
/
*/
import java.sql.*;
import java.util.*;

public class PLSQLNonSelect1 
{
	public static void main(String[] args)  throws Exception
	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con =		DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

			String qry = "{ call deletestudent(?,?) }";
			CallableStatement cs = con.prepareCall(qry);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter student Address	to DELETE	 :	");
			String addr = sc.next();

			cs.setString(1,addr);
			cs.setOutParameter(2,Types.INTEGER);

			cs.execute();

			System.out.println("NO. OF RECORDS DELETED	:	"+cs.getInt(2));


		System.out.println("Hello World!");
	}
}
