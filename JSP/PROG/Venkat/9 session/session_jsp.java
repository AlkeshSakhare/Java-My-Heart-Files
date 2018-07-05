package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class session_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
 


String s1 = request.getParameter("uname");
String s2 = request.getParameter("pword");


if(s1.equals(""))
{
out.println("	USER NAME plz.......");
out.println("<a href = login.html>Go back </a>");

}

else if(s2.equals(""))
{
out.println("	PASSWORD  plz.......");
out.println("<a href = login.html>Go back </a>");
}

	else
	{
out.println("WELCOME	"+s1);
session.setAttribute("uname",s1);
session.setAttribute("pword",s2);
out.println("<br><a href = true.jsp>TRUE </a><br>");
out.println("<br><a href = false.jsp>FALSE</a>");
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("</h1>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
