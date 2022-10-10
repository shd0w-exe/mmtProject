<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Hotel</title>
<link rel="stylesheet" href="/css/addFlightAndHotel.css" />
</head>
<body>

<h3 style="color:#CC6666;">${message}</h3>
<div class="login-box">
 <form action="updateHotel">

       <h1 style="color:#CC6666;">Update Hotels</h1>
        <input type = "text" name = "hotelId" class ="input"  placeholder="Hotel ID">
        
        <input type = "text" name = "hotelName" class ="input"  placeholder="Hotel Name">
       
        <input type = "text" name = "hotelBrand" class ="input"  placeholder="Hotel Brand">
       
        <input type = "number" name = "priceAcRoom" step="0.01" class ="input"  placeholder="AC Room Price">
        
        <input type = "number" name = "priceNonAcRoom" step="0.01" class ="input"  placeholder="Non AC Room Price">
       
        <input type = "text" name = "hotelCity" class ="input"  placeholder="City">
       
        <input type = "number" name = "noOfAcRooms" class ="input"  placeholder="No of AC Rooms">
       
        <input type = "number" name = "noOfNonAcRooms" class ="input"  placeholder="No of Non AC Rooms">
        
       
        <input type="submit"  />
        <a href = "adminHomePage">Go back to admin Home</a>
      </form>
   </div>


</body>
</html>



