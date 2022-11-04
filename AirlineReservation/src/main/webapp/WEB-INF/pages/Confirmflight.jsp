<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PassangerDataEntryPage</title>
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
		 <a class="profile" href="/userProfile">UserProfile</a> 
		<a class="admin" href="/index" style="background-color: red;"> Logout</a>
	</div>
	
	
	
	<br><br>
	
<form action="/fetchFlightDetailsLogin">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Please Provide Passanger Details To Book The Flight Seats..</h1>
<fieldset style="width: 1000px">
 <table border = "1" width = "100%">
<thead>
<tr>
<th >Flightnumber</th> 
<th>Flightname</th>
<th>Startsfrom</th>
<th>Destination</th>
<th>Arrivaltime</th>
<th>Departuretime</th>
<th>Price</th>
</tr>
</thead>
<tbody>
    <td>${flightform.flightNumber}</td> 
    <td>${flightform.flightName}</td>  
	<td>${flightform.startsFrom}</td>
	<td>${flightform.destination}</td>
	<td>${flightform.arrivalTime}</td>
	<td>${flightform.departureTime}</td>
	<td>${flightform.price}</td>
</tbody>
</table>
</fieldset>
 <form:form modelAttribute="flightform" method="post" action="${editURL}">
      </form:form>
<form action="/checkOut" >
<br><br><br>
Enter Passanger Name: <input required="required" type = "text" placeholder="Enter Name" , name = "passangerName">  <br> <br> 
Enter Passanger Age: <input  type = "number" placeholder="Enter Age" , name="age"><br>  <br>

 <input type= "hidden"  name="price" value="${flightform.price}">
 <input type= "hidden"  name="date" value="${date}">
 <input type= "hidden"  name="number" value="${number}">
<input type="hidden" name="firstname" value="${firstName}">
<input  type= "hidden" name="emailid" value="${emailId}">
<input  type= "hidden" name="phonenumber" value="${phoneNumber}">

<input type ="submit" value="Submit">
</form>


</center>
</body>
</html>
