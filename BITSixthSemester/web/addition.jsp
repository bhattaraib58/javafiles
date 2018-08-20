<%-- 
    Document   : addition
    Created on : Aug 20, 2018, 11:09:49 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <h1>Addition</h1>
        <form method="POST" action="addition">  
            
            <div>
                <label>First Number:</label>
                <input type="text" name="firstnumber" required="required" placeholder="first number" value=${firstnumber}>
            </div>    
            <br/>
            
            <div>
                <label>Second Number:</label>
                <input type="text" name="secondnumber" required="required"  placeholder="secondnumber" value=${secondnumber}>
            </div>  
            <br/>
            <c:if  test="${output}!=null">
            <div>
                <label>Result:</label>
                <input type="text" name="result" placeholder="result" disabled value=${result}>
            </div>
            </c:if>
            <br/>
            <input type="submit" name="Add" value="Add">
         </form>
    </body>
</html>
