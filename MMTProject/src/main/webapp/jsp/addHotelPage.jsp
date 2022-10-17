<%-- 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Hotel</title>
<link rel="stylesheet" href="/css/addFlightAndHotel.css" />
</head>
<body>

<h3 style="color:#CC6666;">${message}</h3>
<div class="login-box">
 <form action="addHotel">

       <h1 style="color:#CC6666;">Add new Hotels</h1>
        <input type = "text" name = "hotelName" class ="input" placeholder="Hotel Name">
       
        <input type = "text" name = "hotelBrand" class ="input" placeholder="Hotel Brand">
       
        <input type = "text" name = "priceAcRoom" class ="input" placeholder="AC Room Price">
        
        <input type = "text" name = "priceNonAcRoom" class ="input" placeholder="Non AC Room Price">
       
        <input type = "text" name = "hotelCity" class ="input" placeholder="City">
       
        <input type = "text" name = "noOfAcRooms" class ="input" placeholder="No of AC Rooms">
       
        <input type = "text" name = "noOfNonAcRooms" class ="input" placeholder="No of Non AC Rooms">
        
       
        <input type="submit" name ="AddHotel" value="AddHotel" />
        <a href = "adminHomePage">Go back to admin Home</a>
      </form>
   </div>

</body>
</html>

  --%>














<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Hotel</title>
<link rel="stylesheet" href="/css/addFlightAndHotel.css" />
<style>
    .error{color:red}
    </style>
</head>
<body>

<h3 style="color:#CC6666;">${message}</h3>
<div class="login-box">
 <form:form action="addHotel" modelAttribute="hotel">

       <h1 style="color:#CC6666;">Add new Hotels</h1>
        <form:input type = "text" path = "hotelName" class ="input" placeholder="Hotel Name" />
        
       <form:errors path="hotelName" cssClass="error"/>
       
        <form:input type = "text" path = "hotelBrand" class ="input" placeholder="Hotel Brand"/>
        
        <form:errors path="hotelBrand" cssClass="error"/>
        
        <form:input type = "text" path = "priceAcRoom" class ="input" placeholder="AC Room Price"/>
        
         <form:errors path="priceAcRoom" cssClass="error"/>
         
        <form:input type = "text" path = "priceNonAcRoom" class ="input" placeholder="Non AC Room Price"/>
        
        <form:errors path="priceNonAcRoom" cssClass="error"/>
        
        <form:input type = "text" path = "hotelCity" class ="input" placeholder="City"/>
        
        <form:errors path="hotelCity" cssClass="error"/>
        
        <form:input type = "text" path = "noOfAcRooms" class ="input" placeholder="No of AC Rooms"/>
        
        <form:errors path="noOfAcRooms" cssClass="error"/>
        
        <form:input type = "text" path = "noOfNonAcRooms" class ="input" placeholder="No of Non AC Rooms"/>
        
         <form:errors path="noOfNonAcRooms" cssClass="error"/>
       
        <input type="submit" name ="AddHotel" value="AddHotel" />
        <a href = "adminHomePage">Go back to admin Home</a>
      </form:form>
   </div>

</body>
</html>



































 