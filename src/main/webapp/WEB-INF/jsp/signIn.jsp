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
        Sign In
    </div>
    <form:form method="POST" action="valid" commandName="signIn">
        <table>
            <tr>
                <td>Username</td>
                <td><form:input path="userName"/></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:input path="password"/></td>
            </tr>
              <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
