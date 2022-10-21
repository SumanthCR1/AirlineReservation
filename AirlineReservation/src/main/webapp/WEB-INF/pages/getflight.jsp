<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> welcome</h1>


<h1> The Flight Details are:</h1>

<table>
<thead>
<tr>
<th>flightnumber</th>
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
<c:forEach var="x" items="${cust}">
<%--  
<% 
for(Flight g:cust)
{
 %>
  --%>


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
<%--  <%
}
%>--%>
</tr>
</c:forEach>
</tbody>
</table>
  


</body>
</html>