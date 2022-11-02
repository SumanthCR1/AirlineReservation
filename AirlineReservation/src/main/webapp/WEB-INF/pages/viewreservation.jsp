<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ConfirmedReservationPage</title>
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

	</div>
<center>
<form  action="/fetchflightdetailslogin" method="get">
<h1> Congratulations  ${UserName} </h1>
<h2>Your Seats Booked successfully</h2>
<br><br>
<h2>Flight Details are:</h2>

<h4> FlightNumber:  ${FlightNumber }</h4>
<h4> DepartureFrom:  ${FlightStartsFrom }</h4>
<h4> Destination:  ${Destination }</h4>
<h4> Booked Date:  ${date}</h4>
<h4>DepartureTime:  ${DepartureTime }</h4>
<h4>GateNumber:  B12</h4>

<br><br>
<h2>Passanger Details are:</h2>
<h4> PassangerName:  ${PassangerName}</h4>
<h4> PassangerAge:  ${PassangerAge}</h4>
<h4> NumberOfSeatsBooked:  ${NumberOfSeats}</h4>
<br><br>
</form>

<h2>Please Save This File and Provide this Confirmation letter for Verification while Travelling ...</h2>
<h2>Please Carry Your Any Government Id for Verification while Travelling</h2>

<h2>Please be in an Airport 2 Hours Early for the Security Check.. </h2>

<h2>Have a Happy Journey and Have a Happy Landing</h2><br><br>

<h2>Thankyou..</h2>
<h2>Happy Journey..</h2>

<input type="submit" value="GotoHomePage" style="background-color: blue; color:white; height: 40px" ><br><br>
</center>
</body>
</html>
