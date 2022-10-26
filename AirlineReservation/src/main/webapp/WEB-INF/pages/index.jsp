<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AirRide.com</title>
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
.activereg{
position: absolute;
left: 75%;
}

.admin{
position: absolute;
left: 93%;
}

body {
  background-image:url("images/aeroplane1.jpg");
  background-size: cover;
}
</style>
</head>
<body>

<div class="topnav">
 
  <a>Welcome to AirRide.com</a>
 <a class="admin" href="admin"> Admin</a>
  <a  class="activereg" href="login">Login/Create new account</a>
 
</div>

<center>
<h1>Welcome to AirRide.com</h1>
<fieldset style="color: black;width: 500px" >
 <div class="container">


        <form class="form-group">
            <h1 class="text-center">AirRide Booking Form</h1>

            <div id="form">
                <h3 class="text-white">Booking Details</h3>
            
            <select  style="width: 150px;margin:20px" >
                    <option value="">From</option>
                    <option value="">Banglore </option>
                    <option value="">Manglore</option>
                    <option value="">Mysore</option>
                    <option value="">NewDelhi</option>
                    <option value="">Mumbai</option>
                    <option value="">Chenni</option>
                    <option value="">Goa</option>
                            
                </select>
                
                <select  style="width: 150px;margin:20px">
                    <option value="">To</option>
                    <option value="">Banglore </option>
                    <option value="">Manglore</option>
                    <option value="">Mysore</option>
                    <option value="">NewDelhi</option>
                    <option value="">Mumbai</option>
                    <option value="">Chenni</option>
                    <option value="">Goa</option>
                </select>
            
           
                <input type="date" placeholder="Departure Date" style="width: 120px;margin:20px">
           
                <select style="width: 150px;margin:20px":">
                    <option value="">Preffered Airline</option>
                    <option value="">IndoGo</option>
                    <option value="">AirIndia</option>
                    <option value="">SpaceJet</option>
                </select>
                <select style="width: 150px;margin:20px">
                    <option value="">Preffered Seating</option>
                    <option value="">Economy Class</option>
                    <option value="">Business Class</option>
                    <option value="">First Class</option>
                </select>
                </div>

                <div style="width: 150px;margin:20px">
                    <input type="number" id="input-group" placeholder="Adult"><br></br>
                    <input type="number" id="input-group" placeholder="Children(0-11years)"><br></br>
                    
                </div>

                </form>

				<div>
                 <form  action="fetchflightdetails" >
                <button type="submit" >Submit Form</button><br></br>
                <button type="reset" class="btn btn-primary">Clear Form</button>
            </div>
            </form>



</fieldset>

</center>


</body>
</html>