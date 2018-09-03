<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"  type="text/css" href="index.css">
<title>Login</title>
</head>
<style>
.container{
	background-color: #3972E5;
	color:white;
	width: 100%;
	padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}
</style>
<body>
<div class="container">
	  <h1> Login </h1>
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="uname" required>
	<br><br>
      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required>
	<br><br>
	  <form action="Servlet1">
      	<button type="submit">Login</button>
      </form>
</div>
</body>
</html>