<%-- 
    Document   : patient_apnHistory
    Created on : 13 Aug, 2019, 3:02:50 PM
    Author     : Madhav Maheta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>History</title>
    </head>
    
    <body style="background-image:url(https://www.elegantthemes.com/blog/wp-content/uploads/2013/09/bg-9-full.jpg)">
    <center>
        <h1>Patient's History</h1>
        <table style=" border-color: white ;width: 30%; background-color: lightblue "  border="1">
            <tr>
                <td>Doc Name</td>
                <td>Specification</td>
                <td>Date</td>
                <td>Time</td>
                
            </tr>
            <%
               Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_database","root","");
               Statement stmt=con.createStatement();
              
              String name=(String)session.getAttribute("userName");  
              
              ResultSet rs=stmt.executeQuery("SELECT * from apn_info WHERE pname='"+name+"' ");
              while(rs.next())
              {
                  out.print("<tr><td>"+rs.getString(2)+"</td>");
                  out.print("<td>"+rs.getString(3)+"</td>");
                  out.print("<td>"+rs.getString(4)+"</td>");
                  out.print("<td>"+rs.getString(5)+"</td></tr>");
                  
              }
           %>
        </table>
        </center>
    </body>
</html>
