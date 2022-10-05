<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<style>
      table {
        border-collapse: separate;
        border-spacing: 0 15px;
      }
      th {
        background-color: #4287f5;
        color: white;
      }
      th,
      td {
        width: 150px;
        text-align: center;
        border: 1px solid black;
        padding: 5px;
      }
      h2 {
        color: #4287f5;
      }
    </style>
</head>
<h2>profile</h2>
<body>
<form>
<c:forEach items="${user}" var="pu">
<table style="width:30%">
  <tr>
    
    <th>UserId</th>
    <td>${pu.userId}</td>
    </tr>
    <tr>
    <th>FirstName</th>
    <td>${pu.firstName}</td>
    </tr>
    <tr>
    <th>MiddleName</th>
    <td>${pu.middleName}</td>
    </tr>
    <tr>
    <th>LastName</th>
    <td>${pu.lastName}</td>
    </tr>
    <tr>
    <th>MobileNumber</th>
    <td>${pu.mobileNumber}</td>
    </tr>
    <tr>
    <th>Email</th>
    <td>${pu.mailId}</td>
    </tr>
    <tr>
    <th>Password</th>
    <td>${pu.password}</td>
  </tr>
  </table>
</c:forEach>
</form>
<form action="updateUserDetailsPage">
<input type="submit" value="Update Profile">
</form>
</body>
</html>