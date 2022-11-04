<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FlightLists</title>
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

		<a href="/fetchFlightDetailsLogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirFly</a>
		 <a class="profile" href="userProfile">UserProfile</a> 
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div><br><br>
<form action="/fetchFlightDetailsLogin">	
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Welcome</h1>

		<h1>The Flight Details are:</h1>
	</center>
 <form class="test" action="/dataDisplayAfterLogin" method="post" >
 

<select name="data"  id="data">
  <option value="">sort by </option>
  <option value="arrivalTime">sort by arrival time</option>
  <option value="price">sort by price</option>
  <option value="numberOfSeatsAvailable">sort by number of seats available</option>
  <option value="flightName">sort by flight name</option>
  <option value="flightNumber">sort by flight number</option>
  <option value="travelTime">sort by travel time</option>
</select>
<input type= "hidden"  name="from" value="${from}">
<input type= "hidden"  name="to" value="${to}">
 <input type="submit" value="sort"></input>
	
</form > 


  <br>
  	

<center>

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
<th>Traveltime</th>
<th>Totalcapacity</th>
<th>Numberofseatsavailable</th>
<th>Typesofseatsavailable</th>
<th>Price</th>

</tr>
</thead>
<tbody>



<c:forEach items="${resultlogin}" var="user">  
  
  <tr>

   <td>${user.flightNumber} </td> 
    <td>${user.flightName}</td>  
	<td>${user.startsFrom}</td>
	<td>${user.destination}</td>
	<td>${user.arrivalTime}</td>
	<td>${user.departureTime}</td>
	<td>${user.travelTime}</td>
	<td>${user.totalCapacity}</td>
	<td>${user.numberOfSeatsAvailable}</td>
	<td>${user.typesOfSeatsAvailable}</td>
	<td>${user.price}</td>
	
	 <td>
      <form action="/searchStatus/${user.flightNumber}" method="post">	
       <input type= "hidden"  name="number" value="${number}">
       <input type= "hidden"  name="date" value="${date}">
		<input type="submit" value="BOOK">
       </form>
      </td>
     
	

	</tr>
	

 
 </c:forEach>

</tbody>
</table>



</fieldset>

</center>

</body>
</html>