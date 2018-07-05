import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class VoterApp extends HttpServlet
{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

				PrintWriter pw = res.getWriter();

			pw.println("<h1><b>VOTER CARD</h1></b>");


			String name = req.getParameter("t1");
			String age = req.getParameter("t2");

			//form validation

			if(name == null|name.length() == 0||name.equals(""))
		{
				pw.println("Enter name Properly");
				return;
		}

			if(age == null|age.length() == 0||age.equals(""))
		{
			pw.println("Enter age Properly");
				return;
		}

		int a =0;
		try
		{
			a = Integer.parseInt(age);
		}
		catch (Exception e)
		{
				pw.println("Enter Number Properly");
		}
			

			if(a>18)
				pw.println("<h1><b>"+name+"Ur Eligible</h1></b>");
		

				else
				pw.println("<h1><b>"+name+"Ur NOT Eligible</h1></b>");

    			pw.println("<h1><b><a href = 'http://localhost:7080/9%20VoterApp/input.html'>Goback</a></h1></b>");

	
	}

}