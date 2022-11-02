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

body {
	background-image: url("images/aeroplane1.jpg");
	background-size: cover;
}
</style>

</head>
<body>

	<div class="topnav">

		<a href="/fetchflightdetailslogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirFly</a>
		 <a class="profile" href="userprofile">UserProfile</a> 
		<a class="admin" href="index" style="background-color: red;"> Logout</a>

	</div><br><br>
<form action="/fetchflightdetailslogin">	
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Welcome</h1>

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
	
	 <td>
      <form action="/Searchstatus/${x.flightnumber}" method="post">	
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