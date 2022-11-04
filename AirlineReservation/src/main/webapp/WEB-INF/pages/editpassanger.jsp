<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditProfile</title>
</head>
<body>
<form action="/userProfile">
		<input type="submit" value="GoToBackPage">
	</form>
<spring:url value="/addPassanger" var="addURL" />
<form:form modelAttribute="passangerform" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="id"/>
  
<center>

<h1>Enter Passanger Details...</h1>
<fieldset style="width: 500px">

<input type = "hidden"  name = "id"/>  <br> <br> 
Enter FirstName: <form:input required="required" type = "text"  path = "firstName"/>  <br> <br> 
Enter LastName: <form:input  type = "text" path="lastName"/><br>  <br>
Enter age: <form:input required="required" type = "number" path="age"/><br>  <br>
Enter gender: <form:input  required="required" type = "text" path="gender"/><br>  <br>
Enter phoneNumber: <form:input  type = "text" path="phoneNumber"/><br>  <br>
Enter contactAddress: <form:input  type = "text" path="contactAddress"/><br>  <br>
Enter EmailId: <form:input  type = "text" path="emailId"/>   <br> <br>
Enter Password: <form:input required="required" type = "text"  path="password" /> <br> <br>


<input type="submit" value="submit">


</fieldset>

</form:form>
</center>

</body>
</html>