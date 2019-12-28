<%-- 
    Document   : patient_registration
    Created on : 12 Sep, 2019, 10:59:36 AM
    Author     : Madhav Maheta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sign up</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css" />
    <script src="main.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.3/semantic.min.js">
    <link rel="stylesheet" href="newser.css">
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css" type="text/css"/>

</head>
<body >
  <!--new user register page-->
<div class="new">
    <form class="ui form" method="post" action="patient_successReg.jsp">
        <br><br>
                <h3 class="ui dividing header">Fill in  Information</h3>
                <div class="field">
                  <div class="two fields">
                    <div class="field">
                    
                  <label>Name</label>
                      <input type="text" name="name" placeholder="Enter your name">
                    </div>
                    <div class="field">
                    
                  <label>Password</label>
                      <input type="text" name="pwd" placeholder="Enter a password">
                    </div>
                   
                  </div>
                </div>
                <div class="two fields">
                  <div class="field">
                    <label>Contact number</label>
                    <input type="number" name="pno" placeholder="phone number">
                    
                  </div>
                  <div class="field">
                    <label for="pemail">Email id</label>
                    <input type="text" name="pemail" id="pemail" placeholder="email id">
                  </div>
                </div>
                <div class= "three fields">
                    <div class="field">
                  <label>Patient Address</label>
                    <input type="text" name="street" placeholder="Street Address">
                    </div>
                    <div class=" field">
                      <label for="area">Locality/Area</label>
                      <input type="text" name="area" id="area" placeholder="Area">
                    </div>
                    <div class="field">
                      <label for="aadhar">Aadhaar</label>
                      <input type="number" name="aadhar" id="aadhar" placeholder="Aadhaar Number">
                    </div>
                 
                </div>
                <div class="two fields">
                  <div class="field">
                    <label>State</label>
                    <select class="ui fluid dropdown" name="state">
                      <option value="state" >State</option>
                  <option value="AP">Andhra Pradesh</option>
                  <option value="Arunachal">Arunachal pradesh</option>
                  <option value="Assam">Assam</option>
                  <option value="KA">Karnataka</option>
                  <option value="GJ">Gujarat</option>
                  <option value="RJ">Rajasthan</option>
                  <option value="MH">Maharashtra</option>
                  <option value="DL">Delhi</option>
                  <option value="GA">Goa</option>
                  <option value="UP">UttarPradesh</option>
                  </select>
                  </div>
                  <div class="field">
                    <label>Country</label>
                   <div class="field">
                    
                    <select class="ui fluid dropdown" name="country">
                      <option value="country">Country</option>
                  <option value="India">India</option>
                    </select>
                  </div>
                     </div>
                  </div>
                <a href="patient_successReg.jsp">
                   <center><button  class="ui green button">Submit ></button></center>
                    </a>
       
              </form>
            </div>  
</body>
</html>