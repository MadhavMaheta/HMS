package org.apache.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class patient_005flogin_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User login</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"limiter\">\n");
      out.write("\t<div class=\"container-login100\">\n");
      out.write("\t    <div class=\"wrap-login100\">\n");
      out.write("\t\t<div class=\"card-heading\">Login</div>\n");
      out.write("       \n");
      out.write("            <div class=\"wrap-input100 validate-input m-b-16\">\n");
      out.write("        <form method=\"post\" action=\"\" name=\"laboReg\" class=\"login100-form validate-form p-l-55 p-r-55 p-t-178\">\n");
      out.write("             <p>Login</p>\n");
      out.write("             Enter username:<input type=\"text\" name=\"userUname\"/><br/>\n");
      out.write("             Enter password:<input type=\"text\" name=\"userPass\"/><br/>\n");
      out.write("               <input type=\"submit\" name=Submit\" value=\"submit\"/>\n");
      out.write("         </form>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        <a href=\"\">About us</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
 
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root","");
               Statement stmt=con.createStatement();
               
               String user_uName = request.getParameter("userUname");
               String user_Pass = request.getParameter("userPass");
              if(user_uName!=null && user_Pass!=null){
                
                  session.setAttribute("userName",user_uName); 
               
                  ResultSet rs=stmt.executeQuery("SELECT * from patients_info WHERE name='"+user_uName+"' AND password='"+user_Pass+"' ");
                      while(rs.next()){
                            response.sendRedirect("welcome_patient.jsp");
                            return;
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
