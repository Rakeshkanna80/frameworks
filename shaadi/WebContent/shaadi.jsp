<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>SignUp Page</title>
</head>
<body>
	<div class="container">
	<h5>${message}</h5>
		<div class="jumbotron text-center" style="background: highlight;">
			<h1>Welcome To Shaadi.com</h1>
			<p>Matching People From All World</p>
		</div>
	</div>

	<div class="jumbotron">
		<div class="col-sm-4">

			<h5 align="left">SignUp here</h5>
			<br>
			<form action="shaadi.sha" method="post">
				<table>
					<tr>
						<td>Name:</td>
						<td><input type="text" name="name" value="${dto.name}"/></td>
					</tr>


					<tr>
						<td>Date Of Birth:</td>
						<td><input type="text" name="dob"/></td>
					</tr>
					<tr>
						<td>Occupation:</td>
						<td><input type="text" name="occupation" /></td>
					</tr>
					



					<tr>
						<td>Status:</td>
						<td><select name="status">
								<option>Married</option>
								<option>UnMarried</option>
								<option>Divorced</option>
						</select></td>
					</tr>
					

					<tr>
						<td>Looking For:</td>
						<td><select name="lookingfor">
								<option>Married</option>
								<option>UnMarried</option>
								<option>Divorced</option>
						</select></td>
					</tr>

				</table>

				Gender: <input type="radio" name="gender" />Male <input
					type="radio" name="gender" />Female <input type="radio"
					name="gender" />Other <br>
				<input type="submit" value="SignUp"/>
				<button type="reset">Reset</button>
			</form>
		</div>
	</div>

</body>
</html>