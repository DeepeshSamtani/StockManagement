<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%--
  Created by IntelliJ IDEA.
  User: Deepesh
  Date: 15/06/2016
  Time: 04:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="marketWatch" commandName="stock">
</form:form>

<table border="1">
    <th>Stock Id</th>
    <th>Stock Name</th>
    <th>Stock Value</th>
    <th>Stock Left</th>

    <c:forEach items="${stockList}" var="stock">
        <tr>
            <td>${stock.stockId}</td>
            <td>${stock.stockName}</td>
            <td>${stock.stockValue}</td>
            <td>${stock.stockLeft}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
