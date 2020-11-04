package com.sagar.sample.utility;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DatabaseConnection {
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory()
	{
			if(sessionFactory==null)
			{
				sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			}
				
		return sessionFactory;
		}
	public static void main(String[] args) {
		System.out.println(getSessionFactory());
	}
	
}
