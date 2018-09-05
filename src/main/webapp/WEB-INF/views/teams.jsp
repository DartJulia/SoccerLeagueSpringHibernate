<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
<div class="jumbotron">
<h1>List of Registered Teams</h1>
<table class="table table-hover">
<thead>
<tr class="table-active">
<th>Team Name</th>
<th>View</th>
<th>Edit</th>
<th>Delete</th>

</tr>
</thead>
<c:forEach var = "t" items="${team}">
<tr class="table-primary">
<td>${t.teamName}</td>
<td><a href="${t.teamId}/teammems">View</a></td>
<td><a href="${t.teamId}/edit">Edit</a></td> 
<td><a href="${t.teamId}/delete" onclick="return confirm('Are you sure you want to delete this team?');">Delete</a></td>

</tr>

</c:forEach>

</table>
</div>
<p style="margin: 20px"><a href="/">Return to Home</a><p>
</body>
</html>