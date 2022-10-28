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
.Book{
	position: absolute;
	left: 85%;
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

	</div>

	<center>
		<h1>welcome</h1>

		<h1>The Flight Details are:</h1>
	</center>
 <form class="test" action="/datadisplayafterlogin" method="post" >
 

<select name="data"  id="data">
  <option value="">sort by </option>
  <option value="arrivaltime">sort by arrival time</option>
  <option value="price">sort by price</option>
  <option value="numberofseatsavailable">sort by number of seats available</option>
  <option value="flightname">sort by flight name</option>
  <option value="flightnumber">sort by flight number</option>
  <option value="traveltime">sort by travel time</option>
</select>
 <input type="submit" value="sort"></input>
	
</form > 

  <br>
  	
<form class ="Book"  action="/booking">
<td><input type="submit" value="To Book flight click here"></td>
</form><br><br>
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



<c:forEach items="${resultlogin}" var="x">  
  
  <tr>

   <td>${x.flightnumber} </td> 
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

	</tr>
	

 
 </c:forEach>

</tbody>
</table>



</fieldset>
</center>

</body>
</html>