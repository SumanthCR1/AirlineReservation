<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
</head>
<body>
<form action="/fetchflightdetailslogin" >
<input type="submit" value="GoToBackPage">
</form>
<center>

<h1>Hello  ${user.firstname}</h1><br>
<h2>Your Profile Details are:</h2>

<fieldset style="width: 1000px">

<h3>FirstName:	${user.firstname }</h3>
<h3>LastName:	${user.lastname }</h3>	
<h3>EmailId:	${user.emailid }</h3>	
<h3>Phone number:	${user.phonenumber }</h3>	
<h3>Contact address:	${user.contactaddress }</h3><br>
${user.id}

 <form action="/Searchbookedhistory" method="get">

<input type="hidden" name="userName" value="${user.firstname }"></input>

<input type="submit" value="Go To Booked History" style="width: 150px"><br><br>
</form>

 <form action="editPassangerData/${user.id}" method="get">
<input type="hidden" name="userName" value="${user.firstname }"></input>
<input type="submit" value="Update" style="width: 150px"><br><br>
</form>

</fieldset>




</center>



</body>
</html>