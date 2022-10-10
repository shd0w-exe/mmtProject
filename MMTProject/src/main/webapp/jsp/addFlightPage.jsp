<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
 <form:form action="addFlight" modelAttribute="flight">
 		<h1 style="color:#CC6666;">Add new Flights</h1>
       
        <form:input type = "text" path = "airlineName" class ="input" placeholder="Airline Name"/>
       
        <form:input type = "text" path = "flightNumber" class ="input" placeholder="Flight Number"/>
       
        <form:input type = "text" path = "flightSource" class ="input" placeholder="Source"/>
       
        <form:input type = "text" path = "flightDestination" class ="input" placeholder="Destination"/>
       
        <form:input type = "text" path = "flightDeparture" class ="input" placeholder="Departure Time"/>
       
        <form:input type = "text" path = "flightArrival" class ="input" placeholder="Arrival Time"/>
        
        <form:input type = "number" path = "pricePerSeat" class ="input" placeholder="Price"/>
       
        <form:input type = "number" path = "noOfSeats" class ="input" placeholder="Total Seats"/>
       
        <input type="submit" value="Submit" />
        <a href = "adminHomePage">Go back to admin Home</a>
      </form:form>
   </div>


</body>
</html>
