<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<div class="container">
    <form action="Register">
	  <h1> Register </h1>
	  <label for="uname"><b>Username</b></label>
      <input type="text" id = "uname" name="uname" required>
	<br><br>
	<label for="name"><b>Name</b></label>
      <input type="text" name="name" required>
	<br><br>
      <label for="surname"><b>Surname</b></label>
      <input type="text" name="surname" required>
	<br><br>
	  <label for="sex"><b>Sex</b></label>
	  <br>
	  <input type="radio" name="male" value = "m">
	  <b>Male</b>
	  <br>
	  <input type="radio" name="female" value = "f">
	  <b>Female</b>
	<br><br>
	  <label for="date"><b> Date of Birth </b></label>
	  <input type="date" name="myDate" value="2000-01-01">
	<br><br>
	<label for="telephone"><b>Telephone</b></label>
      <input type="text" name="tel" required>
	<br><br>
	<label for="email"><b>Email</b></label>
      <input type="text" name="em" required>
	<br><br>
	<label for="city"><b>City</b></label>
      <input type="text" name="ci" required>
	<br><br>
	<label for="country"><b>Country</b></label>
      <input type="text" name="co" required>
	<br><br>
      <label for="psw"><b>Password</b></label>
      <input type="password" name="psw" required>
	<br><br>
	<label for="cpsw"><b>Confirm Password</b></label>
      <input type="password" name="cpsw" required>
	<br><br>
    <button type="submit">Register</button>
    </form>
</div>
</body>
</html>