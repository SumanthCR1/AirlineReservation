<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
<form action="login" >
<input type="submit" value="GoToBackPage">
</form>

<center>
<form  action="/details" method="post" >

<h1>Enter your Details...</h1>
<fieldset style="width: 500px">

Enter FirstName: <input required="required" type = "text" placeholder="Enter FirstName" , name = "firstName">  <br> <br> 
Enter LastName: <input  type = "text" placeholder="Enter LastName" , name="lastName"><br>  <br>
Enter age: <input required="required" type = "number" placeholder="Enter LastName" , name="age"><br>  <br>
Enter gender: <input  required="required" type = "text" placeholder="Enter LastName" , name="gender"><br>  <br>
Enter phoneNumber: <input required="required" type = "text" placeholder="Enter LastName" , name="phoneNumber"><br>  <br>
Enter contactAddress: <input required="required" type = "text" placeholder="Enter LastName" , name="contactAddress"><br>  <br>
Enter EmailId: <input required="required" type = "email" placeholder="Enter Email id" , name="emailId" >   <br>    <br>
Enter Password: <input required="required" type = "password" placeholder="Enter password" , name="password" >   <br>    <br>
<input type="submit" value="submit">


</fieldset>


</form>
</center>

</body>
</html>