<%--
    Document   : index
    Created on : Nov 15, 2020, 11:10:36 PM
    Author     : Femi
--%>

<%@page import="Business.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>ScheduleSoft</title>
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
    <a href="Login.jsp">LOGIN</a>
    <a href="ScheduleAppointment.jsp">Schedule Appointment</a>
    <!--<a href="newclientinfojsp.jsp">Register</a>
    <!-- <a href="#">Link</a>
    <a href="#">Link</a>-->
</div>     
<%
    Client c1 = (Client)session.getAttribute("p1");
    int count = c1.aList.getCount();
               int x = 0;
               //int i = 1;
    System.out.println("In JSP");
    c1.display();
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
                <th>Last Name</th>
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
    <div class="main">
        <h2>APPOINTMENT LIST</h2>
        <table>
            <tr>
                <th> Appointment ID</th>
                <th> Appointment Day</th>
                <th> Start Time </th>
                <th> End Time</th>
                <th> Entity ID</th>
            </tr>

            <% while(x<count)
           {
               Appointment a1 = new Appointment();
               a1=c1.aList.getAppointment(x);
               a1.display();
               x++;
            %>
            <tr>
                <td><%=a1.getAppId() %></td>
                <td><%=a1.getAppDy() %></td>
                <td><%=a1.getAppSt()%></td>
                <td><%=a1.getAppEt()%></td>
                <td><%=a1.getEId()%></td>
            </tr>
            <% } %>
        </table>
    </div>
</div>

        <!-- Footer -->
        <div class="footer">
            <h2>Welcome <%=c1.getFirstName() %></h2>
        </div>
    </body>
</html>