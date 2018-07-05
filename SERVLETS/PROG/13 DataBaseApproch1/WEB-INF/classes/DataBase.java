import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class DataBase extends HttpServlet
{

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void init()  
	{
		try
		{
				
	Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");

		String qry = "select * from student where sno > ?";

		 ps = con.prepareStatement(qry);
		 }
		catch (Exception e)
		{
		}
	
	
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)  
	{
	try
	{
		
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();

		String s1 =req.getParameter("t1");

		int no = Integer.parseInt(s1);
		ps.setInt(1,no);

			rs =		ps.executeQuery();

			pw.println("SNO			:				Name:					Address:			");
			while(rs.next())
			{
				
				pw.println("<br>"+rs.getString(1)+"		"+rs.getString(2)+"			"+rs.getString(3));
		
			}
			}
	catch (Exception e)
	{
	}

	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
	{
			doGet(req, res);
	}


}