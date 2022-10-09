<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Flight</title>
<link rel="stylesheet" href="/css/addFlightAndHotel.css" />
</head>
<body>
<h3 style="color:#CC6666;">${message}</h3>
 <div class="login-box">
 <form action="addFlight">
 		<h1 style="color:#CC6666;">Add new Flights</h1>
       
        <input type = "text" name = "airlineName" class ="input" placeholder="Airline Name">
       
        <input type = "text" name = "flightNumber" class ="input" placeholder="Flight Number">
       
        <input type = "text" name = "flightSource" class ="input" placeholder="Source">
       
        <input type = "text" name = "flightDestination" class ="input" placeholder="Destination">
       
        <input type = "text" name = "flightDeparture" class ="input" placeholder="Departure Time">
       
        <input type = "text" name = "flightArrival" class ="input" placeholder="Arrival Time">
        
        <input type = "number" name = "pricePerSeat" class ="input" placeholder="Price">
       
        <input type = "number" name = "noOfSeats" class ="input" placeholder="Total Seats">
       
        <input type="submit" value="Submit" />
        <a href = "adminHomePage">Go back to admin Home</a>
      </form>
   </div>


</body>
</html>
