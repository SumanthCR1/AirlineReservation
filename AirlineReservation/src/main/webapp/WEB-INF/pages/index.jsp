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
}

.admin {
	position: absolute;
	left: 93%;
}

body {
	background-image: url("images/aeroplane1.jpg");
	background-size: cover;
}
</style>
</head>
<body>

	<div class="topnav">

		<a>Welcome to AirFly.com</a> <a class="admin" href="admin"> Admin</a>
		<a class="activereg" href="login">Login/Create new account</a>

	</div><br><br>
<form action="/">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Welcome to AirFly.com</h1>
		<fieldset style="color: black; width: 500px">
			<div class="container">

</div>
				<form class="form-group">
					<h1 class="text-center">AirRide Booking Form</h1>

					<div id="form">
						<h3 class="text-white">Booking Details</h3>

						<select style="width: 150px; margin: 20px" name="from" >
							<option value="">From</option>
							<option value="AndhraPradesh">Andhra Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Banglore">Banglore</option>
							<option value="Delhi">Delhi</option>
							<option value="Goa">Goa</option>
							<option value="Kerala">Kerala</option>
							<option value="MadhyaPradesh">Madhya Pradesh</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Manglore">Manglore</option>
							<option value="Mumbai">Mumbai</option>
							<option value="Mysore">Mysore</option>
							<option value="NewDelhi">NewDelhi</option>
							<option value="Punjab">Punjab</option>
							<option value="TamilNadu">Tamil Nadu</option>
						</select> 
						<select style="width: 150px; margin: 20px" name="to">
							<option value="">From</option>
							<option value="AndhraPradesh">Andhra Pradesh</option>
							<option value="Assam">Assam</option>
							<option value="Bihar">Bihar</option>
							<option value="Banglore">Banglore</option>
							<option value="Delhi">Delhi</option>
							<option value="Goa">Goa</option>
							<option value="Kerala">Kerala</option>
							<option value="MadhyaPradesh">Madhya Pradesh</option>
							<option value="Maharashtra">Maharashtra</option>
							<option value="Manglore">Manglore</option>
							<option value="Mumbai">Mumbai</option>
							<option value="Mysore">Mysore</option>
							<option value="NewDelhi">NewDelhi</option>
							<option value="Punjab">Punjab</option>
							<option value="TamilNadu">Tamil Nadu</option>
						</select> 
						
						
							<input type="date" placeholder="Departure Date"
							style="width: 120px; margin: 20px" name="date"> 
							
						<select
							style="width: 150px; margin: 20px" name="Preference">
							<option value="">Preffered Airline</option>
							<option value="IndiGo">IndiGo</option>
							<option value="AirIndia">Air India</option>
							<option value="GoFirst">Go First</option>
							<option value="AirAsiaIndia">AirAsia India</option>
							<option value="Vistara">Vistara</option>
							<option value="AllianceAir">Alliance Air</option>
							<option value="TruJet">TruJet</option>
						</select> 
						
							<select style="width: 150px; margin: 20px" name="seat">
							<option value="">Preffered Seating</option>
							<option value="Business">Business Class</option>
							<option value="Economy">Economy Class</option>							
							<option value="First Class">First Class</option>
							<option value="Premium">Premium</option>
						</select>
					</div>

					<div style="width: 150px; margin: 20px" >
						<input type="number" id="input-group" placeholder="Adult" name="noofseats"><br></br>
						<input type="number" id="input-group" placeholder="Children(0-11years)"><br></br>

					</div>

				</form>

				<div>
					<form action="fetchflightdetails">
						<button type="submit">Submit Form</button>
						<br></br>
						<button type="reset" class="btn btn-primary">Clear Form</button>
				</div>
				</form>
		</fieldset>

	</center>


</body>
</html>