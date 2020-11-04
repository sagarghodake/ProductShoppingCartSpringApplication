package com.sagar.sample.impl;

import static com.sagar.sample.utility.DatabaseConnection.getSessionFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sagar.sample.dao.OrderDao;
import com.sagar.sample.pojo.Order;

public class OrderDaoImpl implements OrderDao{

	SessionFactory sessionFactory=getSessionFactory();
	Session session=null;  
    Transaction t=null;   
    
	@Override
	public List<Order> viewAllOrders() {
		List<Order> listOfOrder=new ArrayList<>();
		session = sessionFactory.openSession();		
		// Using label...............

		        Query qry = session.createQuery("from Order o");
	
		        listOfOrder=qry.list();
				Iterator<Order> it = listOfOrder.iterator();

				while(it.hasNext())
				{
					listOfOrder.add(it.next());
				}
		return listOfOrder;
	}

	@Override
	public boolean placeOrder(Order order) {
		session=sessionFactory.openSession();  
	      
	    t=session.beginTransaction();   
	    session.save(order);
	    t.commit();
	    session.close();
		return true;
	}

	@Override
	public Order viewOrder(int order_id) {
		Order order=new Order();
		session = sessionFactory.openSession();		
		// Using label...............

		        Query qry = session.createQuery("from Order o where o.o_id=:id");
	
		        qry.setParameter("id",order_id);
				Iterator<Order> it = qry.list().iterator();

				if(it.hasNext())
				{
					return it.next();
				}
		return order;
	}

	@Override
	public boolean updateStatusOfOrder(Order order) {
		session=sessionFactory.openSession();  
	      
	    t=session.beginTransaction();   
	    session.update(order);
	    t.commit();
	    session.close();
		return true;
	}

}
