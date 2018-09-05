<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<div class="jumbotron">
<h1>List of Registered Members</h1>
<table class="table table-hover">
<thead>
<tr class="table-active">
<th>Member Name</th>
<th>Role</th>
<th>Team Name</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<c:forEach var = "m" items="${members}">
<tr class="table-primary">
<td>${m.memberName}</td>
<td>${m.memberRole}</td>
<td>${m.teams.teamName}</td>
<td><a href="${m.memberId}/editm">Edit</a></td> 
<td><a href="${m.memberId}/deletem" onclick="return confirm('Are you sure you want to delete this member?');">Delete</a></td>
</tr>
<!-- /${m.teams.teamId} -->
</c:forEach>


</table>


</div>
<p style="margin: 20px"><a href="/">Return to Home</a><p>
</body>
</html>