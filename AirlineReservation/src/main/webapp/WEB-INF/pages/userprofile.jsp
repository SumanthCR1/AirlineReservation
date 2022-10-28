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
<form action="/fetchflightdetailslogin" >
<input type="submit" value="GoToBackPage">
</form>
<center>
 
<h1>Hello  ${user.firstname}</h1>
<h2>Your profile details are:</h2>
<h3>FirstName:	${user.firstname }</h3>
<h3>LastName:	${user.lastname }</h3>	
<h3>EmailId:	${user.emailid }</h3>	
<h3>Phone number:	${user.phonenumber }</h3>	
<h3>Contact address:	${user.contactaddress }</h3>	



</center>



</body>
</html>