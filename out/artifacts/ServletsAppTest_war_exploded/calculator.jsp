<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 27.05.18
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caluculator</title>
</head>
<body>
<h1 align="center"> Kalkulator delty używający POST</h1>

<form action="http://localhost:8080/Calculator/show" method="post">

    Parametr A:
    <input type="text" name="a"><br>
    Parametr B:
    <input type="text" name="b"> <br>
    Parametr C:
    <input type="text" name="c"> <br>

    <input type="checkbox" name="isSquare">

    <input type="submit" value="Oblicz delte">

</form>

</body>
</html>
