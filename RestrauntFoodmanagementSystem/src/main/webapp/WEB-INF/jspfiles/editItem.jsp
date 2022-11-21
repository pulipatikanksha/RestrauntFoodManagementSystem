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
		<form action="/saveItem" method =post modelAttribute = "FoodItems">
			
				The Item Number:
					<input type="text" name="item_number" size="20" readonly="readonly"
						value= ${foodItem.getItem_number() }>
			    The Item Name:
				<input type="text" name="item_name" size="20" readonly="readonly"
						value= ${foodItem.getItem_name() }>
				The Cuisine:
					<input type="text" name="type" size="20" readonly="readonly"
						value= ${foodItem.getType() }> 
				*Enter New price:
					<input type="text" name="price" size="20" value= ${foodItem.getPrice() }>
				*Enter New availability:
					<input type="text" name="availability" size="20" value= ${foodItem.getAvailability() }>
			
			<input type="submit" name="update">
		</form>
	</div>
</body>
</html>