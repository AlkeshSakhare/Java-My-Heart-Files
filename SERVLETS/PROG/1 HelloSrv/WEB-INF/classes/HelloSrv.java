import javax.servlet.*;
import javax.servlet.GenericServlet;
import java.io.*;
import java.util.Date;

public class HelloSrv extends GenericServlet
{

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("text/html");

			Date d = new Date();

			String dd = d.toString();

			PrintWriter pw = res.getWriter();

			pw.println("<h1>HelloSrv</h1>");

			pw.println("<h2>DATE		:		</h2>"+dd);

			pw.close();


	}

	
	}
