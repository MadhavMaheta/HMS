package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t\t<title>Hospital Management System</title>\n");
      out.write("\t\t<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n");
      out.write("\t\t<link href='http://fonts.googleapis.com/css?family=Ropa+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css\">\n");
      out.write("\t\t<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\t\t  <script>\n");
      out.write("\t\t \n");
      out.write("\t\t\t    $(function () {\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t      // Slideshow 1\n");
      out.write("\t\t\t      $(\"#slider1\").responsiveSlides({\n");
      out.write("\t\t\t        maxwidth: 1600,\n");
      out.write("\t\t\t        speed: 600\n");
      out.write("\t\t\t      });\n");
      out.write("\t\t\t});\n");
      out.write("\t\t  </script>\n");
      out.write("\t\t  <style>\n");
      out.write("\t\t  \n");
      out.write("p.sansserif {\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write(".Box-body:last-of-type {\n");
      out.write(" border-style:solid;\n");
      out.write(" border-color:black;\n");
      out.write("    border-bottom-left-radius: 2px;\n");
      out.write("    border-bottom-right-radius: 2px;\n");
      out.write("    margin-bottom: -1px;\n");
      out.write("     border-width:1px;\n");
      out.write("}\n");
      out.write(".markdown-body {\n");
      out.write("    font-family: -apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol;\n");
      out.write("    font-size: 16px;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    word-wrap: break-word;\n");
      out.write("}\n");
      out.write("\t\t  .div1 {\n");
      out.write("\t\t  width:940px;\n");
      out.write("\t\t  height:130px;\n");
      out.write("\t\t border-radius:10px;\n");
      out.write("\t\t border-style:outset;\n");
      out.write("\t\t  Background-color: white;\n");
      out.write("\t\tborder-color:black;\n");
      out.write("\t\t  border-width:5px;\n");
      out.write("\t\t  \n");
      out.write("\t\t  }\n");
      out.write("\t\t  .p-6 {\n");
      out.write("    padding: 40px!important;\n");
      out.write("}\n");
      out.write("\t footer {\n");
      out.write("        position: relative;\n");
      out.write("        height: 90px;\n");
      out.write("        width: 100%;\n");
      out.write("        background-color: #47BB8F;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    p.copyright {\n");
      out.write("        position: absolute;\n");
      out.write("        width: 100%;\n");
      out.write("        color: #fff;\n");
      out.write("        line-height: 60px;\n");
      out.write("        font-size: 1em;\n");
      out.write("        text-align: center;\n");
      out.write("        bottom:0;\n");
      out.write("    }\t  </style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("<div class=\"ui container first\">\n");
      out.write("    <div class=\"ui center aligned teal inverted segment\">\n");
      out.write("        <font color=\"black\"><h1 class=\"header\" id=\"nam\">e-HealthCare System</h1></font>\n");
      out.write("    </div>\n");
      out.write("  <div class=\"clear\"> </div>\n");
      out.write("\t\t\t<!--start-image-slider---->\n");
      out.write("\t\t\t\t\t<div class=\"image-slider\">\n");
      out.write("\t\t\t\t\t\t<!-- Slideshow 1 -->\n");
      out.write("\t\t\t\t\t    <!--<ul class=\"rslides\" id=\"slider1\">\n");
      out.write("\t\t\t\t\t      <li><img src=\"images/slider-image1.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t      <li><img src=\"images/slider-image2.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t      <li><img src=\"http://www.pffamilymedicine.com/site_media/media/bgslider/images/thumbs/1200x450/Homepage_1.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t      <li><img src=\"http://www.cfsmortgage.com/wp-content/uploads/2017/04/Doctor1-1200x450.jpg\" alt=\"\"></li>\n");
      out.write("\t\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t-->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!--End-image-slider---->\n");
      out.write("\t\t    <div class=\"clear\"> </div>\n");
      out.write("   <div class=\"ui  horizontal segments\">\n");
      out.write("    <div class=\"ui  teal inverted segment\">\n");
      out.write("        <div class=\"admin\">\n");
      out.write("            <div class=\"ui icon\">\n");
      out.write("                    <i class=\" large user  icon\"></i>Admin login\n");
      out.write("                    <a href=\"Admin/admin_login.jsp\">\n");
      out.write("                   <button  class=\"ui blue button\">LOGIN</button>\n");
      out.write("                    </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"doctor\">\n");
      out.write("        <div class=\"ui teal inverted segment\">\n");
      out.write("            <div class=\"ui icon\">\n");
      out.write("                <i class=\"ui large user md icon\"></i>Doctor login\n");
      out.write("                <a href=\"Doctor/doctor_Login.jsp\">\n");
      out.write("                    <button class=\"ui blue button\"> LOGIN</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>   \n");
      out.write("    <div class=\"ui  right aligned teal inverted segment\">   \n");
      out.write("        <div class=\"user\">\n");
      out.write("            <div class=\"ui icon\">\n");
      out.write("                <i class=\"ui  large users icon\"></i>Patient login\n");
      out.write("                <a href=\"Patient/patient_login.jsp\">\n");
      out.write("                    <button class=\"ui blue button\">LOGIN</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"ui  right aligned teal inverted segment\">   \n");
      out.write("        <div class=\"Labo\">\n");
      out.write("            <div class=\"ui icon\">\n");
      out.write("                <i class=\"ui  large users icon\"></i>Laboratory login\n");
      out.write("                <a href=\"Lab/labo_Login.jsp\">\n");
      out.write("                    <button class=\"ui blue button\">LOGIN</button>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("  \n");
      out.write("  </div>   \n");
      out.write("\n");
      out.write("  <div class=\"Box-body p-6\">\n");
      out.write("        <article class=\"markdown-body entry-content\" itemprop=\"text\"><h1>Hospital Management System</h1>\n");
      out.write("</article>\n");
      out.write("</div>\n");
      out.write("  <br><br><footer>\n");
      out.write("    <p class=\"copyright\">© e-HealthCare | All rights reserved.</p>\n");
      out.write("</footer>\n");
      out.write("</div>   \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
