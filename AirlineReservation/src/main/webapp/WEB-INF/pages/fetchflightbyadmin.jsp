<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
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

.admin {
	position: absolute;
	left: 92%;
}
.addflight {
	position: absolute;
	left: 85%;
}
</style>

</head>
<body>

	<div class="topnav">

		<a >Welcome to AirFly</a> 
		<a href="fetchpassangerdetails">UserData</a> 
		<a href="fetchreservedpassangerdetails">ReservedPassengerData</a> 
		<a class="admin" href="index" style="background-color: red"> Logout</a>

	</div>

	<center>
		<h1>Welcome To The Admin Portal</h1>

		<h1>The Flight Details are:</h1>
	
  <form action="/addflight1st">

<input class="addflight" type="submit" value="Add New Flight" style="background-color: green; color: white;height:40px; width: 150px">

</form><br><br><br>

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

<c:forEach items="${fromadmin}" var="x">  
  <tr>

   <td>${x.flightnumber}</td> 
    <td>${x.flightname}</td>  
	<td>${x.startsfrom}</td>
	<td>${x.destination}</td>
	<td>${x.arrivaltime}</td>
	<td>${x.departuretime}</td>
	<td>${x.traveltime}</td>
	<td>${x.totalcapacity}</td>
	<td>${x.numberofseatsavailable}</td>
	<td>${x.typesofseatsavailable}</td>
	<td>${x.price}</td>
	 <td>
       <spring:url value="editFlight123/${x.flightnumber}" var="editURL" />
       <a href="${editURL}" role="button">Update</a>
      </td>
      	
	<td>
       <spring:url value="/deleteflight/${x.flightnumber}" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a>
      </td>
       <input type= "hidden"  name="flightnumber" value="${flightnumber}">
	

</c:forEach>


</tbody>
</table>
 
</fieldset>
 <br><br>

</center>

</body>
</html>