import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv1 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
				res.setContentType("text/html");
				PrintWriter pw = res.getWriter();

				String name = req.getParameter("t1");
				String age = req.getParameter("t2");
				String mrg = req.getParameter("t3");

				if(mrg == null)
				{
						mrg = "single";
							pw.println("<form action = 's2'>");
						pw.println("when do u want to marry	:	<input type = 'text'	name = 'l1'><br>");
							pw.println("why not marry	:	<input type = 'text'	name = 'l2'><br>");
									pw.println("<input type = 'submit' name = 'l4' value = 'OK'><br>");
									pw.println("<input type = 'hidden' name = 't1' value = "+name+">");
									pw.println("<input type = 'hidden' name = 't2' value = "+age+">");
									pw.println("<input type = 'hidden' name = 't3' value = "+mrg+">");
				}

				else
				{
							mrg = "married";
							pw.println("<form action = 's2'>");
						pw.println("Wife name	:	<input type = 'text'	name = 'l1'><br>");
							pw.println("Children	:	<input type = 'text'	name = 'l2'><br>");
									pw.println("<input type = 'submit' name = 'l4' value = 'OK'><br>");
									pw.println("<input type = 'hidden' name = 't1' value = "+name+">");
									pw.println("<input type = 'hidden' name = 't2' value = "+age+">");
									pw.println("<input type = 'hidden' name = 't3' value = "+mrg+">");
				
				
				}

}
}