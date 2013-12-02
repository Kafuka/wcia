<%-- 
    Document   : quote
    Created on : Nov 18, 2013, 12:47:19 PM
    Author     : Jordy Mugeni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quote</title>
    </head>
    <body>
        <h1>Quote done</h1>
        <form action="wciacontroller.do" method="POST">
        <table>
            <tr>
                <td>Quote No</td>
                <td> ${quote.id} <input type="hidden" value="successQuote" name="operation"></td>
            </tr>
            <tr>
                <td>Total Amount</td>
                <td>${quote.total}</td>
            </tr>
            
             <tr>
                 <td><input type="submit" value="Accept"/></td>
            </tr>            
        </table>
        </form>
    </body>
</html>
