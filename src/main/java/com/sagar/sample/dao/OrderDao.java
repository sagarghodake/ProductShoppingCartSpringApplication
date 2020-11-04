package com.sagar.sample.dao;

import java.util.List;

import com.sagar.sample.pojo.Order;

public interface OrderDao {
	
	List<Order> viewAllOrders();//Admin
	
	boolean placeOrder(Order order);//Customer
		
	Order viewOrder(int order_id);//Customer
	
	boolean updateStatusOfOrder(Order order);
	
}
