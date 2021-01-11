<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./country.wwe" method="post">
	
		<pre>
		
Country Id:			<input type="text" name="countryid" />
Country Name:			<input type="text" name="countryName" />
Population:			<input type="text" name="population" />
Developed:			<select name="developed">
					<option>yes</option>
					<option>no</option>

</select>
					<input type="submit" value="submit" />
</pre>
	</form>
</body>
</html>