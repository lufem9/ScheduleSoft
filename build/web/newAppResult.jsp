<<%-- 
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
    <title>Appointment Result Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href='clientpage.css' rel='stylesheet' type='text/css'>
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
            <!--<a href="#">Link</a>
            <a href="#">Link</a>
            <a href="#">Link</a>-->
        </div> 
        <%
              session=request.getSession();
              Client c1=(Client)session.getAttribute("p1");
              //session.setAttribute("p1",c1);
              String info = "You have successfully creat new Entity";
            %>
        <!-- The flexible grid (content) -->
        <div class="row">
            <div class="side">
                <h2>CLIENT DETAILS</h2>
                <table>
                    <tr>
                        <th>Client ID</th>
                        <td><%=c1.getId() %></td>
                    </tr>
                    <tr>
                        <th>First Name</th>
                        <td><%=c1.getFirstName() %></td>
                    </tr>
                    <tr>
                        <th>First Name</th>
                        <td><%=c1.getLastName() %></td>
                    </tr>
                    <tr>
                        <th> Email </th>
                        <td><%=c1.getEmail()%></td>
                    </tr>
                    <tr>
                        <th> Address </th>
                        <td><%=c1.getAddress() %></td>
                    </tr>
                </table>
            </div>
        <div class="main" >
             <h2>New Appointment Schedule Confirmation Page</h2>
        <table class="box">
                <tr>
                  <td colspan="2"><%=  "Hello ,"+ c1.getFirstName()%></td>
                </tr>
                <tr>
                      <td colspan="2"><%= info%></td>
                </tr>
            </table>
            
        </div>   
    </div>
            <!-- Footer -->
            <div class="footer">
                <h2>Footer</h2>
            </div>
    </body>
</html>
