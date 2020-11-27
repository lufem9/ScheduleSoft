package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.*;

public final class ScheduleAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Schedule Appointment</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href='schedulesoft.css' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- Header -->\n");
      out.write("    <div class=\"header\">\n");
      out.write("        <h1>TIMETECH</h1>\n");
      out.write("        <p><b>SCHEDULSOFT </b>APPLICATION.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Navigation Bar -->\n");
      out.write("    <div class=\"navbar\">\n");
      out.write("        <a href=\"clientPage.jsp\">My Page</a>\n");
      out.write("       <!-- <a href=\"#\">Link</a>\n");
      out.write("        <a href=\"#\">Link</a>\n");
      out.write("        <a href=\"#\">Link</a>-->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- The flexible grid (content) -->\n");
      out.write("   <!-- <div class=\"row\">\n");
      out.write("        <div class=\"side\">\n");
      out.write("            <h2>LOGIN FORM</h2>\n");
      out.write("           <!-- <form action=\"loginServlet\" method=\"post\">\n");
      out.write("                <table class=\"box\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ID :</td>\n");
      out.write("                        <td><input type=\"ID\" name=\"idtxt\" value=\"ID\" class=\"email\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password :</td>\n");
      out.write("                        <td><input type=\"password\" name=\"gpwtxt\" value=\"email\" class=\"email\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </br>\n");
      out.write("                    <tr >\n");
      out.write("                        <td ><input class=\"btn\" type=\"submit\" name=\"submitBtn\" value=\"Login\" /></td>\n");
      out.write("                        <td><input id=\"btn2\" type=\"reset\" name=\"resetBtn\" value=\"Clear\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" >Click here to retrieve your password</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>-->\n");
      out.write("        <div class=\"common\">\n");
      out.write("            ");
 
                Client c3 = (Client)session.getAttribute("p1");
            
      out.write("\n");
      out.write("\n");
      out.write("          <form action=\"AppointmentServlet\" method=\"post\">\n");
      out.write("             <table class=\"box2\">\n");
      out.write("                 <tr>\n");
      out.write("                     <td colspan=\"2\"><h2>Schedule Appointment</h2></td>\n");
      out.write("                 </tr>\n");
      out.write("               <tr>\n");
      out.write("                 <td>Appointment ID :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"apptidtxt\" value=\"2011\" class=\"email\" /></td>\n");
      out.write("               </tr><tr>\n");
      out.write("                 <td>Appointment Day :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"appDytxt\" value=\"YYYY-MM-DD\" class=\"email\" /></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                 <td>Appointment Start Time :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"appSttxt\" value=\"HH:MM\" class=\"email\" /></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                 <td>Appointment End Time :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"appEttxt\" value=\"HH:MM\" class=\"email\" /></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                 <td>Client ID :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"CId\" value=\"");
      out.print(c3.getId());
      out.write("\" class=\"email\" /></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                 <td>Entity ID :</td>\n");
      out.write("                 <td><input type=\"text\" name=\"EId\" value=\"4011\" class=\"email\" /></td>\n");
      out.write("               </tr>\n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                 <td><input class=\"btn\" type=\"submit\" name=\"submitBtn\" value=\"Schedule\" /></td>\n");
      out.write("                 <td><input id=\"btn2\" type=\"reset\" name=\"resetBtn\" value=\"Clear\" /></td>\n");
      out.write("                </tr>\n");
      out.write("              </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <h2>Footer</h2>\n");
      out.write("    </div>\n");
      out.write("\n");
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
