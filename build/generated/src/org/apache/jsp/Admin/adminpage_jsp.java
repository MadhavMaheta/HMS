package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class adminpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Admin  | Dashboard</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/themify-icons/themify-icons.min.css\">\r\n");
      out.write("\t\t<!--<link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/bootstrap-timepicker/bootstrap-timepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("               -->\r\n");
      out.write("\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"background-image:url(../hospital-background-images-hd-1.jpg)\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");

Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8088/hms","root",""); 
Statement st= con.createStatement(); 
String pt=null,dt=null,at=null;
ResultSet resultSet;
String sql ="SELECT count(*) FROM patients_info";
resultSet = st.executeQuery(sql);
while(resultSet.next()){
	pt=Integer.toString(resultSet.getInt(1));
       }

resultSet = st.executeQuery("select count(*) from doc_info");
while(resultSet.next()){
	dt=Integer.toString(resultSet.getInt(1));
}

resultSet = st.executeQuery("select count(*) from apn_info");
while(resultSet.next()){
	at=Integer.toString(resultSet.getInt(1));
}

      out.write("\r\n");
      out.write("\t\t<div id=\"app\">\t\t\r\n");
      out.write("\t\t\t\t<div class=\"main-content\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-content container\" id=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<!-- start: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<section id=\"page-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b><h1 class=\"mainTitle\">Admin | Dashboard</h1></b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<!-- end: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<!-- start: BASIC EXAMPLE -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container-fluid container-fullw bg-white\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-smile-o fa-stack-1x fa-inverse\"></i> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\">Manage Patients</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"links cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"mangptnts.jsp\">Total patients: ");
      out.print(pt);
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-users fa-stack-1x fa-inverse\"></i> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\">Manage Doctors</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"cl-effect-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"mngdoc.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tTotal Doctors: ");
      out.print(dt );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white no-radius text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-2x\"> <i class=\"fa fa-square fa-stack-2x text-primary\"></i> <i class=\"fa fa-terminal fa-stack-1x fa-inverse\"></i> </span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h2 class=\"StepTitle\"> Appointments</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"links cl-effect-1\">\r\n");
      out.write("                                                                                            <a href=\"patient_apnHistory.jsp\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tTotal Appointments :");
      out.print(at );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
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
