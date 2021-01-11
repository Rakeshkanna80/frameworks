<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>MEMBERS OF FAMILY</h1>
	<form action="family.rak" method="post">
		<pre>
FamilyName:<input type="text" name="familyName" />
MemberName:<input type="text" name="memberName" />
Occupation:<input type="text" name="occupation" />
Place:     <input type="text" name="place" />
Gender:    <select name="gender">
<option value="M">Male</option>

<option value="F">Female</option>

<option value="O">other</option>



</select>
<input type="submit" value="add" />

</pre>
	</form>

</body>
</html>