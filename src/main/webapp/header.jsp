<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
    
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Shopping Cart</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
     
      <%
      	String customerId=(String)session.getAttribute("customerId");
    	String adminId=(String)session.getAttribute("adminId");

    	if(customerId==null && adminId==null){
      %>
       <li class="nav-item ">
        <a class="nav-link" href="adminLogin.jsp">Admin Panel</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="customerLogin.jsp">Customer Panel</a>
      </li>
      <%}
    	else if(customerId!=null && adminId==null){
    	%>
    	<li class="nav-item ">
        <a class="nav-link" href="productList.jsp">Product List</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="viewCart">Cart</a>
      </li>
    	<%} else if(customerId==null && adminId!=null){%>
     
     <%} %>
    </ul>
    
  </div>
</nav>
   