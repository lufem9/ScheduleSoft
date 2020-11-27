<%--
    Document   : index
    Created on : Nov 15, 2020, 11:10:36 PM
    Author     : Femi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>ScheduleSoft</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">-->
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
<div class="row">
    <div class="side">
        <h2>LOGIN FORM</h2>
        <form action="loginServlet" method="post">
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
    </div>
    <div class="main">
        <h2>APPOINTMENT</h2>
          <table  border='1'  bordercolor='#2a5c9a' cellspacing='0' cellpadding='0' align=center >
                <tr><td><table cellspacing='0' cellpadding='10' align=center  border='1' width='700' ><td  align=center bgcolor='#2a5c9a'>  </td><td colspan=5 align=center bgcolor='#2a5c9a'><font size='3' face='Tahoma'>Nov 2020  </td><td  align=center bgcolor='#2a5c9a'>   </td></tr><tr><td><font size='3' face='Tahoma'><b>S</b></font></td><td><font size='3' face='Tahoma'><b>M</b></font></td><td><font size='3' face='Tahoma'><b>T</b></font></td><td><font size='3' face='Tahoma'><b>W</b></font></td><td><font size='3' face='Tahoma'><b>T</b></font></td><td><font size='3' face='Tahoma'><b>F</b></font></td><td><font size='3' face='Tahoma'><b>S</b></font></td></tr><tr><td valign=top><font size='2' face='Tahoma'>1  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>2  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>3  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>4  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>5  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>6  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>7  
                <br>
                 </font></td></tr><tr><td valign=top><font size='2' face='Tahoma'>8  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>9  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>10  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>11  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>12  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>13  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>14  
                <br>
                 </font></td></tr><tr><td valign=top><font size='2' face='Tahoma'>15  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>16  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>17  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>18  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>19  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>20  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>21  
                <br>
                 </font></td></tr><tr><td valign=top><font size='2' face='Tahoma'>22  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>23  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>24  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>25  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>26  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>27  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>28  
                <br>
                 </font></td></tr><tr><td valign=top><font size='2' face='Tahoma'>29  
                <br>
                 </font></td><td valign=top><font size='2' face='Tahoma'>30  
                <br>
                 </font></td></tr></table></td></tr>
          </table>
    </div>
</div>

<!-- Footer -->
<div class="footer">
    <h2>Footer</h2>
</div>

</body>
</html>
