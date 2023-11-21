
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Элли поехала на такси</title>
    <jsp:include page="../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/lineTwoBranchTwoOneOne" method="post">
    <p>
        Элли зашла в кафе, чтобы заказать тыквенно-пряный латте. В кафе она встретила приятного <br>
        молодого баристу, который проявил интерес к ней и, кажется, начал флиртовать. Во время  <br>
        приготовления латте бариста нарисовал милое сердечко на пенке напитка. <br>

        Элли, чувствуя себя приятно удивленной и легкой смущенной, получила свой напиток с улыбкой  <br>
        на лице. Она наслаждалась ароматом тыквы и приятной пряности в каждом глотке латте, а также  <br>
        заметила, что бариста продолжает обращать на нее внимание.<br>
        Как же ей поступить?
    </p>
    <p><input type="radio" required name="option" value="yes1"> Ответить на флирт взаимностью</p>
    <p><input type="radio" required name="option" value="no"> Игнорировать</p>
    <c:if test="${sessionScope.test}">
        <p><input type="radio" name="option" value="yes2">Вообще-то Элли тут парня ждет</p>
    </c:if>
    <img class="imger" src="/Project_3_war_exploded/photo/Вообще-то%20Элли%20тут%20парня%20ждёт.jpg">
    <input type="submit" class="button" value="Далее"/>
</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
