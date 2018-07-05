import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class srv2 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();
			pw.println("<h1>	Status of yours...........</h1>");

			String name = req.getParameter("t1");
			String age = req.getParameter("t2");
			String  s1 = req.getParameter("l1");
			String  s2 = req.getParameter("l2");
			try
			{
				
					pw.println("<br><br><br><br><br><br><h1>	Name	 :	</h1>"+name);
					pw.println("<br><h1>	Age :	</h1>"+age);
					pw.println("<br><br><br><h1>	Family	</h1>");
					pw.println("<br><h1>"+s1+"</h1>");
					pw.println("<br><h1>"+s2+"</h1>");

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","a");
			
			String qry = "insert into form values(?,?,?,?)";

			PreparedStatement ps =con.prepareStatement(qry);

			ps.setString(1,name);
			ps.setString(2,age);
			ps.setString(3,s1);
			ps.setString(4,s2);

			int r = ps.executeUpdate();

			if(r==0)
								pw.println("<h1><b><u>No Rows are Stored<h1>");
			else
				pw.println("<h1><b><u>Data is Stored<h1>"+r);
			    
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
	

		}

}
		