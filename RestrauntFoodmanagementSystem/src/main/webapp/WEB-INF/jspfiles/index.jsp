<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.demo.entity.FoodItems"%>

<!DOCTYPE html>
<html>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Restraunt Food Management System</h1>
    <form action="/new">
        <input type="submit" value="CREATE NEW FOOD ITEM" />
    </form>
    <br>
    <table style="width: 100%">
        <thead>
            <tr>
                <th>ITEM_NUMBER</th>
                <th>ITEM_NAME</th>
                <th>TYPE</th>
                <th>PRICE</th>
                <th>AVAILABILITY</th>
                <th>ACTION</th>
            </tr>
        </thead>
        <c:forEach var="foodItem" items="${FoodItem}">
            <td>${foodItem.item_number}</td>
            <td>${foodItem.item_name}</td>
            <td>${foodItem.type}</td>
            <td>${foodItem.price}</td>
            <td>${foodItem.availability}</td>
        </c:forEach>
    </table>
</body>
</html>