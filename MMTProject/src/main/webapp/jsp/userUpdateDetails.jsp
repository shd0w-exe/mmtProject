<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="/css/login.css" />
</head>
<body>
<div class="signup-box">
<form action="updateUserDetails">
<h3>Update Profile</h3>
<label>First Name</label>
<input type="text" name="firstName" placeholder=""/>
<label>Middle Name</label>
<input type="text" name="middleName" placeholder=""/>
<label>Last Name</label>
<input type="text" name="lastName" placeholder=""/>
<label>Mobile Number</label>
<input type="text" name="mobileNumber" placeholder=""/>
<label>MailId</label>
<input type="text" name="mailId" placeholder=""/>
<label>Password</label>
<input type="text" name="password" placeholder=""/>
<div>                     </div>
<input type="submit" value="Update Profile">
</form>
</div>
</body>
</html>