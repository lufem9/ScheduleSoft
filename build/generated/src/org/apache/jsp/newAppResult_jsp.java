package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.*;

public final class newAppResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('<');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <title>Appointment Result Page</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href='schedulesoft.css' rel='stylesheet' type='text/css'>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Header -->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <h1>TIMETECH</h1>\n");
      out.write("            <p><b>SCHEDULSOFT </b>APPLICATION.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Navigation Bar -->\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <a href=\"Login.jsp\">LOGIN</a>\n");
      out.write("            <!--<a href=\"#\">Link</a>\n");
      out.write("            <a href=\"#\">Link</a>\n");
      out.write("            <a href=\"#\">Link</a>-->\n");
      out.write("        </div> \n");
      out.write("        ");

              session=request.getSession();
              Client c1=(Client)session.getAttribute("p1");
              String info = "You have successfully creat new Entity";
            
      out.write("\n");
      out.write("        <!-- The flexible grid (content) -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"side\">\n");
      out.write("                <h2>CLIENT DETAILS</h2>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Client ID</th>\n");
      out.write("                        <td>");
      out.print(c1.getId() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>First Name</th>\n");
      out.write("                        <td>");
      out.print(c1.getFirstName() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th> Email </th>\n");
      out.write("                        <td>");
      out.print(c1.getEmail());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th> Address </th>\n");
      out.write("                        <td>");
      out.print(c1.getAddress() );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"common\" >\n");
      out.write("            \n");
      out.write("        <table class=\"box\">\n");
      out.write("                <tr>\n");
      out.write("                      <td colspan=\"2\"><h1>New Appointment Schedule Confirmation Page</h1></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  <td colspan=\"2\">");
      out.print(  "Hello ,"+ c1.getFirstName());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                      <td colspan=\"2\">");
      out.print( info);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("        </div>     \n");
      out.write("            <!-- Footer -->\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <h2>Footer</h2>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
