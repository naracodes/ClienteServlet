<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Listar Clientes</title>
</head>
<body>
<h1 align="center">Clientes cadastrados:</h1>
<c:forEach items="${lista_cadastros}" var="cadastro">
    <h3 align="center"><c:out value="${cadastro}" /></h3>
</c:forEach>
</body>
</html>
