package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>PLUG N</h1>\r\n");
      out.write("<OBJECT classid=\"clsid:8AD9C840-044E-11D1-B3E9-00805F499D93\"" + " width=\"" + "300" + "\"" + " height=\"" + "300" + "\"" + " hspace=\"50\" vspace=\"50\" codebase=\"http://java.sun.com/products/plugin/1.2.2/jinstall-1_2_2-win.cab#Version=1,2,2,0\">");
      out.write("\n");
      out.write("<PARAM name=\"java_code\" value=\"Demo\">");
      out.write("\n");
      out.write("<PARAM name=\"type\" value=\"application/x-java-applet;\">");
      out.write("\n");
      out.write("<COMMENT>");
      out.write("\n");
      out.write("<EMBED type=\"application/x-java-applet;\"" + " width=\"" + "300" + "\"" + " height=\"" + "300" + "\"" + " hspace=\"50\" vspace=\"50\" pluginspage=\"http://java.sun.com/products/plugin/\" java_code=\"Demo\"");
      out.write("/>");
      out.write("\n");
      out.write("<NOEMBED>");
      out.write("\n");
      out.write("</NOEMBED>");
      out.write("\n");
      out.write("</COMMENT>");
      out.write("\n");
      out.write("</OBJECT>");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
