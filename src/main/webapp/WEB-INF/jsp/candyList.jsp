<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Candies</title>
</head>
<body>

<c:forEach items="${candies}" var="candy">
    ${candy.name}
    ${candy.price}
    euro<br>

</c:forEach>


</body>
</html>
