<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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

		<a>Welcome to AirRide.com</a> 
		<a href="fetchpassangerdetails">Passenger Data</a> 
		<a class="admin" href="index"> Logout</a>

	</div>

	<center>
		<h1>Welcome To The Admin Portal</h1>

		<h1>The Flight Details are:</h1>
	</center>

  <br><br>
<center>
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
	<spring:url value="deleteflight" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Update</a></td>
	<td>
	<spring:url value="deleteflight" var="deleteURL" />
       <a class="btn btn-danger" href="${deleteURL}" role="button" >Delete</a></td>
 
  
    
</c:forEach>


</tbody>
</table>
  
</fieldset>
</center>

</body>
</html>