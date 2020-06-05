<%-- 
    Document   : index
    Created on : 15 Jul, 2019, 5:48:06 PM
    Author     : Madhav Maheta
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Hospital Management System</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
        <link href='http://fonts.googleapis.com/css?family=Ropa+Sans' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script src="js/responsiveslides.min.js"></script>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script>

            $(function () {

                // Slideshow 1
                $("#slider1").responsiveSlides({
                    maxwidth: 1600,
                    speed: 600
                });
            });
        </script>
        <style>

            p.sansserif {
                font-family: Arial, Helvetica, sans-serif;
            }
            .Box-body:last-of-type {
                border-style:solid;
                border-color:black;
                border-bottom-left-radius: 2px;
                border-bottom-right-radius: 2px;
                margin-bottom: -1px;
                border-width:1px;
            }
            .markdown-body {
                font-family: -apple-system,BlinkMacSystemFont,Segoe UI,Helvetica,Arial,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol;
                font-size: 16px;
                line-height: 1.5;
                word-wrap: break-word;
            }
            .div1 {
                width:940px;
                height:130px;
                border-radius:10px;
                border-style:outset;
                Background-color: white;
                border-color:black;
                border-width:5px;

            }
            .p-6 {
                padding: 40px!important;
            }
            footer {
                position: relative;
                height: 90px;
                width: 100%;
                background-color: #47BB8F;
            }

            p.copyright {
                position: absolute;
                width: 100%;
                color: #fff;
                line-height: 60px;
                font-size: 1em;
                text-align: center;
                bottom:0;
            }	  </style>
    </head>
    <body>
        <div class="ui container first">
            <div class="ui center aligned teal inverted segment">
                <font color="black"><h1 class="header" id="nam">e-HealthCare System</h1></font>
            </div>
            <div class="clear"> </div>
            <!--start-image-slider---->
            <div class="image-slider">
              
            </div>
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel"  class="active"></li>
                    <li data-target="#myCarousel" ></li>
                    <li data-target="#myCarousel" ></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner">
                    <div class="item active">
                      <a  href="https://www.covid19india.org/"  target="_blank">  <img style="width: 100%; height: 300px;" src="assets/images/adam-niescioruk-Z9arfr0f248-unsplash.jpg" alt=""/>
                       </a>
                    </div>

                    <div class="item">
                        <img style="width: 100%; height: 300px;" src="assets/images/hush-naidoo-yo01Z-9HQAw-unsplash.jpg" alt=""/>
                       
                    </div>

                    <div class="item">
                        <img  style="width: 100%; height: 300px;" src="assets/images/online-marketing-hIgeoQjS_iE-unsplash.jpg" alt=""/>
                        <a href="../../../../AppData/Local/Temp/photo-1505751172876-fa1923c5c528.webp"></a>
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <!--End-image-slider---->
            <div class="clear"> </div>
            <div class="ui  horizontal segments">
                <div class="ui  teal inverted segment">
                    <div class="admin">
                        <div class="ui icon">
                            <i class=" large user  icon"></i>Admin login
                            <a href="Admin/admin_login.jsp">
                                <button  class="ui blue button">LOGIN</button>
                            </a>
                        </div>
                    </div>
                </div> 
                <div class="doctor">
                    <div class="ui teal inverted segment">
                        <div class="ui icon">
                            <i class=" large user icon"></i>Doctor login
                            <a href="Doctor/doctor_Login.jsp">
                                <button class="ui blue button"> LOGIN</button>
                            </a>
                        </div>
                    </div>
                </div>   
                <div class="ui  right aligned teal inverted segment">   
                    <div class="user">
                        <div class="ui icon">
                            <i class="ui  large users icon"></i>Patient login
                            <a href="Patient/patient_login.jsp">
                                <button class="ui blue button">LOGIN</button>
                            </a>
                        </div>
                    </div>
                </div>
                <div class="ui  right aligned teal inverted segment">   
                    <div class="Labo">
                        <div class="ui icon">
                            <i class="ui  large users icon"></i>Laboratory login
                            <a href="Lab/labo_Login.jsp">
                                <button class="ui blue button">LOGIN</button>
                            </a>
                        </div>
                    </div>
                </div>  

            </div>   

            <div class="Box-body p-6">
                <center>
                <article class="markdown-body entry-content" itemprop="text"><h1>Hospital Management System</h1>
                </article>
                </center>
            </div>
            <br><br><footer>
                <p class="copyright">© e-HealthCare | All rights reserved.</p>
            </footer>
        </div>   

    </body>
</html>