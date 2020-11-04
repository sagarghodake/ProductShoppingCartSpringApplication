package com.sagar.sample.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.*;  

@Entity  
@Table(name="order12")  
public class Order {
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO) 
	private Integer  o_id;
	private Integer  customer_id;
	private Double after_dicount_price,basic_price,net_price;
	private String customer_name,customer_delivery_address,customer_phone,customer_email,customer_address;
	
	private Integer  order_delivered,order_dispatched,order_packed;
	
	public Integer getO_id() {
		return o_id;
	}


	public void setO_id(Integer o_id) {
		this.o_id = o_id;
	}


	public Integer getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}


	public Double getAfter_dicount_price() {
		return after_dicount_price;
	}


	public void setAfter_dicount_price(Double after_dicount_price) {
		this.after_dicount_price = after_dicount_price;
	}


	public Double getBasic_price() {
		return basic_price;
	}


	public void setBasic_price(Double basic_price) {
		this.basic_price = basic_price;
	}


	public Double getNet_price() {
		return net_price;
	}


	public void setNet_price(Double net_price) {
		this.net_price = net_price;
	}


	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getCustomer_delivery_address() {
		return customer_delivery_address;
	}


	public void setCustomer_delivery_address(String customer_delivery_address) {
		this.customer_delivery_address = customer_delivery_address;
	}


	public String getCustomer_phone() {
		return customer_phone;
	}


	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}


	public String getCustomer_email() {
		return customer_email;
	}


	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}


	public String getCustomer_address() {
		return customer_address;
	}


	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}


	public Integer getOrder_delivered() {
		return order_delivered;
	}


	public void setOrder_delivered(Integer order_delivered) {
		this.order_delivered = order_delivered;
	}


	public Integer getOrder_dispatched() {
		return order_dispatched;
	}


	public void setOrder_dispatched(Integer order_dispatched) {
		this.order_dispatched = order_dispatched;
	}


	public Integer getOrder_packed() {
		return order_packed;
	}


	public void setOrder_packed(Integer order_packed) {
		this.order_packed = order_packed;
	}


	public Date getOrder_delivered_date() {
		return order_delivered_date;
	}


	public void setOrder_delivered_date(Date order_delivered_date) {
		this.order_delivered_date = order_delivered_date;
	}


	public Date getOrder_dispatched_date() {
		return order_dispatched_date;
	}


	public void setOrder_dispatched_date(Date order_dispatched_date) {
		this.order_dispatched_date = order_dispatched_date;
	}


	public Date getOrder_packed_date() {
		return order_packed_date;
	}


	public void setOrder_packed_date(Date order_packed_date) {
		this.order_packed_date = order_packed_date;
	}


	public List<Cart> getProductListInCart() {
		return productListInCart;
	}


	public void setProductListInCart(List<Cart> productListInCart) {
		this.productListInCart = productListInCart;
	}


	public String getOrder_status() {
		return order_status;
	}


	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}


	public String getOrder_code() {
		return order_code;
	}


	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}


	private Date order_delivered_date,order_dispatched_date,order_packed_date;
	
	@OneToMany
	private List<Cart> productListInCart;
	

	private String order_status,order_code;


	
	
}
