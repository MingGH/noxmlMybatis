<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/13
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>名字</td>
            <td>名字后缀</td>
            <td>修改</td>
            <td>删除</td>
        </tr>

        <c:forEach var="customer" items="${customerList}">
            <tr>
                <td>${customer.first_name}</td>
                <td>${customer.last_name}</td>
                <td><a href="update.do?customer_id=${customer.customer_id}">修改</a></td>
                <td><a href="delete.do?customer_id=${customer.customer_id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>


</body>
</html>
