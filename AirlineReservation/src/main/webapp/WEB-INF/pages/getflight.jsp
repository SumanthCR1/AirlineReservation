<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
.activereg{
position: absolute;
left: 80%;
}

</style>
</head>
<body>
<body>
<form action="/index">
<input type="submit" value="GoToBackPage">
</form>

<center>
<h1> Welcome To The AirFly Website</h1>

<h1> The Flight Details are:</h1>
</center>

 <form class="test" action="/dataDisplay" method="post" >

<select name="data"  id="data">
  <option value="">Sort by </option>
  <option value="arrivalTime">sort by arrival time</option>
  <option value="price">sort by price</option>
  <option value="numberOfSeatsAvailable">sort by number of seats available</option>
  <option value="flightName">sort by flight name</option>
</select>

<input type= "hidden"  name="from" value="${from}">
<input type= "hidden"  name="to" value="${to}">
 <input type="submit" value="sort"></input>
	
</form> 
<center>


<form action="/login">
<input type="submit" value="To Book Flight Please Login Here" style="background-color: lightblue; color: black;" width="700px" height="40px">
<br><br><br>
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




<c:forEach items="${result}" var="flight">  
  <tr>
  
    <td>${flight.flightNumber}</td> 
    <td>${flight.flightName}</td>  
	<td>${flight.startsFrom}</td>
	<td>${flight.destination}</td>
	<td>${flight.arrivalTime}</td>
	<td>${flight.departureTime}</td>
	<td>${flight.travelTime}</td>
	<td>${flight.totalCapacity}</td>
	<td>${flight.numberOfSeatsAvailable}</td>
	<td>${flight.typesOfSeatsAvailable}</td>
	<td>${flight.price}</td>
     
    
</c:forEach>


</tbody>
</table>
  
</fieldset>

</center>
<script>

</body>
</html>