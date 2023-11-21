<%--
  Created by IntelliJ IDEA.
  User: mparm
  Date: 11.11.2023
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Элли поехала на автобусе</title>
    <jsp:include page="../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/third-second-choose" method="post">
    <p>

    </p>
    <p><input type="radio" required name="option" value="yes"> Продолжать ждать парня</p>
    <p><input type="radio" name="option" value="no">Кому нужен такой парень? Пора домой</p>
    <input type="submit" class="button" value="Далее"/>

    <img class="imger" src="/Project_3_war_exploded/photo/">
</form>
</body>
</html>
