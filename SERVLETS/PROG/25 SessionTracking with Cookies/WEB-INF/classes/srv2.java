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
			pw.println("<h1>	CooKie...........");

			String income = req.getParameter("i");
			String tax			= req.getParameter("t");
			
			Cookie c[ ] =  req.getCookies();
			pw.println("<h1>	Name.........."+c[0].getValue()+"	AGe.........."+c[1].getValue());


			pw.println("<br>	Income.........."+income);
			pw.println("<br>	Tax.........."+tax+"</h1>");
	

													
			
		}

}
		