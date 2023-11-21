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
    <jsp:include page="../../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/third-second-choose" method="post">
    <p>
        Элли присела у окна с чашечкой горячего кофе и стала ждать своего парня. Он пришёл через 20<br>
        минут и расстроился, не найдя Элли. Из-за забытого дома телефона Элли не могла ответить на <br>
        попытки бедного мальчика дозвониться до неё, поэтому она выбежала из-за стола, но <br>
        поскользнулась на разлитом кофе и сломала ногу.<br>
        Сквозь боль Элли прокричала: “Там мой парень!”. Бариста, помня доброту милой девушки, <br>
        вызвал скорую и побежал через дорогу к парню<br>
        Через час Элли и её парень уже вместе пили кофе в палате городской клиники, мило беседуя обо<br>
        всём случившемся.<br>
        Спустя много лет уже пожилую пару не раз видели  в том самом кафе вместе с другом семьи, <br>
        который когда-то не дал уйти молодому парню, упустив своё счастье<br>
        <br>
    </p>

    <img class="imger" src="/Project_3_war_exploded/photo/Элли%20зашла%20в%20кафе%20и%20заказала%20тыквенно-пряный%20латте.%20Бариста%20оказался%20приятным%20молодым%20человеком.jpg">
</form>
</body>
<form id="startAgainForm" action="index.jsp" method="post">
    <button class="bttn" type="submit" form="startAgainForm">Начать с начала</button>
</form>

<form id="tryAgainForm" action="<%=request.getContextPath()%>/again" method="post">
    <button class="bttn" type="submit" form="tryAgainForm">Попробовать еще раз</button>
</form>
<jsp:include page="/template/footer.jsp"/>
</html>
