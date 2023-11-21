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
    <h1>Первое свидание Элли закончилось потрясающе...</h1>
    <p> Мягкий свет свечей создавал уютную и <br>
        романтическую атмосферу.<br>

        Они сели напротив друг друга и начали мило беседовать. Время пролетело незаметно, и они <br>
        не заметили, как ресторан начал закрываться. Но ни один из них не хотел прерывать этот <br>
        особенный момент. Они наслаждались общением, смеялись вместе и разделяли свои мечты и <br>
        надежды.<br>

        В глубине души они оба поняли, что они были созданы друг для друга. Никакие проблемы или<br>
        преграды не могут разлучить их. В тот вечер они ощутили, что их связь стала еще сильнее, <br>
        а их любовь к друг другу только укрепилась.<br>

        Элли и парень понимали, что эта прекрасная прогулка и романтический ужин в ресторане были <br>
        не просто случайными моментами, а символом их судьбы. Они праздновали свою победу над <br>
        сомнениями и трудностями, зная, что вместе они могут преодолеть все и создать счастливое <br>
        будущее.<br>
    </p>
    <img class="imger" src="/Project_3_war_exploded/photo/Дальше%20были%20только%20любовь%20и%20счастье.jpg">
</body>
<form id="startAgainForm" action="index.jsp" method="post">
    <button class="bttn" type="submit" form="startAgainForm">Начать с начала</button>
</form>

<form id="tryAgainForm" action="<%=request.getContextPath()%>/again" method="post">
    <button class="bttn" type="submit" form="tryAgainForm">Попробовать еще раз</button>
</form>
<jsp:include page="/template/footer.jsp"/>
</html>
