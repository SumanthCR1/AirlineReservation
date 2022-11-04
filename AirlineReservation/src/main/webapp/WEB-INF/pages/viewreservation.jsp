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

		<a href="/fetchFlightDetailsLogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirFly</a>
		 <a class="profile" href="userProfile">UserProfile</a> 
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div>
<center>

<h1> Congratulations  ${userName} </h1>
<h2>Your Seats Booked successfully</h2>
<br><br>
<h2>Flight Details are:</h2>

<h4> FlightNumber:  ${flightNumber }</h4>
<h4> DepartureFrom:  ${flightStartsFrom }</h4>
<h4> Destination:  ${destination }</h4>
<h4> Booked Date:  ${date}</h4>
<h4>DepartureTime:  ${departureTime }</h4>
<h4>GateNumber:  B12</h4>

<br><br>
<h2>Passanger Details are:</h2>
<h4> PassangerName:  ${passangerName}</h4>
<h4> PassangerAge:  ${passangerAge}</h4>
<h4> NumberOfSeatsBooked:  ${numberOfSeats}</h4>
<br><br>


<h2>Please Save This File and Provide this Confirmation letter for Verification while Travelling ...</h2>
<h2>Please Carry Your Any Government Id for Verification while Travelling</h2>

<h2>Please be in an Airport 2 Hours Early for the Security Check.. </h2>

<h2>Have a Happy Journey and Have a Happy Landing</h2><br><br>

<h2>Thankyou..</h2>
<h2>Happy Landing..</h2>
<form  action="/fetchFlightDetailsLogin" method="get">
<input type="submit" value="GotoHomePage" style="background-color: blue; color:white; height: 40px" ><br><br>
</form>
</center>
</body>
</html>
