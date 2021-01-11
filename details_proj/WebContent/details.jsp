<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RegisterPage</title>
  
</head>
<body>

	<form action="personal.det" method="post">
		<div align="center" class="jumbotron text-center"
			style="background: highlight;">
			<h1>Register Here</h1>
		</div>

		<table align="left">
			<tr>
				<th style="text-decoration: underline;">Personal Details
				<th>
			</tr>

			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="confirmPassword"></td>
			</tr>
		</table>



		<table>
			<tr>
				<th style="text-decoration: underline;">Address Details</th>
			</tr>
			<tr>
				<td>Street:</td>
				<td><input type="text" name="Street"></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr>
				<td>Pincode:</td>
				<td><input type="text" name="pincode"></td>
			</tr>

		</table>
		<input type="submit" value="Save"> <input type="reset"
			value="Clear">
	</form>

</body>
</html>