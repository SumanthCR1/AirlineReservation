<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to MyAirTravel.com</h1>
<h1>Welcome in</h1>

 <sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
         url = "jdbc:mysql://localhost/TEST"
         user = "root" password = "Sumanth@123"/>
         <sql:query dataSource = "${snapshot}" var = "result">
         SELECT * from Flight where ;
      </sql:query>
      <table border = "1" width = "100%">
         <tr>
            <th>Emp ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Age</th>
         </tr>
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td> <c:out value = "${row.id}"/></td>
               <td> <c:out value = "${row.first}"/></td>
               <td> <c:out value = "${row.last}"/></td>
               <td> <c:out value = "${row.age}"/></td>
            </tr>
         </c:forEach>
      </table>

</body>
</html>