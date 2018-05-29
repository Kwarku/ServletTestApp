<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 27.05.18
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Przykład POST</title>
</head>
<body>

<H1 align="center"> Przykład HTTP POST </H1>

<form action="http://localhost:8080/Parameters/wypisz_parametry" method="post">
    Parameter1:
    <input type="text" name="parametr1"> <br>
    Parameter2:
    <input type="text" name="parametr2"> <br>
    Parameter3:
    <input type="text" name="parametr3"> <br>
    <input type="submit" value="wyslij">


</form>

</body>
</html>
