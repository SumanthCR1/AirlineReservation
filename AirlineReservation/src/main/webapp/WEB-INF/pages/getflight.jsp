<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
.activereg{
position: absolute;
left: 80%;
}

</style>
</head>
<body>
<body>
<form action="/index">
<input type="submit" value="GoToBackPage">
</form>
<a class="activereg" href="login">Login/Create new account</a>
<center>
<h1> welcome</h1>

<h1> The Flight Details are:</h1>
</center>

 <form class="test" action="/datadisplay" method="post" >

<select name="data"  id="data">
  <option value="">sort by </option>
  <option value="arrivaltime">sort by time</option>
  <option value="price">sort by price</option>
  <option value="numberofseatsavailable">sort by number of seats available</option>
  <option value="flightname">sort by flight name</option>
</select>
 <input type="submit" value="sort"></input>
	
</form> 
<center>
<h2>To Book Flight Please Login </h2>
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




<c:forEach items="${result}" var="x">  
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
     
    
</c:forEach>


</tbody>
</table>
  
</fieldset>

</center>
<script>

</body>
</html>