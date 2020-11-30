<%--
    Document   : ScheduleAppointment
    Created on : Nov 15, 2020, 11:10:36 PM
    Author     : TimeTech Team
--%>
<%@page import="Business.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>New Entity Entry Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href='schedulesoft.css' rel='stylesheet' type='text/css'>
    </head>
    <body>
    <!-- Header -->
    <div class="header">
        <h1>TIMETECH</h1>
        <p><b>SCHEDULSOFT </b>APPLICATION.</p>
    </div>

    <!-- Navigation Bar -->
    <div class="navbar">
       <a href="index.jsp">HOME</a>
       <!-- <a href="#">Link</a>
        <a href="#">Link</a>
        <a href="#">Link</a>-->
    </div>

    <!-- The flexible grid (content) -->
   <!-- <div class="row">
        <div class="side">
            <h2>LOGIN FORM</h2>
           <!-- <form action="loginServlet" method="post">
                <table class="box">
                    <tr>
                        <td> ID :</td>
                        <td><input type="ID" name="idtxt" value="ID" class="email" /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="gpwtxt" value="email" class="email" /></td>
                    </tr>
                    </br>
                    <tr >
                        <td ><input class="btn" type="submit" name="submitBtn" value="Login" /></td>
                        <td><input id="btn2" type="reset" name="resetBtn" value="Clear" /></td>
                    </tr>
                    </br>
                    <tr>
                        <td colspan="2" >Click here to retrieve your password</td>
                    </tr>
                </table>
            </form>
        </div>-->
        <div class="common">
            <% 
                //Client c3 = (Client)session.getAttribute("p1");
            %>

          <form action="entityinforSevlet" method="post">
             <table class="box2">
                 <tr>
                     <td colspan="2"><h2>Entity Information</h2></td>
                 </tr>
               <tr>
                 <td>Entity ID :</td>
                 <td><input type="text" name="idtxt" value="4011" class="email" /></td>
               </tr><tr>
                 <td>Entity Name :</td>
                 <td><input type="text" name="entxt" value="Uwindsor" class="email" /></td>
               </tr>
               <tr>
                 <td>Entity Email :</td>
                 <td><input type="text" name="emtxt" value="info@uwindsor.ca" class="email" /></td>
               </tr>
               <tr>
                 <td>Entity Phone :</td>
                 <td><input type="text" name="phtxt" value="226789123" class="email" /></td>
               </tr>
               <tr>
                 <td>Entity address :</td>
                 <td><input type="text" name="addtxt" value="2324 Sunset avenue, windsor" class="email" /></td>
               </tr>

               <tr>
                 <td><input class="btn" type="submit" name="submitBtn" value="Submit" /></td>
                 <td><input id="btn2" type="reset" name="resetBtn" value="Clear" /></td>
                </tr>
              </table>
            </form>
        </div>
    </div>

    <!-- Footer -->
    <div class="footer">
        <h2>Footer</h2>
    </div>

    </body>
</html>
