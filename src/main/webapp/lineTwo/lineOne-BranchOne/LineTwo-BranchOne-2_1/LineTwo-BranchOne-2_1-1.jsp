
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Элли поехала на такси</title>
    <jsp:include page="../../../template/head.jsp"/>
</head>
<body>
<form action="<%=request.getContextPath()%>/lineTwo-BranchOne-2-1-2" method="post">
    <p>Парень, немного расстроенный преждевременным окончанием прогулки, решил сделать неожиданный <br>
        поворот. Он взял Элли за руку и направил их к самому красивому местному ресторану. Элли была<br>
        удивлена, не ожидая такого развития событий.<br>

        Прибыв в ресторане, они обнаружили, что их столик уже был готов. Он был украшен свечами и <br>
        свежими цветами, создавая романтическую и приглушенную атмосферу. Элли испытывала легкое <br>
        возбуждение, ожидая продолжения своего свидания.<br>

        Парень внимательно устраивал Элли за столом и, садясь напротив нее, улыбнулся ей с любовью.<br>
        Они оба почувствовали, что этот момент стал особенным и важным в их отношениях.<br>
    </p>
    <p><input type="radio" required name="option" value="no"> Я поняла, ты хочешь сделать мне предложение!</p>
    <p><input type="radio" required name="option" value="yes"> Прости, что мы так мало прогулялись, я замерзла и была нетерпеливой </p>
    <img class="imger" src="/Project_3_war_exploded/photo/Парень%20Элли%20был%20слегка%20расстроен%20преждевременно%20закончившейся%20прогулкой.jpg">
    <input type="submit" class="button" value="Далее"/>
</form>
</body>
<jsp:include page="/template/footer.jsp"/>
</html>
