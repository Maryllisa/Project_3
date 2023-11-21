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
    <jsp:include page="../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/lineTwo-BranchTwo-2" method="post">
<p>
    Элли опоздала на полчаса и забыла телефон. Парня нигде не видно.<br>
    На улице не май месяц и Элли теряется в догадках, где же он... Вдруг он ее не дождался или это все был бессмысленный розыгрыш... <br>
    Элли стала замерзать и начала придумывать план дальнейших действий<br>
</p>
    <p><input type="radio" required name="option" value="yes"> Продолжать ждать парня</p>
    <p><input type="radio" name="option" value="no">Кому нужен такой парень? Пора домой</p>
    <img class="imger" src="/Project_3_war_exploded/photo/Элли%20опоздала%20на%20полчаса%20и%20забыла%20телефон.%20Наверное%20парень%20её%20не%20дождался%20и%20ушёл.jpg">

    <input type="submit" class="button" value="Далее"/>

</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
