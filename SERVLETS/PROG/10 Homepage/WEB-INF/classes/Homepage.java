import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Homepage extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

				PrintWriter pw = res.getWriter();

			pw.println("<h1><b>HOME PAGE</h1></b>");

   			pw.println("Welcome to BlackTree Software Solutions");

	
	}

}