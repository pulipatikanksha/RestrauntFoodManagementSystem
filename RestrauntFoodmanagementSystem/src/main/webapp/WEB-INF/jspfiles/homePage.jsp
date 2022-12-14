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
<title>home page</title>
</head>
<body>
<div align = "center">
	<h1>Le-Gourmet Food Center</h1>
	<form action="/homePage">
        <h2><a type="submit" href="insertItem">create new food Item</a></h2>
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
        <tr>
            <td>${foodItem.item_number}</td>
            <td>${foodItem.item_name}</td>
            <td>${foodItem.type}</td>
            <td>${foodItem.price}</td>
            <td>${foodItem.availability}</td>
            <td>
            	<a href="/editItem?item_number=${foodItem.item_number}">Edit</a>
            	<a href="/deleteItem?item_number=${foodItem.item_number}">Delete</a>
            </td>
        </tr>
        </c:forEach>
        
    </table>
    </div>
</body>
</html>