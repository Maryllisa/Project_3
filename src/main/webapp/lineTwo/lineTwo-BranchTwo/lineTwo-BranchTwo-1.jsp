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
    <title>Элли поехала на такси</title>
    <jsp:include page="../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/lineTwo-BranchTwo-1" method="post">
<p>
    В результате спешки Элли забыла телефон, но приехала на место встречи во время. Парня нигде не видно.<br>
    На улице не май месяц и Элли теряется в догадках, где же он... Вдруг это все был бессмысленный розыгрыш... <br>
    Элли стала замерзать и начала придумывать план дальнейших действий. Неподалеку она увидела уютное кофе,<br>
    может переждать парня там?<br>
</p>
    <p><input type="radio" required name="option" value="yes1"> Ну а чего просто так стоять... Зайти за кофе</p>
    <p><input type="radio" required name="option" value="yes2"> Продолжать ждать парня</p>
    <p><input type="radio" name="option" value="no">Кому нужен такой непунктуальный парень? Пора домой</p>
    <img class="imger" src="/Project_3_war_exploded/photo/Элли%20забыла%20телефон,%20но%20приехала%20вовремя.%20Парня%20пока%20нигде%20не%20видно..jpg">
    <input type="submit" class="button" value="Далее"/>
</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
