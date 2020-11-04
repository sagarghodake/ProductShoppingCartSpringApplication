package com.sagar.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.sample.impl.CartDaoImpl;
import com.sagar.sample.pojo.Cart;
import com.sagar.sample.pojo.Order;

@Controller
public class CartController {

	CartDaoImpl cartDaoImpl = new CartDaoImpl();

	@RequestMapping("/login")
	public ModelAndView cutomerLogin(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		HttpSession session = request.getSession();
		session.setAttribute("customerId", request.getParameter("customerId"));

		modelAndView.addObject("loginSucess", "Customer Logged In SucessFully");

		modelAndView.setViewName("productList.jsp");

		return modelAndView;
	}

	@RequestMapping("/viewCart")
	public ModelAndView viewCart(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		HttpSession session = request.getSession();

		int customer_id = Integer.parseInt((String) session.getAttribute("customerId"));

		List<Cart> listOfCartItems = cartDaoImpl.viewCart(customer_id);

		modelAndView.addObject("listOfCartItems", listOfCartItems);

		modelAndView.setViewName("viewCart.jsp");
		return modelAndView;
	}

	@RequestMapping("/addToCart")
	public ModelAndView addToCart(HttpServletRequest request) {
		ModelAndView modelAndView = new ModelAndView();

		HttpSession session = request.getSession();

		Cart cart = new Cart();
		int customer_id = Integer.parseInt((String) session.getAttribute("customerId"));

		double dicount_price = 0;

		Order main_order = null;

		double product_discount = 0;

		int product_id = Integer.parseInt(request.getParameter("pid"));

		String product_image = request.getParameter("pprice");

		String product_name = request.getParameter("pname");

		double product_price = Double.parseDouble(request.getParameter("pprice"));
		;

		int product_quantity = 1;

		double product_total_price = product_price * product_quantity;
		cart.setCustomer_id(customer_id);
		cart.setDicount_price(dicount_price);
		cart.setMain_order(main_order);
		cart.setProduct_discount(product_discount);
		cart.setProduct_id(product_id);
		cart.setProduct_image(product_image);
		cart.setProduct_name(product_name);
		cart.setProduct_price(product_price);
		cart.setProduct_quantity(product_quantity);
		cart.setProduct_total_price(product_total_price);

		Cart cartAlreayAdded = cartDaoImpl.checkIfProdutAlreadyAddedByCustomer(cart);
		System.out.println(cartAlreayAdded == null);
		if (cartAlreayAdded == null) {
			if (cartDaoImpl.addToCart(cart)) {
				modelAndView.addObject("addToCartSucess", "Added To Cart Succesfully");

			} else {
				modelAndView.addObject("addToCartFailed", "Added To Cart Failed");

			}
		} else {
			cartAlreayAdded.setProduct_quantity(cartAlreayAdded.getProduct_quantity() + 1);
			if (cartDaoImpl.editCart(cartAlreayAdded)) {
				modelAndView.addObject("updateCartSucess", "Updated To Cart Succesfully");

			} else {
				modelAndView.addObject("updateCartFailed", "Updated To Cart Failed");

			}
		}

		modelAndView.setViewName("productList.jsp");
		return modelAndView;
	}
}
