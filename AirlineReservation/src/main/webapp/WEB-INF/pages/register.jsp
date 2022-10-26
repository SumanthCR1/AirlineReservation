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
<form  action="/details" method="post" name= "hello">

<h1>Enter your Details...</h1>
<fieldset style="width: 500px">

Enter FirstName: <input required="required" type = "text" placeholder="Enter FirstName" , name = "firstname">  <br> <br> 
Enter LastName: <input  type = "text" placeholder="Enter LastName" , name="lastname"><br>  <br>
Enter age: <input required="required" type = "number" placeholder="Enter LastName" , name="age"><br>  <br>
Enter gender: <input  required="required" type = "text" placeholder="Enter LastName" , name="gender"><br>  <br>
Enter phoneNumber: <input required="required" type = "text" placeholder="Enter LastName" , name="phonenumber"><br>  <br>
Enter contactAddress: <input required="required" type = "text" placeholder="Enter LastName" , name="contactaddress"><br>  <br>
Enter EmailId: <input required="required" type = "text" placeholder="Enter Email id" , name="emailid" >   <br>    <br>
Enter Password: <input required="required" type = "text" placeholder="Enter password" , name="password" >   <br>    <br>
<input type="submit" value="submit">


</fieldset>


</form>
</center>

</body>
</html>