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
<form action="<%=request.getContextPath()%>/secret-line-choose" method="post">
    <p>
        На секунду Элли снова задумалась...
    </p>
    <p><input type="radio" required name="option" value="yes"> Нельзя просто оставить без внимание такое приятное поведение. Следует оставить чаевые</p>
    <p><input type="radio" name="option" value="no">Быть милым - его работа. Не буду обращать внимание</p>
    <img class="imger" src="/Project_3_war_exploded/photo/И%20всё%20же%20нельзя%20оставлять%20без%20поощрения%20старания%20молодого%20бариста.jpg">
    <input type="submit" class="button" value="Далее"/>

</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
