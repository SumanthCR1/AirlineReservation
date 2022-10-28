<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/fetchflightdetailslogin">
<input type="submit" value="GoToBackPage">
</form>
<center>
<body>

<br><br>
<h1>Welcome to the AirFly Booking Page</h1>

<h2>To Book Your Seat in the Perticular flight </h2>
<h2>Please Enter the Flight Number to book your seat in the below</h2>


 <form action="Searchstatus" method="post" >

Enter the flight  Here<input required="required" type = "number" placeholder="Enter flight number" name="flightno"> <br><br>
 <input type="submit" value="Search"></input>
</form>

</center>


</body>
</html>