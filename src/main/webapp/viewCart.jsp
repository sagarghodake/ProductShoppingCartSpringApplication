<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*" import="com.sagar.sample.pojo.*"%>
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
						List<Cart> listOfCartItems=(List<Cart>)request.getAttribute("listOfCartItems");
							String deleteToCartFailed = (String) request.getAttribute("deleteToCartFailed");
							String deleteToCartSucess = (String) request.getAttribute("deleteToCartSucess");
							String updateCartSucess = (String) request.getAttribute("updateCartSucess");
							String updateCartFailed = (String) request.getAttribute("updateCartFailed");

							if (deleteToCartFailed != null) {
						%>
						<p style="color: red"><%=deleteToCartFailed%></p>
						<%
							}
							if (deleteToCartSucess != null) {
						%>
						<p style="color: green"><%=deleteToCartSucess%></p>
						<%
							}
							if (updateCartSucess != null) {
						%>
						<p style="color: green"><%=updateCartSucess%></p>
						<%
							}
							if (updateCartFailed != null) {
						%>
						<p style="color: green"><%=updateCartFailed%></p>
						<%
							}
						%>
						<table id="dtOrderExample"
							class="table table-striped table-bordered table-sm"
							cellspacing="0" width="100%">
							<thead>
								<tr>
									<th class="th-sm">Cart_Id</th>
									<th class="th-sm">Product_Id</th>
									<th class="th-sm">Product_Name</th>
									<th class="th-sm">Product_image</th>
									<th class="th-sm">Product_price</th>
									<th class="th-sm">Product_Quantity</th>
									<th class="th-sm">Product_Total_Price</th>

									<th class="th-sm">edit</th>
									<th class="th-sm">delete</th>
								</tr>
							</thead>
							<tbody>
							
							<% if(listOfCartItems.size()==0){ %>
								<p>NO ITEMS IN CART YET!</p>
							<%}else{ 
							double totalBill=0;
							%>
								<% for(Cart c:listOfCartItems){ 
									totalBill=totalBill+c.getProduct_total_price();
								%>
								<tr>
									<td><%=c.getC_id() %></td>
									<td><%=c.getProduct_id() %></td>

									<td><%=c.getProduct_name() %></td>

									<td><%=c.getProduct_image() %></td>

									<td><%=c.getProduct_price() %></td>
									<td><%=c.getProduct_quantity() %></td>
									<td><%=c.getProduct_total_price() %></td>
									<td><a href="#">edit</a></td>
									<td><a href="#">delete</a></td>
									</tr>
									
								<%} %>
								<tr>
								<td colspan="8"></td>
								<td><%=totalBill %></td>
								</tr>
								<%} %>
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