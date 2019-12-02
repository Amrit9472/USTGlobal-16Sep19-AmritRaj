<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<fieldset>
	<form action="./login" method="post"">
		<h2>${msg}</h2>
		
		
		<h3 color:='red'>Login Here</h3>
		
		
		<br> 
		<label>EMAIL:</label>
		<br>
		<input type="text" placeholder="enter email"name="email" required="required">
		<br>
		<label color='red'>Password:</label>
		<br>
		<input type="text" name="password" placeholder="enter Password"required="required"><br>
		
		<button type="submit">Login</button>
		<button type="reset">Reset</button>
		
		<br> <a href="./register">Register Here</a>
		
	</form>
	</fieldset>
</body>
</html>