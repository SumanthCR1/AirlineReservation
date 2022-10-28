<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

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
.Book{
	position: absolute;
	left: 85%;
	}

body {
	background-image: url("images/aeroplane1.jpg");
	background-size: cover;
}
</style>

</head>
<body>

	<div class="topnav">

		<a class="admin" href="index"> Logout</a>

	</div>
<form action="fetchflightdetailsfromadmin">
<input type="submit" value="GoBack">
</form>

	<center>
		<h1>welcome</h1>

		<h1>The Passanger Details are:</h1>

<fieldset style="width: 1000px">

 <table border = "1" width = "100%">
<thead>
<tr>
<th >Passanger id</th> 
<th>FirstName</th>
<th>LastName</th>
<th>Age</th>
<th>Gender</th>
<th>PhoneNumber</th>
<th>ContactAddress</th>
<th>EmailId</th>

</tr>
</thead>
<tbody>



<c:forEach items="${list}" var="x">  
  
  <tr>

   <td>${x.id} </td> 
    <td>${x.firstname}</td>  
	<td>${x.lastname}</td>
	<td>${x.age}</td>
	<td>${x.gender}</td>
	<td>${x.phonenumber}</td>
	<td>${x.contactaddress}</td>
	<td>${x.emailid}</td>
	</tr>

 </c:forEach>

</tbody>
</table>



</fieldset>
</center>

</body>
</html>