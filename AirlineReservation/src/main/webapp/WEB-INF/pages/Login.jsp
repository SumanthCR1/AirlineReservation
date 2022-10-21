<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<fieldset style="width: 300px">

<form method="get" action="filter">
Enter  NAME:<input type="text" name=firstname><br><br>
Enter EMAILID<input type = "text" name=emailid><br><br>
Enter  password:<input type="password" name="password"><br><br>

<input type="submit" value="Login">
</form>
<br><br>
<form action="regist">
<input type="submit" value="signup">
</form>

</fieldset>
</center>
</body>
</html>