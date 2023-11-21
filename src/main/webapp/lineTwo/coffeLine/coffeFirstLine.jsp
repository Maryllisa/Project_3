
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
  <title>Элли поехала на такси</title>
  <jsp:include page="../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/coffeFirstLine" method="post">
  <p>
    Они начали вести небольшой разговор, когда Элли спросила баристу о секрете искусственного <br>
    создания таких красивых узоров на пенке напитка. Бариста с улыбкой поделился с ней некоторыми <br>
    техниками латте-арт и объяснил, что любит придавать каждому своему напитку особое внимание, <br>
    чтобы сделать его особенным для каждого клиента.<br>

    Элли чувствовала, что между ней и баристой возникает некоторая химия. Они продолжали общаться <br>
    и смеяться, наслаждаясь не только напитком, но и приятной атмосферой, которую создавали друг <br>
    для друга.<br>
    Как развивается их диалог дальше?
  </p>
  <p><input type="radio" required name="option" value="yes"> Продолжать легкий флирт и проявлять заинтересованность </p>
  <p><input type="radio" required name="option" value="no"> Начать жаловаться на парня, который не приехал</p>
  <img class="imger" src="/Project_3_war_exploded//photo/Элли%20завела%20милую%20беседу,%20чтобы.jpg">
  <input type="submit" class="button" value="Далее"/>
</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
