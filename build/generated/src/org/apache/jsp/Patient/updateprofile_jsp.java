package org.apache.jsp.Patient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class updateprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String Name = (String)session.getAttribute("Name");
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
      out.write("  <!--new user register page-->\r\n");
      out.write("<div class=\"new\">\r\n");
      out.write("        <form class=\"ui form\" method=\"post\" action=\"successupdate.jsp?Name=");
      out.print(Name);
      out.write("\">\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <h1>User | Update profile</h1><br>\r\n");
      out.write("                <h3 class=\"ui dividing header\">Fill in  Information</h3>\r\n");
      out.write("                <div class=\"field\">\r\n");
      out.write("                  <div class=\"two fields\">\r\n");
      out.write("                    <div class=\"field\">\r\n");

try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM patients_info where name='"+Name+"'";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                  <label>Name</label>\r\n");
      out.write("                      <input type=\"text\" name=\"name\" placeholder=\"Enter your name\" value=\"");
      out.print(resultSet.getString("name") );
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"field\">\r\n");
      out.write("                    \r\n");
      out.write("                  <label>Password</label>\r\n");
      out.write("                      <input type=\"text\" name=\"pwd\" placeholder=\"Enter a password\" value=\"");
      out.print(resultSet.getString("password") );
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"two fields\">\r\n");
      out.write("                  <div class=\"field\">   \r\n");
      out.write("                    <label>Contact number</label>\r\n");
      out.write("                    <input type=\"number\" name=\"pno\" placeholder=\"phone number\" value=\"");
      out.print(resultSet.getString("contact_no") );
      out.write("\">\r\n");
      out.write("                    \r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"field\">\r\n");
      out.write("                    <label for=\"\">Email id</label>\r\n");
      out.write("                    <input type=\"text\" name=\"pemail\" placeholder=\"email id\" value=\"");
      out.print(resultSet.getString("email") );
      out.write("\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class= \"three fields\">\r\n");
      out.write("                    <div class=\"field\">\r\n");
      out.write("                  <label>Patient Address</label>\r\n");
      out.write("                    <input type=\"text\" name=\"street\" placeholder=\"Street Address\" value=\"");
      out.print(resultSet.getString("street") );
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\" field\">\r\n");
      out.write("                      <label for=\"\">locality/Area</label>\r\n");
      out.write("                      <input type=\"text\" name=\"area\" placeholder=\"Area\" value=\"");
      out.print(resultSet.getString("locality") );
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"field\">\r\n");
      out.write("                      <label for=\"\">Adhaar number</label>\r\n");
      out.write("                      <input type=\"number\" name=\"aadhar\" placeholder=\"adhaar number\" value=\"");
      out.print(resultSet.getString("aadhar") );
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                 \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"two fields\">\r\n");
      out.write("                  <div class=\"field\">\r\n");
      out.write("                    <label>State</label>\r\n");
      out.write("                    <select class=\"ui fluid dropdown\" name=\"state\">\r\n");
      out.write("                      <option value=\"");
      out.print(resultSet.getString("state") );
      out.write("\" >State</option>\r\n");
      out.write("                  <option value=\"AP\">Andhra</option>\r\n");
      out.write("                  <option value=\"Arunachal\">Arunachal pradesh</option>\r\n");
      out.write("                  <option value=\"Assam\">Assam</option>\r\n");
      out.write("                  <option value=\"KA\">Karnataka</option>\r\n");
      out.write("                  <option value=\"CA\">California</option>\r\n");
      out.write("                  <option value=\"CO\">Colorado</option>\r\n");
      out.write("                  <option value=\"CT\">Connecticut</option>\r\n");
      out.write("                  <option value=\"DE\">Delaware</option>\r\n");
      out.write("                  <option value=\"DC\">District Of Columbia</option>\r\n");
      out.write("                  <option value=\"FL\">Florida</option>\r\n");
      out.write("                  <option value=\"GA\">Georgia</option>\r\n");
      out.write("                  <option value=\"HI\">Hawaii</option>\r\n");
      out.write("                  <option value=\"ID\">Idaho</option>\r\n");
      out.write("                  <option value=\"IL\">Illinois</option>\r\n");
      out.write("                  <option value=\"IN\">Indiana</option>\r\n");
      out.write("                  <option value=\"IA\">Iowa</option>\r\n");
      out.write("                  <option value=\"KS\">Kansas</option>\r\n");
      out.write("                  <option value=\"KY\">Kentucky</option>\r\n");
      out.write("                  <option value=\"LA\">Louisiana</option>\r\n");
      out.write("                  <option value=\"ME\">Maine</option>\r\n");
      out.write("                  <option value=\"MD\">Maryland</option>\r\n");
      out.write("                  <option value=\"MA\">Massachusetts</option>\r\n");
      out.write("                  <option value=\"MI\">Michigan</option>\r\n");
      out.write("                  <option value=\"MN\">Minnesota</option>\r\n");
      out.write("                  <option value=\"MS\">Mississippi</option>\r\n");
      out.write("                  <option value=\"MO\">Missouri</option>\r\n");
      out.write("                  <option value=\"MT\">Montana</option>\r\n");
      out.write("                  <option value=\"NE\">Nebraska</option>\r\n");
      out.write("                  <option value=\"NV\">Nevada</option>\r\n");
      out.write("                  <option value=\"NH\">New Hampshire</option>\r\n");
      out.write("                  <option value=\"NJ\">New Jersey</option>\r\n");
      out.write("                  <option value=\"NM\">New Mexico</option>\r\n");
      out.write("                  <option value=\"NY\">New York</option>\r\n");
      out.write("                  <option value=\"NC\">North Carolina</option>\r\n");
      out.write("                  <option value=\"ND\">North Dakota</option>\r\n");
      out.write("                  <option value=\"OH\">Ohio</option>\r\n");
      out.write("                  <option value=\"OK\">Oklahoma</option>\r\n");
      out.write("                  <option value=\"OR\">Oregon</option>\r\n");
      out.write("                  <option value=\"PA\">Pennsylvania</option>\r\n");
      out.write("                  <option value=\"RI\">Rhode Island</option>\r\n");
      out.write("                  <option value=\"SC\">South Carolina</option>\r\n");
      out.write("                  <option value=\"SD\">South Dakota</option>\r\n");
      out.write("                  <option value=\"TN\">Tennessee</option>\r\n");
      out.write("                  <option value=\"TX\">Texas</option>\r\n");
      out.write("                  <option value=\"UT\">Utah</option>\r\n");
      out.write("                  <option value=\"VT\">Vermont</option>\r\n");
      out.write("                  <option value=\"VA\">Virginia</option>\r\n");
      out.write("                  <option value=\"WA\">Washington</option>\r\n");
      out.write("                  <option value=\"WV\">West Virginia</option>\r\n");
      out.write("                  <option value=\"WI\">Wisconsin</option>\r\n");
      out.write("                  <option value=\"WY\">Wyoming</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"field\">\r\n");
      out.write("                    <label>Country</label>\r\n");
      out.write("                   <div class=\"field\">\r\n");
      out.write("                    \r\n");
      out.write("                    <select class=\"ui fluid dropdown\" name=\"country\">\r\n");
      out.write("                      <option value=\"");
      out.print(resultSet.getString("country") );
      out.write("\">Country</option>\r\n");
      out.write("                  <option value=\"India\">India</option>\r\n");
      out.write("                  <option value=\"Bangladesh\">Bangaldesh</option>\r\n");
      out.write("                  <option value=\"Pakistan\">Pakistan</option>\r\n");
      out.write("                  <option value=\"Srilanka\">Srilanka</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("                     </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  ");

}

} catch (Exception e){
e.printStackTrace();
}

      out.write("\r\n");
      out.write("               <center><a href=\"successupdate.jsp\">\r\n");
      out.write("                   <button  class=\"ui green button\">Submit ></button></a>\r\n");
      out.write("                  \r\n");
      out.write("                   </center>\r\n");
      out.write("                    \r\n");
      out.write("       \r\n");
      out.write("              </form>\r\n");
      out.write("            </div>  \r\n");
      out.write("</body>\r\n");
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
