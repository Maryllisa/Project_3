<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<footer>
  <div class="game-stats">
    <p>Игрок: <span id="player-name">${sessionScope.name}</span></p>
    <p>Осталось до конца: <span id="time-left">${sessionScope.time}%</span></p>
    <p>Количество концовок: <span id="endings-count">${sessionScope.countEnd}</span></p>
  </div>
</footer>