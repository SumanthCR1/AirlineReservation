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


.profile{
position: absolute;
left: 80%;
}

.admin{
position: absolute;
left: 92%;
}

body {
  background-image:url("images/aeroplane1.jpg");
  background-size: cover;
}
</style>

</head>
<body>


<div class="topnav">
 
  <a>Welcome to AirRide.com</a>
 <a class="profile" href="userprofile"> UserProfile</a>
 <a class="admin" href="login"> Logout</a>
 
</div>

<center>

<h1>Welcome to AirRide.com</h1>

 <div class="container">
<fieldset style="color: black;width: 1000px"; >
<label id="data">  Filter the flight by  </label>
<form  action="datadisplay" >
 <select id="data">
 
 
 					<option value="data">Search based on</option>
                    <option value="data">Baser on starting point</option>
                    <option value="data">Baser on destination point</option>
                    <option value="data">Based on arrival time</option>
                    <option value="data">Based on number of seats available</option>
                    <option value="data">Based on type of seats available</option>
                    <option value="data">Based on price</option>
</select>
	<input type="submit" value="submit">
</form> <br><br>
<form  action="flightstatusdisplay"  >
<label id="flightdata"> Get the flight status </label>

<select id="flightdata">

 					<option value="flightdata">Select the airport to see the flights status..</option>
                    <option value="flightdata">Banglore</option>
                    <option value="flightdata">Manglore</option>
                    <option value="flightdata">Mysore</option>
                    <option value="flightdata">Mumbai</option>
                    <option value="flightdata">Chennai</option>
                    <option value="flightdata">Goas</option>
</select>
<input type="submit" value="submit">

</form>
</div>
</fieldset>
</center>

</body>
</html>