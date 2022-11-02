<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirFly Admin Login</title>
</head>
<body>
<form action="/index">
<input type="submit" value="GoToBackPage">
</form>

<center>
<h1>Welcome to Admin Port</h1>
<fieldset style="width: 400px">
<br><br>

<form method="post" action="adminlogin">
Enter User Name:<input type="text" name=username><br><br>
Enter Admin Password:<input type="password" name="adminpassword"><br><br>

<input type="submit" value="LOGIN">
</form>

</fieldset>
</center>

</body>
</html>