package com.sagar.sample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FirstControllerStart {

	@RequestMapping("/")
	public ModelAndView cutomerLogin() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}
	
	@RequestMapping("/adminLogin")
	public ModelAndView myData(HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		
		String c=request.getParameter("c");
		String p=request.getParameter("p");
		
		if(p.equalsIgnoreCase("admin")) {
			request.getSession().setAttribute("customerUsername", c);
			modelAndView.addObject("loginSucess", "Customer Logged In SucessFully");

			modelAndView.setViewName("home.jsp");
		}else {
			modelAndView.addObject("loginFailure", "Customer Logged In Failed");

			modelAndView.setViewName("NewFile.jsp");
		}
		
		
		return modelAndView;
	}
	
}