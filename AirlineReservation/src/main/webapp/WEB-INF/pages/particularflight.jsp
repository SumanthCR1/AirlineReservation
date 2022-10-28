<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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


body {
	background-image: url("images/aeroplane1.jpg");
	background-size: cover;
}
</style>

</head>
<body>

	<div class="topnav">

		<a>Welcome to AirRide.com</a> <a class="profile" href="userprofile">UserProfile</a> 
		<a class="admin" href="index"> Logout</a>

	</div><br><br>
<form action="/booking">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Welcome to Flight Booking Page</h1>

		<h1>The Flight Details are:</h1>

<fieldset style="width: 1000px">

 <table border = "1" width = "100%">
<thead>
<tr>
<th >flightnumber</th> 
<th>flightname</th>
<th>startsfrom</th>
<th>destination</th>
<th>arrivaltime</th>
<th>departuretime</th>
<th>traveltime</th>
<th>totalcapacity</th>
<th>numberofseatsavailable</th>
<th>typesofseatsavailable</th>
<th>price</th>

</tr>
</thead>
<tbody>
  <tr>

   <td>${flightdetails.flightnumber} </td> 
    <td>${flightdetails.flightname}</td>  
	<td>${flightdetails.startsfrom}</td>
	<td>${flightdetails.destination}</td>
	<td>${flightdetails.arrivaltime}</td>
	<td>${flightdetails.departuretime}</td>
	<td>${flightdetails.traveltime}</td>
	<td>${flightdetails.totalcapacity}</td>
	<td>${flightdetails.numberofseatsavailable}</td>
	<td>${flightdetails.typesofseatsavailable}</td>
	<td>${flightdetails.price}</td>

	</tr>
	
</tbody>
</table>

</fieldset>
<br><br>
<form action="confirmingdata" >
 <input type="submit" value="Confirm Flight"></input>
</form><br><br>
<form action="/fetchflightdetailslogin">
<input type="submit" value="Change Flight">
</form>
</center>

</body>
</html>