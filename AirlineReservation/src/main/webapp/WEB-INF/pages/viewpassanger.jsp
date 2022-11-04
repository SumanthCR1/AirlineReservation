<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form  action="/login" method="get">
<h1> View Passanger Details </h1>
<h2>Details are submitted as follows</h2>

<h4> Passenger ID  :${id }</h4>
<h4> firstName  :${firstName }</h4>
<h4> lastName  :${lastName }</h4>
<h4> age  :${age }</h4>
<h4> gender  :${gender }</h4>
<h4> phoneNumber  :${phoneNumber }</h4>
<h4>contact_address :${contactAddress }</h4>
<h4> email_id  :${emailId}</h4>

<h1>Registered successfully</h1>
<input type="submit" value="Go to login page">
</center>
</body>
</html>