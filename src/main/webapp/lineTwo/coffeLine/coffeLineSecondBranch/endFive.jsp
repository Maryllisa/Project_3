<%--
  Created by IntelliJ IDEA.
  User: mparm
  Date: 12.11.2023
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Конец</title>
    <jsp:include page="/template/head.jsp"/>
</head>
<body>
    <h1>Первое свидание Элли закончилось, даже не начавшись...</h1>
    <p>Бариста был поражён таким отношением Элли. Он представил себя на месте этого молодого <br>
        человека, только что отвергнутого своей любимой, променявшей его на первого встречного.<br>
        Бариста освободился от объятий Элли и сказал, что его ждёт работа. <br>
        Парень Элли уже не смог простить ей такого отношения к себе и постарался забыть обо всём,<br>
        что их когда-то связывало. Элли осталась одна с чашкой уже остывшего кофе у окна и<br>
        погрузилась  в размышления...<br>
    </p>
</body>
<img class="imger" src="/Project_3_war_exploded/photo/Бариста%20был%20поражён%20таким%20отношением%20Элли.jpg">
<form id="startAgainForm" action="index.jsp" method="post">
    <button class="bttn" type="submit" form="startAgainForm">Начать с начала</button>
</form>

<form id="tryAgainForm" action="<%=request.getContextPath()%>/again" method="post">
    <button class="bttn" type="submit" form="tryAgainForm">Попробовать еще раз</button>
</form>
<jsp:include page="/template/footer.jsp"/>
</html>
