<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Deepesh
  Date: 15/06/2016
  Time: 04:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        Sign Up
    </div>
    <form:form method="post" action="add.html" commandName="signUp">
        <table>
            <tr>
                <td>Customer Id</td>
                <td><form:input  path="customerId"/></td>
            </tr>
            <tr>
                <td>Customer Name</td>
                <td><form:input  path="customerName"/></td>
            </tr>
            <tr>
                <td>Username</td>
                <td><form:input  path="userName"/></td>
            </tr>
            <tr>
                <td>Email Id</td>
                <td><form:input  path="emailId"/></td>
            </tr>
            <tr>
                <td>Telephone</td>
                <td><form:input  path="telephone"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:input path="password"/></td>
            </tr>
           <%-- <tr>
                <td>Confirm Password</td>
                <td><form:input type="text" name="password" path="confirmPassword"/></td>
            </tr>--%>
            <tr>
                <td><input type="submit" value="Add"></td>
          <%--      <td><input type="reset" value="Reset"></td>--%>
            </tr>

        </table>
    </form:form>
</body>
</html>
