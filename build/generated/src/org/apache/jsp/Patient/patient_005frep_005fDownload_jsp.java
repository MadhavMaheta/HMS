package org.apache.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import java.sql.*;

public final class patient_005frep_005fDownload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<title>Patient Report</title>\n");
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
      out.write("\t\t<!--<link href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/assets/css/styles.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/assets/css/plugins.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"C:/Users/ADMIN/Documents/NetBeansProjects/HMS/web/assets/css/themes/theme-1.css\" id=\"skin_color\" />\n");
      out.write("\t-->\n");
      out.write("\t</head>\n");
      out.write("\t<body class=\"login\" style=\"background-image:url(../backgroung.JPG)\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4\">\n");
      out.write("\t\t\t\t<div class=\"logo margin-top-30\">\n");
      out.write("\t\t\t\t<b><h1>Download Report</h1></b>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"box-login\"></div>\n");
      out.write("\t\t\t\t\t\t\t<br/>\n");
      out.write("                                                        <br/>\n");
      out.write("\t\t\t\t\t<form class=\"form-login\" method=\"post\" action=\"\">\n");
      out.write("\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">Enter user Id:\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"uID\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\"></i> </span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                                                        <div class=\"form-actions\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary pull-right\" name=\"submit\">\n");
      out.write("                                                                        Submit <i class=\"fa fa-arrow-circle-right\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
      out.write("\n");
  
     String userID = request.getParameter("uID");
     if(userID!=null){             
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root",""); 
     Statement stmt=con.createStatement();
    String query = "SELECT * FROM lab_report where userId='"+userID+"';";
ResultSet rs = stmt.executeQuery(query);
if(rs.next()){
java.sql.Blob blob;
blob = rs.getBlob("user_report");
int iLength = (int)(blob.length()); 
response.setHeader("Content-Disposition", "attachment; filename=\"report.pdf\"");
response.setContentType("application/pdf");
response.setContentLength(iLength);
 
ServletOutputStream op = response.getOutputStream();
op.write(blob.getBytes(1, iLength));
op.flush();
op.close();
}else{
out.println("no file exist");
}
     }

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
