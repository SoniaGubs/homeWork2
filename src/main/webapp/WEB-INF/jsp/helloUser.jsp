<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
Hello
<c:out value="${user.login}"/>
</body>
</html>
