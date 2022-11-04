<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirRide.com</title>
<style>
.topnav {
	background-color: black;
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

.activereg {
	position: absolute;
	left: 75%;
	background-color: white;
}

.admin {
	position: absolute;
	left: 93%;
	background-color: Lightblue;
}

body {
	background-image: url('aeroplane2.jpg');
	background-size: cover;
}
</style>
</head>
<body>

	<div class="topnav">

		<a>Welcome to AirFly</a> 
		<a class="admin" href="admin" style="color: black;"> Admin</a>
		<a class="activereg" href="login" style="color: black;">Login/Create new account</a>

	</div>
	<br>
	<br>
	<form action="/">
		<input type="submit" value="GoToBackPage">
	</form>
	<center>
		<h1 style="color: white">Welcome to AirFly Online Flight Booking</h1>
		<fieldset style="color: black; width: 500px">

			<h1 style="color: white">AirRide Booking Form</h1>
			<h3 style="color: white">Booking Details</h3>
			<form action="fetchFlightDetails">
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
					
				</select> <input type="date" placeholder="Departure Date"
					style="width: 120px; margin: 20px" name="date"> <select
					style="width: 150px; margin: 20px" name="Preference">
					
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

				<div style="width: 150px; margin: 20px">
					<input type="number" id="input-group" placeholder="Adult" name="noOfSeats"><br></br> 
						<input type="number" id="input-group" placeholder="Children(0-11years)"><br></br>

				</div>



				<div>

					<button type="submit">Submit Form</button>
						</form><br></br>
				</div>
				<h2>To View All Flights</h2>
		
			<form action="/fetchAllFlightDetails">
		<input type="submit" value="Click Here.."><br><br><br>
	</form>
		</fieldset>

	</center>


</body>
</html>