import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class srv1 extends HttpServlet
{

		public void service(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
			res.setContentType("text/html");
				

				req.setAttribute("a1","v1");
				PrintWriter pw = res.getWriter();

				pw.println("<h1>		SRV 1</h1>");
			HttpSession ses = req.getSession();  
			ses.setAttribute("a2","v2");

			ServletContext sc = getServletContext();
			sc.setAttribute("a3","v3");

			RequestDispatcher rd = req.getRequestDispatcher("/s2");

			rd.forward(req,res);

		
		}

		public void doPost(HttpServletRequest  req, HttpServletResponse res) throws ServletException, IOException
		{
				doGet(req,res);
		}

}