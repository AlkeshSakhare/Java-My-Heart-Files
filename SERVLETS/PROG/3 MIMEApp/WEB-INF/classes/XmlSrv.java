import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class XmlSrv extends HttpServlet
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			System.out.println("xml ---Obj is created with out Reqst");
			res.setContentType("text/xml");

			PrintWriter pw = res.getWriter();

			pw.println("<table>");
			pw.println("<tr><th>Name</th></tr>");
			pw.println("<tr><td>satya</tr></td>");
			pw.println("<tr><td>Johhny</tr></td>");
			pw.println("<tr><td>Kaveti</tr></td>");
	}

	
	}