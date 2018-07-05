import javax.servlet.*;
import javax.servlet.GenericServlet;
import java.io.*;
import java.util.Date;

public class ReqSrv extends GenericServlet
{
	

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
	
			res.setContentType("<br>text/html");

			Date d = new Date();

			String dd = d.toString();

			PrintWriter pw = res.getWriter();

			 pw.println("<br>  getProtocol "+req.getProtocol() );
			 pw.println("<br>  getServerName "+req.getServerName() );

 pw.println("<br>  getServerPort "+req.getServerPort() );
 pw.println("<br> getRemotePort  "+req.getRemotePort() );
 pw.println("<br>  getLocalPort "+req.getLocalPort() );

   pw.println("<br>  getAttributeNames "+req.getAttributeNames() );
   pw.println("<br>   getParameterNames"+req.getParameterNames() );
  
   pw.println("<br> getContentType  "+req.getContentType() );
	pw.println("<br>  getContentLength "+req.getContentLength() );
   pw.println("<br>  getCharacterEncoding "+req.getCharacterEncoding() );
 

   pw.println("<br>  getRemoteAddr "+req.getRemoteAddr() );
   pw.println("<br>   getRemoteHost() );"+req.getRemoteHost() );
   pw.println("<br>   .getLocalName() );"+req.getLocalName() );
   pw.println("<br>  +req.getLocalAddr() ); "+req.getLocalAddr() );
   pw.println("<br> eq. getLocale() );  "+req. getLocale() );
   pw.println("<br>   getLocales() );"+req.getLocales() );

   pw.println("<br> req.getScheme  "+req.getScheme() );
 
   pw.println("<br> req.getScheme  "+req.isSecure() );


			pw.close();


	}

	
	}
