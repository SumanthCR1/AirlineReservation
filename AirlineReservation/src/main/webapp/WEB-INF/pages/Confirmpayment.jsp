<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PayBillPage</title>
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
		 <a class="profile" href="/userprofile">UserProfile</a> 
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div><br><br>
	
<form action="/fetchflightdetailslogin">
<input type="submit" value="GoToBackPage">
</form>

<center>
<h1>Thankyou for Requesting for Booking the Seats With Us..</h1>
<h2>Please pay the Total Price to Confirm Your Seats</h2>
<h2>After Successful Payment Your Seats Will be Booked...</h2>
<h1>Your Total Payment is:</h1>

<h2>${Total}/-</h2>

<form action="/Confirmed">
<input type="hidden" name="firstname" value="${firstname}">
<input  type= "hidden" name="emailid" value="${emailid}">
<input  type= "hidden" name="phonenumber" value="${phonenumber}">
<input type="submit" value="PayTheBill" style="background-color: blue; color:white; height: 40px">
</form>

</center>
</body>
</html>