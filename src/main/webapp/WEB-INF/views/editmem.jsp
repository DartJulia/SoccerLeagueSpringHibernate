<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<label for="memberId">Member ID: </label>
<input type="hidden"> ${id.memberId}
<br>
<label for="memberName">Edit Member Name:</label>
<input id="memberName" name="memberName" type="text" value="${id.memberName}"> 
<br>
<br>
<label for="memberRole">Edit Member Role:</label>
<input id="memberRole" name="memberRole" type="text" value="${id.memberRole}"> 
<br>
<br>

<label for="teamName">Team Name: </label>
<input type="hidden"> ${id.teams.teamName}
<br>
<br>
<!--  <label for="teamId">Edit Team ID: </label>
<select name="teamId" class="custom-select" style="width:15%"> 

	<option value="">Current: ${id.teams.teamId}</option>
	 <option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option> 

</select> -->
<br>
<br>

<button type="submit" class="btn btn-secondary">Submit</button>  <a href="/teams">Cancel</a>
</form>



</div>

</body>
</html>