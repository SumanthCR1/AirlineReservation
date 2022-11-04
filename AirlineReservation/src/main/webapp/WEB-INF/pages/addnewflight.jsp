<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Flight Data Entry</title>
</head>
<body>
<form action="fetchFlightDetailsFromadmin" >
<input type="submit" value="GoToBackPage">
</form>

<center>
<form  action="addNewFlight" method="post" >

<h1>Enter Flight Details...</h1>
<fieldset style="width: 500px">

Enter FlightNumber: <input required="required" type = "number" placeholder="Enter FlightNumber" , name = "flightNumber">  <br><br> 
Enter FlightName: <input  type = "text" placeholder="Enter FlightName" , name="flightName"><br><br>
Enter StartsFrom: <input required="required" type = "text" placeholder="Enter StartsFrom" , name="startsFrom"><br><br>
Enter Destination: <input  required="required" type = "text" placeholder="Enter Destination" , name="destination"><br><br>
Enter ArrivalTime: <input  type = "text" placeholder="Enter ArrivalTime" , name="arrivalTime"><br><br>
Enter DepartureTime: <input  type = "text" placeholder="Enter DepartureTime" , name="departureTime"><br><br>
Enter traveltime: <input  type = "text" placeholder="Enter traveltime" , name="travelTime" >   <br><br>
Enter totalcapacity: <input required="required" type = "number" placeholder="Enter totalcapacity" , name="totalCapacity" >   <br><br>
Enter numberofseatsavailable: <input required="required" type = "number" placeholder="Enter numberofseatsavailable" , name="numberOfSeatsAvailable" >  <br> <br>
Enter typesofseatsavailable: <input required="required" type = "text" placeholder="Enter typesofseatsavailable" , name="typesOfSeatsAvailable" >   <br> <br>
Enter price: <input required="required" type = "number" placeholder="Enter price" , name="price" >   <br> <br>

<input type="submit" value="submit">

</fieldset>


</form>
</center>

</body>
</html>