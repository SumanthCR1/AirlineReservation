<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1> welcome</h1>

<h1> The Flight Details are:</h1>


 <form  action="/datadisplay" method="post" >

<select name="data"  id="data">
  <option value="">search by </option>
  <option value="arrivaltime">search by time</option>
  <option value="price">search by price</option>
  <option value="numberofseatsavailable">search by number of seats available</option>
  <option value="flightname">search by flight name</option>
</select>
 <input type="submit" value="Search"></input><br></br>
	
</form> <br>

<input type="text" name="" id="MyInput" placeholder="Search..." onkeyup="searchfun()"> </input><br><br>


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
const searchfun=()=>{
	let filter = document.getElementById('MyInput').value.toUpperCase();
	let myTable = document.getElementById('MyTable');
	let tr= MyTable.getElementsByTagName('tr');
	
	for(var i=0; i<tr.length; i++){
		let td= tr[i].getElementsByTagName('td')[0];
		if(td){
			let textvalue=td.textContent||td.innerHTML;
			if (textvalue)
			}
	}
	
}


</script>
</body>
</html>