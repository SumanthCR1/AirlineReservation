<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image:url('/aeroplane1.jpg');
}
</style>

</head>
<body>
<center>
<h1 style="background-color: blue;color: white; width: 800px">WELCOME </h1>
<h2 style="background-color: lightblue;color: black; width: 800px">To AirFly Online Flight Ticket Booking</h2>
<h2>The one platform you can book your dream journey...</h2>
<h2>The Air Travel Reservation..</h2>

<form method="get" action="index">
<input type="submit" value="CLick here to go to main page..."style=" color:black; height: 40px">
</form><br></br>

 <form class ="test3" action="Searchbookedstatus" method="post" >
 <h2>If You Have Already Booked And Want To Check Flight Status</h2><br>
Search Here<input required="required" type = "number" placeholder="Enter BookingID" name="bookingID"> <br><br>
 <input type="submit" value="Search"></input>
</form>

</center>

</body>
</html>