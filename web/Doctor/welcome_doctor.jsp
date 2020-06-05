<%-- 
    Document   : welcome_doctor
    Created on : 11 Sep, 2019, 12:39:33 PM
    Author     : Madhav Maheta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Patient  | Dashboard</title>
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
	<body style="background-image:url(../hospital-background-images-hd-1.jpg)">
	<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<div id="app">		
	<div class="main-content">
					<div class="wrap-content container" id="container">
						<!-- start: PAGE TITLE -->
						<section id="page-title">
							<div class="row">
								<div class="col-sm-8">
									<b><h1 class="mainTitle">Doctor | Dashboard</h1></b>																	</div>
							</div>
						</section>
						<!-- end: PAGE TITLE -->
						<!-- start: BASIC EXAMPLE -->
							<div class="container-fluid container-fullw bg-white">
							<div class="row">
								<!--<div class="col-sm-4">
									<div class="panel panel-white no-radius text-center">
										<div class="panel-body">
											<span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-primary"></i> <i class="fa fa-smile-o fa-stack-1x fa-inverse"></i> </span>
											<h2 class="StepTitle">Manage Profile</h2>
											
											<p class="links cl-effect-1">
                                                                                            <a href="update_Profile.jsp">My Profile</a>
											</p>
										</div>
									</div>
								</div>
								-->
								<div class="col-sm-4">
									<div class="panel panel-white no-radius text-center">
										<div class="panel-body">
											<span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-primary"></i> <i class="fa fa-users fa-stack-1x fa-inverse"></i> </span>
											<h2 class="StepTitle">View Appointments</h2>
										
											<p class="cl-effect-1">
                                                                                            <a href="doc_apn.jsp">
											          Watch appointment
												</a>
												
											</p>
										</div>
									</div>
								</div>
							        <div class="col-sm-4">
									<div class="panel panel-white no-radius text-center">
										<div class="panel-body">
											<span class="fa-stack fa-2x"> <i class="fa fa-square fa-stack-2x text-primary"></i> <i class="fa fa-users fa-stack-1x fa-inverse"></i> </span>
											<h2 class="StepTitle">View Patient Reports</h2>
										
											<p class="cl-effect-1">
                                                                                            <a href="../Patient/patient_rep_Download.jsp">
											          Watch appointment
												</a>
												
											</p>
										</div>
									</div>
								</div>
							
							</div>
						</div>
                                        </div>
				</div>
			</div>
			
		</div>
	</body>
</html>