<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Retrieve Patient Details</title>
</head>
<body>
<h1>Retrieve Patient Details</h1>
<h2>Details as submitted as follows:</h2>
<form action="getdetails" method="post">
<input type="number" name="pid">
<input type="submit" value="Submit">
<h5>${patients}</h5>

</body>
</html>