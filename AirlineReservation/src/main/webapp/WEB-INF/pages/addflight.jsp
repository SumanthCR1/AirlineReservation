<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Flight</title>
</head>
<body>
<spring:url value="/addFlight" var="addURL" />
<form:form modelAttribute="flightForm" method="post" action="${addURL}" cssClass="form" >
   <form:hidden path="flightnumber"/>
<input type="submit" value="GoToBackPage">

<center>

<h1>Enter Flight Details...</h1>
<fieldset style="width: 500px">

Enter FlightNumber: <form:input required="required" type = "number" placeholder="Enter FlightNumber"  path = "flightnumber"/>  <br> <br> 
Enter FlightName: <form:input  type = "text" placeholder="Enter FlightName"  path="flightname"/><br>  <br>
Enter StartsFrom: <form:input required="required" type = "text" placeholder="Enter StartsFrom"  path="startsfrom"/><br>  <br>
Enter Destination: <form:input  required="required" type = "text" placeholder="Enter Destination"  path="destination"/><br>  <br>
Enter ArrivalTime: <form:input  type = "text" placeholder="Enter ArrivalTime"  path="arrivaltime"/><br>  <br>
Enter DepartureTime: <form:input  type = "text" placeholder="Enter DepartureTime"  path="departuretime"/><br>  <br>
Enter traveltime: <form:input  type = "text" placeholder="Enter traveltime"  path="traveltime"/>   <br>    <br>
Enter totalcapacity: <form:input required="required" type = "totalcapacity" placeholder="Enter Email id"  path="totalcapacity" />   <br>    <br>
Enter numberofseatsavailable: <form:input required="required" type = "number" placeholder="Enter numberofseatsavailable" path="numberofseatsavailable"/>   <br>    <br>
Enter typesofseatsavailable: <form:input required="required" type = "text" placeholder="Enter typesofseatsavailable" path="typesofseatsavailable" />   <br>    <br>
Enter price: <form:input required="required" type = "number" placeholder="Enter price"  path="price" />   <br>    <br>

<input type="submit" value="submit">


</fieldset>

</form:form>
</center>

</body>
</html>