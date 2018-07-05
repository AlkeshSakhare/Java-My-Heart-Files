import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class ContextParam extends HttpServlet
{

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void init()  
	{
		try
		{

			ServletConfig g = getServletConfig();

			ServletContext cg = g.getServletContext();


			String s1 = cg.getInitParameter("driver");
			System.out.println(s1);

			String s2 = cg.getInitParameter("url");
			System.out.println(s2);

			String s3 = cg.getInitParameter("uname");
			System.out.println(s3);

			String s4 = cg.getInitParameter("pswd");
			System.out.println(s4);
			
			Class.forName(s1);

		con = DriverManager.getConnection(s2,s3,s4);

		String qry = "select * from student where sno > ?";

		System.out.println(qry);
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