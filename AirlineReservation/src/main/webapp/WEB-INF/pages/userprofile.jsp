<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Profile</title>
<style>
.topnav {
	background-color: gray;
	overflow: hidden;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.profile {
	position: absolute;
	left: 80%;
}

.admin {
	position: absolute;
	left: 92%;
}
</style>
</head>
<body>

	<div class="topnav">

		<a href="/fetchflightdetailslogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirFly</a>
		 <a class="profile" href="userprofile">UserProfile</a> 
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div><br>

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

 <form action="/Searchbookedhistory" method="get">

<input type="hidden" name="userName" value="${user.firstname }"></input>

<input type="submit" value="Go To Booked History" style="width: 150px"><br><br>
</form>
 <form action="/editPassangerData/${user.id}" >

<input type="submit" value="Update Profile" style="width: 200px">
</form>

</fieldset>

</center>

</body>
</html>