<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">	
			<h1>Le-Gourmet Food Center</h1>
			<h1>Add new food item</h1>
			<h3>* items entry is compulsory</h3>
			<form action="/saveItem" method =post>
				Enter Item Number: <input type="number" name="item_number" size="20"> <br>
				<br>
				Enter Item Name: <input type="text" name="item_name" size="20"> <br>
				<br> Enter Item Cuisine: <input type="text" name="type"
					size="20"> <br> <br> 
					Enter Item Price: <input
					type="number" name="price" size="20"> <br> <br>
				Enter Item availability: <input type="text" name="availability"
					size="20"> <input type="submit" value="Submit">
			</form>
	</div>

</body>
</html>