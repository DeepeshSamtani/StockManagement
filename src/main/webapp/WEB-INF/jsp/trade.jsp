<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Deepesh
  Date: 15/06/2016
  Time: 04:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#b3c6ff">
<form:form  method="post" commandName="tradeForm">
   <div>
       <form:label path="stockName"/>
   </div>

    <%--<div align="center">
       <div>
           <div>Share Name</div>
           <div><form:select path="shareName">
                <form:option value="NONE" label="--Select--"/>
                <form:options items="${sharesList}"/>
                </form:select>
           </div>
           </div>
       </div>
       <div>
           <div>Quantity</div>
           <div><form:input path="quantity"></form:input></div>
       </div>
        <div>Trade</div>
        <div><form:select path="trade"></form:select>
            <form:option value="1" label="Select One"/>
        </div>
    </div>--%>
</form:form>
</body>
</html>
