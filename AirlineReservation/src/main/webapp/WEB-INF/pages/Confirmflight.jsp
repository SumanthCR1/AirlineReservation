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
		<a href="/fetchflightdetailslogin" style="background-color: green;">GoToHomePage</a>
		<a>Welcome to AirFly</a>
		 <a class="profile" href="/userprofile">UserProfile</a> 
		<a class="admin" href="/index" style="background-color: red;"> Logout</a>
	</div>
	
	
	
	<br><br>
	
<form action="/fetchflightdetailslogin">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Please Provide Passanger Details To Book The Flight Seats..</h1>
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
<th>Price</th>
</tr>
</thead>
<tbody>
    <td>${flightform.flightnumber}</td> 
    <td>${flightform.flightname}</td>  
	<td>${flightform.startsfrom}</td>
	<td>${flightform.destination}</td>
	<td>${flightform.arrivaltime}</td>
	<td>${flightform.departuretime}</td>
	<td>${flightform.price}</td>
</tbody>
</table>
</fieldset>
 <form:form modelAttribute="flightform" method="post" action="${editURL}">
      </form:form>
<form action="/Checkout" >
<br><br><br>
Enter Passanger Name: <input required="required" type = "text" placeholder="Enter Name" , name = "passangername">  <br> <br> 
Enter Passanger Age: <input  type = "number" placeholder="Enter Age" , name="age"><br>  <br>

 <input type= "hidden"  name="price" value="${flightform.price}">
 <input type= "hidden"  name="date" value="${date}">
 <input type= "hidden"  name="number" value="${number}">


<input type ="submit" value="Submit">
</form>


</center>
</body>
</html>
