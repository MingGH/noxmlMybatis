<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
<body >
        <h2>Hello World!</h2>
        <a href="show.do">show</a><br/>
        <div style="width: 300px;height: 200px;border: 1px solid red">

        <form action="${pageContext.request.contextPath }/insertCustomer.do" method="post">
            <c:if test="${customer.customer_id!=null}">
                <input type="hidden" name="customer_id" value="${customer.customer_id}"/>
            </c:if>
            first_name:<input type="text" name="first_name" value="${customer.first_name}"/><br/>
            last_name:<input type="text" name="last_name" value="${customer.last_name}"/><br/>
            <input type="submit" value="提交"/>
        </form>
        </div>
</body>
</html>
