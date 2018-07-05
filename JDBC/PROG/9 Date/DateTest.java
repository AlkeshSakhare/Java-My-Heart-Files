import java.sql.*;
import java.util.*;
import java.io.*;
import java.text.*;


public class DateTest 
{
	public static void main(String[] args)  throws Exception
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("");
		
		System.out.println("Enter Emp no	:	");
		int  no = sc.nextInt();

		System.out.println("Enter Emp name	:	");
		String  nam = sc.next();

		System.out.println("Enter DOBirth	:	");
		String  dob = sc.next();

		System.out.println("Enter DOJoin	:	");
		String  doj = sc.next();

		System.out.println("Enter DOMarried	:	");
		String  dom = sc.next();

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

		PreparedStatement ps = con.prepareStatement("insert into empdate values(?,?,?,?,?)");

		//convert string Date into util date

		SimpleDateFormat sd1 = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date vdob = sd1.parse(dob);

		//get that date into long formate

		long msdob = vdob.getTime();

		//convert that into SQL formate Date

		java.sql.Date sqdob = new  java.sql.Date(msdob);

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		SimpleDateFormat sd2 = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date vdoj = sd2.parse(dob);

		//get that date into long formate

		long msdoj = vdoj.getTime();

		//convert that into SQL formate Date

		java.sql.Date sqdoj = new  java.sql.Date(msdoj);


		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		SimpleDateFormat sd3 = new SimpleDateFormat("dd-mm-yyyy");
		java.util.Date vdom = sd3.parse(dob);

		//get that date into long formate

		long msdom = vdom.getTime();

		//convert that into SQL formate Date

		java.sql.Date sqdom = new  java.sql.Date(msdom);

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		ps.setInt(1,no);
		ps.setString(2,nam);
		ps.setDate(3,sqdob);
		ps.setDate(4,sqdoj);
		ps.setDate(5,sqdom);

		int res = ps.executeUpdate();


		System.out.println(res+"Records are Inserted");

		System.out.println("Hello World!");
	}
}
