<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<% String loginFailure=(String)request.getAttribute("loginFailure");
	
	if(loginFailure!=null){
	%>
	<p style="color: red"><%=loginFailure %></p>
	<%} %>
	<form action="login" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Customer Id</label> <input
				type="text" class="form-control" aria-describedby="emailHelp"
				name="c">

		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Customer Id</label> <input
				type="password" class="form-control" aria-describedby="emailHelp"
				name="p">

		</div>


		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
	</center>
</body>
</html>