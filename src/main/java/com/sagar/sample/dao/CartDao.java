package com.sagar.sample.dao;

import java.util.List;

import com.sagar.sample.pojo.Cart;

public interface CartDao {
	
	boolean addToCart(Cart cart);//Customer
	
	boolean deleteCartById(int cartId);//Customer
	
	boolean editCart(Cart cart);//Customer
	
	Cart searchCartByCartId(int cartId);//admin
	
	List<Cart> viewCart(int customerId);//Customer
	
}
