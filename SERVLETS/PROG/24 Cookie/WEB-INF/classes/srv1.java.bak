import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv1 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
				Cookie 		c1 = new Cookie("name", "value");
				c1.setComment("comment");
				c1.setMaxAge(3000);
				c1.setDomain("domain");
				c1.setVersion(1000);
				Cookie 		c2 = new Cookie("one", "1");
				Cookie 		c3 = new Cookie("two", "2");
				Cookie 		c4 = new Cookie("three", "3");
				Cookie 		c5 = new Cookie("four", "4");
				Cookie 		c6 = new Cookie("five", "5");

			res.addCookie(c1);
			res.addCookie(c2);
			res.addCookie(c3);
			res.addCookie(c4);
			res.addCookie(c5);
			res.addCookie(c6);

			res.setContentType("text/html");

			PrintWriter pw = res.getWriter();
			pw.println("<h1>	CooKie are Added Succesfully</h1>");
	
		}
}