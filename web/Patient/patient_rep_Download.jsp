<%-- 
    Document   : down_rep
    Created on : 13 Sep, 2019, 8:35:47 AM
    Author     : Madhav Maheta
--%>
<%@page import="java.io.File"%>
<%@ page import ="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Patient Report</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<link href="http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="../vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="../vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="../vendor/themify-icons/themify-icons.min.css">
		
	</head>
	<body class="login" style="background-image:url(../backgroung.JPG)">
		<div class="row">
			<div class="main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
				<div class="logo margin-top-30">
				<b><h1>Download Report</h1></b>
				</div>

				<div class="box-login"></div>
							<br/>
                                                        <br/>
					<form class="form-login" method="post" action="">
						<fieldset>
							<div class="form-group">
								<span class="input-icon">Enter user Id:
									<input type="text" class="form-control" name="uID" placeholder="Username">
									<i class="fa fa-user"></i> </span>
							</div>
							
                                                        <div class="form-actions">
								
								<button type="submit" class="btn btn-primary pull-right" name="submit">
                                                                        Submit <i class="fa fa-arrow-circle-right"></i>
								</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>

<%  
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
%>