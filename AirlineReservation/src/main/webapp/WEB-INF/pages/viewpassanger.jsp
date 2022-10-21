<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="/login" method="get">
<h1> View Passanger Details </h1>
<h2>Details are submitted as follows</h2>

<h4> Passenger ID  :${id }</h4>
<h4> firstName  :${firstname }</h4>
<h4> lastName  :${lastname }</h4>
<h4> age  :${age }</h4>
<h4> gender  :${gender }</h4>
<h4> phoneNumber  :${phonenumber }</h4>
<h4>contact_address :${contactaddress }</h4>
<h4> email_id  :${emailid}</h4>

<h1> Data inserted into Table</h1>
<input type="submit" value="Go to login page">

</body>
</html>