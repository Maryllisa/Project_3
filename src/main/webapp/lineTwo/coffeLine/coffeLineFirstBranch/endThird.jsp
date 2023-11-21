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
    <p>Когда Элли закончила свой напиток, она поблагодарила баристу за отличное обслуживание и <br>
        вкусный напиток. Бариста, улыбаясь, ответил, что он всегда рад радовать своих клиентов и <br>
        надеется увидеть Элли снова.<br>

        Элли покинула кафе с чувством теплоты в сердце и улыбкой на лице. Встреча с приятным <br>
        баристой и его вниманием стала незабываемым моментом в ее день, оставив ее с приятными <br>
        воспоминаниями о посещении кафе.<br>
        Молодому человеку очень понравилась Элли и он взял ее номер телефона. Со временем они стали <br>
        встречаться, а потом поженились. Они прожили вместе всю жизнь, и новый избранник <br>
        Элли так никогда и не узнал, что в день их знакомства было разбито сердце бывшего парня Элли...<br>
    </p>
    <img class="imger" src="/Project_3_war_exploded/photo/Элли%20решила%20покончить%20с%20отношениям%20со%20своим%20предыдущим%20непунктуальным%20парнем,%20построив%20отношения%20с%20бариста.jpg">
</body>
<form id="startAgainForm" action="index.jsp" method="post">
    <button class="bttn" type="submit" form="startAgainForm">Начать с начала</button>
</form>

<form id="tryAgainForm" action="<%=request.getContextPath()%>/again" method="post">
    <button class="bttn" type="submit" form="tryAgainForm">Попробовать еще раз</button>
</form>
<jsp:include page="/template/footer.jsp"/>
</html>
