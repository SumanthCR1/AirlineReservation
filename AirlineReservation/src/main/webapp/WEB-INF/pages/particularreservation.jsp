<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Status checking</title>
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
	<br><br>
<form action="/">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Welcome to Flight Booking Status Page</h1>
		<h1>The Booked Details are:</h1>
<fieldset style="width: 1000px">
 <table border = "1" width = "100%">
<thead>
<tr>
<th>Booked Id</th>
<th >FlightNumber</th> 
<th>FlightName</th>
<th>FlightStartsFrom</th>
<th>Destination</th>
<th>ArrivalTime</th>
<th>DepartureTime</th>
<th>Passanger Name</th>
<th>Passanger Age</th>
<th>No of Seats</th>
<th>User Name</th>
<th>User Emailid</th>
<th>User PhoneNumber`</th>
</tr>
</thead>
<tbody>
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
		</tr>
</tbody>
</table>
</fieldset>
<br><br>
</center>
</body>
</html>