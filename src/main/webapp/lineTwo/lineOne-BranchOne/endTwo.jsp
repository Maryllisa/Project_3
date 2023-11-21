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
    <p>В итоге Элли решает ехать домой, пить какао и грустно смотреть Сумерки...
    </p>
    <img class="imger" src="/Project_3_war_exploded/photo/Элли%20расстроилась%20и%20поехала%20домой.jpg">
</body>
<form id="startAgainForm" action="index.jsp" method="post">
    <button class="bttn" type="submit" form="startAgainForm">Начать с начала</button>
</form>

<form id="tryAgainForm" action="<%=request.getContextPath()%>/again" method="post">
    <button class="bttn" type="submit" form="tryAgainForm">Попробовать еще раз</button>
</form>
<jsp:include page="/template/footer.jsp"/>
</html>
