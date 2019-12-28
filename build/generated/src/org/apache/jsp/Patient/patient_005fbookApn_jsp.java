package org.apache.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class patient_005fbookApn_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>User  | Book Appointment</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\t\t-<link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link href=\"../vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/bootstrap-touchspin/jquery.bootstrap-touchspin.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/bootstrap-datepicker/bootstrap-datepicker3.standalone.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"../vendor/bootstrap-timepicker/bootstrap-timepicker.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("\t\t\r\n");
      out.write("                <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../vendor/themify-icons/themify-icons.min.css\">\r\n");
      out.write("\t\t<style>\r\n");
      out.write("                    .container{\r\n");
      out.write("                        padding-right: 250px;\r\n");
      out.write("                    }\r\n");
      out.write("                    </style>\r\n");
      out.write("                <script>\r\n");
      out.write("                    $(function() \r\n");
      out.write("                    {\r\n");
      out.write("                            $(\"#datepicker\").datepicker({ minDate: -210, maxDate: -1 });\r\n");
      out.write("                     });\r\n");
      out.write("                </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body style=\"background-image:url(https://www.elegantthemes.com/blog/wp-content/uploads/2013/09/bg-9-full.jpg)\">\r\n");
      out.write("\t\t<div id=\"app\">\t\t\r\n");
      out.write("\t\t\t\t<!-- end: TOP NAVBAR -->\r\n");
      out.write("\t\t\t\t<div class=\"main-content\" >\r\n");
      out.write("\t\t\t\t\t<div class=\"wrap-content container\" id=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<!-- start: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<section id=\"page-title\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-sm-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h1 class=\"mainTitle\">User | Book Appointment</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>User</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li class=\"active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>Book Appointment</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\t\t\t<!-- end: PAGE TITLE -->\r\n");
      out.write("\t\t\t\t\t\t<!-- start: BASIC EXAMPLE -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"container-fluid container-fullw bg-white\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"row margin-top-30\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-8 col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel panel-white\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<h5 class=\"panel-title\">Book Appointment</h5>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<form method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"AppointmentName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tName\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("<input class=\"form-control datepicker\" name=\"pname\"  required=\"required\" >\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("                                                                                                            <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"DoctorSpecialization\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDoctor Specialization\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"dspec\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">Select Specialization</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Brain surgery\">Brain surgery</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Heart surgery\">Heart surgery</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Plastic surgery\">Plastic surgery</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Cancer treatment\">Cancer treatment</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"Basic treatment\">Basic treatment</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"doctor\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDoctors\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"dname\" class=\"form-control\" required=\"required\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<option value=\"\">Select Doctor</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Doc1\">Doc1</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Doc2\">Doc2</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"Doc3\">Doc3</option>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"AppointmentDate\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDate\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("<input class=\"form-control datepicker\" name=\"date\"  required=\"required\" data-date-format=\"yyyy-mm-dd\"><b>Format: YYYY-MM-DD</b>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<label for=\"Appointmenttime\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTime\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t<input class=\"form-control\" name=\"time\" id=\"timepicker1\" required=\"required\"><b>Format: HH:MM:SS.SS in 24hr format</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" name=\"submit\" class=\"btn btn-o btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSubmit\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
      out.write(" \r\n");

        String dname=request.getParameter("dname");
	String date=request.getParameter("date");
	String time=request.getParameter("time");
	String dspec=request.getParameter("dspec");
	String pname=request.getParameter("pname");
        if(dname!=null && date!=null && time!=null && dspec!=null && pname!=null)
        {
              
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root",""); 
        Statement st= con.createStatement(); 
        int i=st.executeUpdate("insert into apn_info values ('"+pname+"','"+dname+"','"+dspec+"','"+date+"','"+time+"')"); 
          if(i>0)
          {
                 response.sendRedirect("patient_success_book.html");
          }
        } 

      out.write("      ");
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
