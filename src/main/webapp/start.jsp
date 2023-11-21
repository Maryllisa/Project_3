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
    <meta charset="UTF-8">
    <title>Начало</title>
    <jsp:include page="template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/start" method="post">
<p>
    Элли, скромная девушка, получает приглашение от самого красивого парня в школе. <br>
    Она размышляет о том, нужно ли ей накраситься или довериться естественному шарму.<br>
</p>
    <p><input type="radio" required name="option" value="yes"> Конечно! Элли должна быть красивой</p>
    <p><input type="radio" name="option" value="no">Что-то лень... Она и так красивая!</p>
    <img class="imger" src="photo/Конечно! Элли должна быть красивой.jpg">
    <input type="submit" class="button" value="Далее"/>

</form>

</body>
<jsp:include page="/template/footer.jsp"/>
</html>
