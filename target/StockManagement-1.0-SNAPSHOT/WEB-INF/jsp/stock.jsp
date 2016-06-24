<%@ include file="/WEB-INF/jsp/includes.jsp"%>

<%--
  Created by IntelliJ IDEA.
  User: Deepesh
  Date: 15/06/2016
  Time: 04:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="addStock" commandName="stock">
    <table >
        <tr>
            <td>Stock Id</td>
            <td><form:input path="stockId"/></td>
        </tr>
        <tr>
            <td>Stock Name</td>
            <td><form:input path="stockName"/></td>
        </tr>
        <tr>
            <td>Stock Value</td>
            <td><form:input path="stockValue"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

<%--
<table border="1">
    <th>Stock Id</th>
    <th>Stock Name</th>
    <th>Stock Value</th>

    <c:forEach items="${stockList}" var="stock">
        <tr>
            <td>${stock.stockId}</td>
            <td>${stock.stockName}</td>
            <td>${stock.stockValue}</td>
        </tr>
    </c:forEach>
</table>
--%>
</body>
</html>
