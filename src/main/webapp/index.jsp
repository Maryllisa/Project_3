<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Добро пожаловать</title>
  <jsp:include page="/template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/index" method="post">
  <h1>Первое свидание Элли</h1>
  <p>"Поздравим Элли! У нее первое свидание!" - радостный возглас прозвучал в душе Элли, когда она взглянула на себя в<br>
    зеркало, тщательно подбирая наряд на этот особенный вечер. Ее сердце билось быстрее, смешиваясь с ожиданием и<br>
    нервозностью. Поможем Элли провести этот великолепный день!<br>
    <font style="color: red">Помните, каждый ваш выбор имеет последствия!</font>
  </p>
  <label>Давайте познакомимся. Введите имя...
    <input type="name" required name="name">
  </label>
  <input type="submit" class="button" value="Далее"/>
</form>
</body>
</html>