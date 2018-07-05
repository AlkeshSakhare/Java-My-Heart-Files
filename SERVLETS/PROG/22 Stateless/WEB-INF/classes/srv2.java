import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


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

					pw.println("<br><br><br><br><br><br><h1>	Name	 :	</h1>"+name);
					pw.println("<br><h1>	Age :	</h1>"+age);
					pw.println("<br><br><br><h1>	Family	</h1>");
					pw.println("<br><h1>"+s1+"</h1>");
					pw.println("<br><h1>"+s2+"</h1>");

				

		}

}
		