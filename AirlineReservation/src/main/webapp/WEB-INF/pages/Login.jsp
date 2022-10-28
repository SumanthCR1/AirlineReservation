<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/index">
<input type="submit" value="GoToBackPage">
</form>
<center>
<h1>Welcome to user Login page</h1>
<fieldset style="width: 300px">

<form method="post" action="filter">
Enter First Name:<input type="text" name=firstname><br><br>
Enter  Password:<input type="text" name="password"><br><br>

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