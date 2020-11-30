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
        <title>Schedule Appointment</title>
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
        <a href="clientPage.jsp">My Page</a>
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
                Client c3 = (Client)session.getAttribute("p1");
            %>

          <form action="AppScheduleSevlet" method="post">
             <table class="box2">
                 <tr>
                     <td colspan="2"><h2>Schedule Appointment</h2></td>
                 </tr>
               <tr>
                 <td>Appointment ID :</td>
                 <td><input type="text" name="Idtxt" value="2011" class="email" /></td>
               </tr><tr>
                 <td>Appointment Day :</td>
                 <td><input type="text" name="Dytxt" value="YYYY-MM-DD" class="email" /></td>
               </tr>
               <tr>
                 <td>Appointment Start Time :</td>
                 <td><input type="text" name="Sttxt" value="HH:MM" class="email" /></td>
               </tr>
               <tr>
                 <td>Appointment End Time :</td>
                 <td><input type="text" name="Ettxt" value="HH:MM" class="email" /></td>
               </tr>
               <tr>
                 <td>Client ID :</td>
                 <td><input type="text" name="CIdtxt" value="<%=c3.getId()%>" class="email" /></td>
               </tr>
               <tr>
                 <td>Entity ID :</td>
                 <td><input type="text" name="EIdtxt" value="4011" class="email" /></td>
               </tr>

               <tr>
                 <td><input class="btn" type="submit" name="submitBtn" value="Schedule" /></td>
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
