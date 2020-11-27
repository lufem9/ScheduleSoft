<%-- 
    Document   : ErrorPage
    Document   : index
    Created on : Nov 15, 2020, 11:10:36 PM
    Author     : Femi
--%>

<%@page import="Business.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <title>Error Page</title>
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
            <a href="Login.jsp">LOGIN</a>
            <!--<a href="#">Link</a>
            <a href="#">Link</a>
            <a href="#">Link</a>-->
        </div> 
        <div class="common" >
            <%  
                //HttpSession ses1;
                //ses1=request.getSession();
                //Client c1=(Client)ses1.getAttribute("c1");
                String info = "your ID or password is not correct";
            %>
        <table class="box">
                <tr>
                      <td colspan="2"><h1>Error Page</h1></td>
                </tr>
                <tr>
                  <td colspan="2"><%=  "Hello " +/* c1.getFirstName()+ ",  " +*/ info%></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
                <tr>
                      <td colspan="2"></td>
                </tr>
            </table>
            
        </div>     
            <!-- Footer -->
            <div class="footer">
                <h2>Footer</h2>
            </div>
    </body>
</html>
