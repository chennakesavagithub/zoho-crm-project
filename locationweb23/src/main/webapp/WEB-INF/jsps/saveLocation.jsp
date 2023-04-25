<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
	<h2>Create new location</h2>
	
	<form action="saveLocationData" method="post" >
	<pre>
		Id <input type="text" name="id"/>
		Code <input type="text" name="code"/>
		Name <input type="text" name="name"/>
		Type 
		urban<input type="radio" name="type" value="urban"/>
		rural<input type="radio" name="type" value="rural"/>
		<input type="submit"  value="save"/>
	</pre>
	</form>
	${msg}
</body>
</html>