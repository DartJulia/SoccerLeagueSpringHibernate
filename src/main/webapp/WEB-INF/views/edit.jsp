<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<div class="jumbotron">
<form method="post">
<label for="teamId">Team ID: </label>
<input type="hidden"> ${id.teamId}
<br>
<label for="teamName">Edit Team Name:</label>
<input id="teamName" name="teamName" type="text" placeholder="${id.teamName}"> 
<br>
<button type="submit" class="btn btn-secondary">Submit</button>  <a href="/teams">Cancel</a>



</form>
</div>
</body>
</html>