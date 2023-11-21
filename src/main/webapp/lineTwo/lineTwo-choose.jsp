<%--
  Created by IntelliJ IDEA.
  User: mparm
  Date: 12.11.2023
  Time: 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<head>
    <jsp:include page="../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/lineTwo-choose" method="post">
    <p>Элли так долго красилась, что теперь безумно опаздывает и размышляет о поездки на такси<br></p>
    <p><input type="radio" required name="option" value="yes"> Нельзя заставлять парня ждать!! Уже вызываем такси! </p>
    <p><input type="radio" name="option" value="no">Элли не миллионерша, чтоб на такси кататься. Подождет</p>
    <img class="imger" src="/Project_3_war_exploded/photo/Ну%20вот,%20теперь%20Элли%20опаздывает.jpg">
    <input type="submit" class="button" value="Далее"/>
</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
