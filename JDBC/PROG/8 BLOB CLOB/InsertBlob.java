//create table blobtest(eno number(10), ename varchar(15), img blob);

import java.sql.*;
import java.io.*;


 public class  InsertBlob
{
	public static void main(String[] args)  throws Exception
	{	

		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

		PreparedStatement ps = con.prepareStatement("insert into blobtest values(?,?,?)");

		File f = new File("img.gif");
		FileInputStream fis = new FileInputStream(f);

		ps.setInt(1,100);
		ps.setString(2,"johny");
		ps.setBinaryStream(3,fis,(int)f.length());
		//ps.setBlob(3,fis);

 int x = 	 ps.executeUpdate();

		System.out.println(x+"Record is Inserted");
	}
}
