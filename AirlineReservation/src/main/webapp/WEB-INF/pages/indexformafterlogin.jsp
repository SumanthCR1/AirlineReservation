<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Login Page</title>
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

.Book {
	position: absolute;
	left: 85%;
}
</style>

</head>
<body>

	<div class="topnav">

		<a href="/fetchFlightDetailsLogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirRide.com</a> <a class="profile" href="userProfile">UserProfile</a>
		<a class="admin" href="index" style="background-color: red;">
			Logout</a>

	</div>
	<br>
	<br>

	<center>
		<h1>Welcome Back to AirFly Online Flight Booking</h1>
		<fieldset style="color: black; width: 500px">

			<h1>AirRide Flight Booking Form</h1>
			<h3>Filter Details By</h3>
			<form action="fetchFlightDetailsLoginIndex">
				<select style="width: 150px; margin: 20px" name="from">
					<option value="">From</option>

					<option value="Bihar">Bihar</option>
					<option value="Banglore">Banglore</option>
					<option value="Delhi">Delhi</option>
					<option value="MadhyaPradesh">MadhyaPradesh</option>
					<option value="Mysore">Mysore</option>


				</select> <select style="width: 150px; margin: 20px" name="to">
					<option value="">To</option>


					<option value="Banglore">Banglore</option>
					<option value="Delhi">Delhi</option>
					<option value="Mysore">Mysore</option>

				</select> <input required="required" type="date" placeholder="Select date"
					, name="date"> <select style="width: 150px; margin: 20px"
					name="Preference">

					<option value="">Preffered Airline</option>
					<option value="IndiGo">IndiGo</option>
					<option value="AirIndia">Air India</option>
					<option value="GoFirst">Go First</option>
					<option value="AirAsiaIndia">AirAsia India</option>
					<option value="Vistara">Vistara</option>
					<option value="AllianceAir">Alliance Air</option>
					<option value="TruJet">TruJet</option>

				</select> <select style="width: 150px; margin: 20px" name="seat">
					<option value="">Preffered Seating</option>
					<option value="Business">Business Class</option>
					<option value="Economy">Economy Class</option>
					<option value="First Class">First Class</option>
					<option value="Premium">Premium</option>
				</select>
				</div>
				<br>
				<br> <input required="required" type="number"
					placeholder="Enter numberOfSeats" , name="number">

				</div>
				<br>
				<br>
				<div>

					<input type="hidden" name="firstName" value="${firstName}">
					<input type="hidden" name="emailId" value="${emailId}"> <input
						type="hidden" name="phoneNumber" value="${phoneNumber}">

					<button type="submit">Submit Form</button>
			</form>
			<br></br>

			</div>

		</fieldset>

	</center>


</body>
</html>
