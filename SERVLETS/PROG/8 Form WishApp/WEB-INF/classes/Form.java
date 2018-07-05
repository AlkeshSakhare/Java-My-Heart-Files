import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Form extends HttpServlet
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();

			pw.println("<h1><b>Wishing the Form</h1></b>");

			Calendar c1 = Calendar.getInstance();

			int h = c1.get(Calendar.HOUR_OF_DAY);


			if(h <= 12)
				pw.println("<h1><b>Good Mornng</h1></b>");
			

				else if(h <= 16)
				pw.println("<h1><b>Good Afternoon</h1></b>");

				else
					pw.println("<h1><b>Good Ni8</h1></b>");


	

		


	}

}