package com.sagar.sample.pojo;

import javax.persistence.*;

@Entity  
@Table(name="cart12")  
public class Cart {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer  c_id;
	@Override
	public String toString() {
		return "Cart [c_id=" + c_id + ", customer_id=" + customer_id + ", product_id=" + product_id
				+ ", product_quantity=" + product_quantity + ", dicount_price=" + dicount_price + ", product_discount="
				+ product_discount + ", product_total_price=" + product_total_price + ", product_price=" + product_price
				+ ", product_image=" + product_image + ", product_name=" + product_name + ", main_order=" + main_order
				+ "]";
	}

	private Integer  customer_id,product_id,product_quantity;
	private double dicount_price,product_discount,product_total_price,product_price;
	private String product_image,product_name;
	
	@OneToOne
	private Order main_order;

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public Integer getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public Integer getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(Integer product_quantity) {
		this.product_quantity = product_quantity;
	}

	public double getDicount_price() {
		return dicount_price;
	}

	public void setDicount_price(double dicount_price) {
		this.dicount_price = dicount_price;
	}

	public double getProduct_discount() {
		return product_discount;
	}

	public void setProduct_discount(double product_discount) {
		this.product_discount = product_discount;
	}

	public double getProduct_total_price() {
		return product_total_price;
	}

	public void setProduct_total_price(double product_total_price) {
		this.product_total_price = product_total_price;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Order getMain_order() {
		return main_order;
	}

	public void setMain_order(Order main_order) {
		this.main_order = main_order;
	}

	
}
