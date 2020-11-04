<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<div class="container">
		<div class="row">
			<div class="col-sm"></div>
			<div class="col-sm">

				<div class="card">
					<div class="card-body">
					
					 <%
      	String addToCartFailed=(String)request.getAttribute("addToCartFailed");
    	String addToCartSucess=(String)request.getAttribute("addToCartSucess");
    	String updateCartSucess=(String)request.getAttribute("updateCartSucess");
    	String updateCartFailed=(String)request.getAttribute("updateCartFailed");

    	if(addToCartFailed!=null){
      %>
      		<p style="color: red"><%=addToCartFailed %></p>
      <%}
    	if(addToCartSucess!=null){
       %>
    		<p style="color: green"><%=addToCartSucess %></p>
    <%} 
    	if(updateCartSucess!=null){
       %>
    		<p style="color: green"><%=updateCartSucess %></p>
    <%} 
    	if(updateCartFailed!=null){
       %>
    		<p style="color: green"><%=updateCartFailed %></p>
    <%} %>
						<table id="dtOrderExample"
							class="table table-striped table-bordered table-sm"
							cellspacing="0" width="100%">
							<thead>
								<tr>
									<th class="th-sm">Product_Id</th>
									<th class="th-sm">Product_Name</th>
									<th class="th-sm">Product_image</th>
									<th class="th-sm">Product_price</th>
									<th class="th-sm">Action   </th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>12</td>
									<td>product A</td>
									<td><img src="" alt="A" /></td>
									<td>100.45</td>
									<td><a href="addToCart?
									&pid=12&pname=product A&pimage=img/a.jpg
									&pprice=100.45">add to cart</a></td>
								</tr>
									<tr>
									<td>13</td>
									<td>product B</td>
									<td><img src="" alt="B" /></td>
									<td>175.50</td>
										<td><a href="addToCart?
									&pid=13&pname=product B&pimage=img/b.jpg
									&pprice=175.50">add to cart</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>

			</div>
			<div class="col-sm"></div>
		</div>
	</div>
	<jsp:include page="footer.jsp" />

</body>
</html>