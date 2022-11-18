<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page import="com.example.demo.entity.FoodItems"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center" style="color: orange; font-style: italic">Edit
		Food Item</h2>
	<h4 align="center" style="color: red">* marked items entry is
		compulsory</h4>
	<div align="center">
		<form:form action="/saveItem" method="post" modelAttribute="foodItem">
			<table>
				<tr>
					<td>The Item Number:</td>
					<td><input type="text" name="item_number" readonly="readonly"
						value="${foodItem.item_number}"></td>
				</tr>
				<tr>
					<td>The Item Name:</td>
					<td><input type="text" name="item_name" readonly="readonly"
						value="${foodItem.item_name}"></td>
				</tr>
				<tr>
					<td>The Cuisine:</td>
					<td><input type="text" name="type" readonly="readonly"
						value="${foodItem.type}"></td>
				</tr>
				<tr>
					<td>*Enter New price:</td>
					<td><input type="text" name="price" value="${foodItem.price}">
					</td>
				</tr>
				<tr>
					<td>*Enter New availability:</td>
					<td><input type="text" name="availability"
						value="${foodItem.availability}"></td>
				</tr>
			</table>
			<input type="submit" name="update">
		</form:form>
	</div>
</body>
</html>