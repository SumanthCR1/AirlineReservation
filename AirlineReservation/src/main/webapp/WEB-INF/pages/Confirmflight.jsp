<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	</div><br><br
	
<form action="/booking">
<input type="submit" value="GoToBackPage">
</form>
	<center>
		<h1>Please Provide Details To Book The Flight Seats..</h1>
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
    <td>${number}</td> 
    <td>${name}</td>  
	<td>${starts}</td>
	<td>${destination}</td>
	<td>${arrivaltime}</td>
	<td>${departuretime}</td>
	<td>${price}</td>
</tbody>
</table>
</fieldset>
<form action="Checkout">
<br><br><br>
Enter Passanger Name: <input required="required" type = "text" placeholder="Enter Name" , name = "passangername">  <br> <br> 
Enter Age: <input  type = "number" placeholder="Enter Age" , name="age"><br>  <br>
Enter Number of Seats: <input  type = "number"  name="num"><br>  <br>
 <input type= "hidden"  name="price" value="${price}">
<input type ="submit" value="CheckOut">
</form>


</center>
</body>
</html>
