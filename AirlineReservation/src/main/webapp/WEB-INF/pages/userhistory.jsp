<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passanger History</title>
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
		<a>Welcome to AirFly</a> <a class="profile" href="userprofile">UserProfile</a>
		<a class="admin" href="index" style="background-color: red;">
			Logout</a>

	</div>
	<br>
	<br>
	<form action="/userprofile">
		<input type="submit" value="GoToBackPage">
	</form>
	<center>
		<h1>Welcome to Passanger History Page</h1>
		<h1>The Booked History are:</h1>
		<fieldset style="width: 1000px">
			<table border="1" width="100%">
				<thead>
					<tr>
						<th>booked Id</th>
						<th>flightNumber</th>
						<th>flightName</th>
						<th>flightStartsFrom</th>
						<th>destination</th>
						<th>arrivalTime</th>
						<th>departureTime</th>
						<th>passanger Name</th>
						<th>passanger Age</th>
						<th>no of Seats</th>
						<th>user Name</th>
						<th>user Emailid</th>
						<th>user PhoneNumber`</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${user}" var="user">

						<tr>
							<td>${user.bookingID }</td>
							<td>${user.flightNumber}</td>
							<td>${user.flightName}</td>
							<td>${user.flightStartsFrom}</td>
							<td>${user.destination}</td>
							<td>${user.arrivalTime}</td>
							<td>${user.departureTime}</td>
							<td>${user.passangerName}</td>
							<td>${user.passangerAge}</td>
							<td>${user.numberOfSeats}</td>
							<td>${user.userName}</td>
							<td>${user.userEmailid}</td>
							<td>${user.userPhoneNumber}</td>
							<td>



								<form action="/deletehistory/${user.bookingID}">
								
									<input type="submit" value="Cancel ">
								</form>

							</td>

						</tr>
					</c:forEach>

				</tbody>
			</table>
		</fieldset>
		<br> <br>
	</center>
</body>
</html>