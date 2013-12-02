<%-- 
    Document   : welcome
    Created on : Nov 18, 2013, 9:08:01 AM
    Author     : Jordy Mugeni
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> WCIA Quote Request</h1>          
        <fieldset>
            <legend>Request for cleaning quote</legend>
            <table>

                <form action="wciacontroller.do" method="post" >
                    <tr>
                        <td>Service Name</td>
                        <td>
                            <c:forEach items="${services}" var="job">
                                <input  type="checkbox" name="serviceId" value="${job.serviceID}"/> ${job.description}&nbsp
                            </c:forEach>
                               
                           
                            <input type="hidden" value="quote" name="operation">
                        </td>
                    </tr>
                    <tr>
                        <td>Cell Number</td>
                        <td><input type="text" name="cellNo"/></td>
                    </tr>
                    <tr>
                        <td>Email Address</td>
                        <td><input type="text" name="email"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Send Quote Request"/></td>
                    </tr>
                </form>
        </fieldset>
    </table>
</body>
</html>
