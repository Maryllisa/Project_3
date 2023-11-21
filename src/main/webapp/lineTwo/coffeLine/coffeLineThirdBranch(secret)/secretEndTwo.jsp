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
        Элли присела у окна с чашечкой горячего кофе и стала ждать своего парня.<br>
        Он пришёл через 20 минут и расстроился, не найдя Элли. Из-за забытого дома телефона <br>
        Элли не могла ответить на попытки бедного мальчика дозвониться до неё, поэтому она<br>
        выбежала из-за стола, но поскользнулась на разлитом кофе и сломала ногу.<br>
        Сквозь боль Элли прокричала:”Там мой парень!”. Бариста, следуя своему гражданскому долгу,<br>
        вызвал скорую, которая увезла Элли в больницу. Парень Элли ушёл домой и больше никогда не<br>
        писал и не звонил ей, думая, что она никогда больше не захочет его видеть…<br>
        <br>
    </p>
    <p><input type="radio" required name="option" value="yes"> Продолжать ждать парня</p>
    <p><input type="radio" name="option" value="no">Кому нужен такой парень? Пора домой</p>
    <input type="submit" class="button" value="Далее"/>
    <img class="imger" src="/Project_3_war_exploded/photo/Осмотрев%20всю%20красоту,%20окружавшую%20её.jpg">
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
