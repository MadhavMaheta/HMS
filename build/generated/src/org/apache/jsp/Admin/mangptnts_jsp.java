package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class mangptnts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>Admin | Manage Patients</title>\r\n");
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
      out.write("\t-->\r\n");
      out.write("        </head>\r\n");
      out.write("\t<body style=\"background-image:url(../hospital-background-images-hd-1.jpg)\">\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String id = request.getParameter("id");
String userID=null;
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "hospital_database";
String userId = "root";
String password = "";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\r\n");
      out.write("\t\t<div id=\"app\">\t\t\r\n");
      out.write("\t\t\t<div class=\"app-content\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- end: TOP NAVBAR -->\r\n");
      out.write("\t\t\t\t<div class=\"main-content\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-content container\" id=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<!-- start: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<section id=\"page-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 class=\"mainTitle\">Admin | Manage Patients</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<!-- end: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<!-- start: BASIC EXAMPLE -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container-fluid container-fullw bg-white\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h5 class=\"over-title margin-bottom-15\">Manage <span class=\"text-bold\">Patients</span></h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p style=\"color:red;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table table-hover\" id=\"sample-table-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t<th><b>Name</b></th>\r\n");
      out.write("\t<th><b>Email</b></th>\r\n");
      out.write("\t<th><b>Contact_no</b></th>\r\n");
      out.write("\t<th><b>Street</b></th>\r\n");
      out.write("\t<th><b>Locality</b></th>\r\n");
      out.write("\t<th><b>Aadhar No.</b></th>\r\n");
      out.write("\t<th><b>State</b></th>\r\n");
      out.write("\t<th><b>Country</b></th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM patients_info";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("name") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("email") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("contact_no") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("street") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("locality") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("aadhar") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("state") );
      out.write("</td>\r\n");
      out.write("<td>");
      out.print(resultSet.getString("country") );
      out.write("</td>\r\n");
      out.write("<td><a href=\"delptnt.jsp?uname='");
      out.print(resultSet.getString("name"));
      out.write("'\">Delete</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t");

}

} catch (Exception e){
e.printStackTrace();
}

      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</body>\r\n");
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
