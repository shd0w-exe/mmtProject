<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "bookFlight">
<table style="width:30%">

<tr>
<th> Card Number:  </th>
<td><input type = "number" name = "cardNo"></td>
</tr>
<tr>
<th> Name on Card:  </th>
<td><input type = "text" name = "nameOnCard"></td>
</tr>
<tr>
<th> Expiry Month:  </th>
<td><input type = "number" name = "expMonth"></td>
</tr>
<tr>
<th> Expiry Year:  </th>
<td><input type = "number" name = "expYear"></td>
</tr>
<tr>
<th> CVV:  </th>
<td><input type = "number" name = "cvv"></td>
</tr><tr>
<th> Number of Seats:  </th> <!-- noOfSeats -->
<td>${noOfSeats}</td>
</tr>
<tr>
<th> Price Overall:  </th> <!-- price -->
<td>${price}</td>
</tr>

</table>
<input type="hidden" value="${flightId}" name ="flightId">
<input type="hidden" value="${noOfSeats}" name ="noOfSeats">
<input type="submit" >


</form>

</body>
</html>