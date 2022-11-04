<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
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
.Book{
	position: absolute;
	left: 85%;
	}

</style>

</head>
<body>

		<div class="topnav">

		<a >Welcome to AirFly</a> 
		<a href="fetchPassangerDetails">UserData</a> 
		
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div><br><br>
<form action="fetchFlightDetailsFromAdmin">
<input type="submit" value="GoBack">
</form>

	<center>
		<h1>Welcome Admin</h1>

		<h1>The Reserved Passanger Details are:</h1>

<fieldset style="width: 1000px">

 <table border = "1" width = "100%">
<thead>
<tr>
<th>Booked Id</th>
<th >FlightNumber</th> 
<th>FlightName</th>
<th>FlightStartsFrom</th>
<th>Destination</th>
<th>BookedDate</th>
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



<c:forEach items="${data}" var="user">  
	  <tr>
	    <td>${user.bookingID }</td>
	    <td>${user.flightNumber}</td>  
		<td>${user.flightName}</td>
		<td>${user.flightStartsFrom}</td>
		<td>${user.destination}</td>
		<td>${user.bookedDate}</td>
		<td>${user.arrivalTime}</td>
		<td>${user.departureTime}</td>
		<td>${user.passangerName}</td>
		<td>${user.passangerAge}</td>
		<td>${user.numberOfSeats}</td>
		<td>${user.userName}</td>
		<td>${user.userEmailid}</td>
		<td>${user.userPhoneNumber}</td>
		</tr>
	
	 </c:forEach>

</tbody>
</table>



</fieldset>
</center>

</body>
</html>