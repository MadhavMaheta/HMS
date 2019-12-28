package org.apache.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class welcome_005fpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Patient  | Dashboard</title>\n");
      out.write("\t\t<meta charset=\"utf-8\" />\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/themify-icons/themify-icons.min.css\">\n");
      out.write("\t\t<!--<link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"vendor/bootstrap-timepicker/bootstrap-timepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\n");
      out.write("               -->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body style=\"background-image:url(../hospital-background-images-hd-1.jpg)\">\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<div id=\"app\">\t\t\n");
      out.write("\t<div class=\"main-content\" >\n");
      out.write("\t\t\t\t\t<div class=\"wrap-content container\" id=\"container\">\n");
      out.write("\t\t\t\t\t\t<!-- start: PAGE TITLE -->\n");
      out.write("\t\t\t\t\t\t<section id=\"page-title\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-8\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<b><h1 class=\"mainTitle\">Patient | Dashboard</h1></b>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</section>\n");
      out.write("\t\t\t\t\t\t<!-- end: PAGE TITLE -->\n");
      out.write("\t\t\t\t\t\t<!-- start: BASIC EXAMPLE -->\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-fluid container-fullw bg-white\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-smile-o fa-stack-1x fa-inverse\"></i> </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\">Manage Profile</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"links cl-effect-1\">\n");
      out.write("                                                                                            <a href=\"update_Profile.jsp\">My Profile</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-users fa-stack-1x fa-inverse\"></i> </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\">Manage Appointment</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"cl-effect-1\">\n");
      out.write("                                                                                            <a href=\"manage_Apn.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t          Watch appointment history/Book appointment\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t \t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-terminal fa-stack-1x fa-inverse\"></i> </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\"> View Report</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"links cl-effect-1\">\n");
      out.write("                                                                                            <a href=\"patient_apnHistory.jsp\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t        View your report \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
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
