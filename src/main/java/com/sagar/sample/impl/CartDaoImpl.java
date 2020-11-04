package com.sagar.sample.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import org.hibernate.query.Query;

import com.sagar.sample.dao.CartDao;
import com.sagar.sample.pojo.Cart;

import static com.sagar.sample.utility.DatabaseConnection.getSessionFactory;;

public class CartDaoImpl implements CartDao {

	SessionFactory sessionFactory = getSessionFactory();
	Session session = null;
	Transaction t = null;

	@Override
	public boolean addToCart(Cart cart) {
		session = sessionFactory.openSession();

		t = session.beginTransaction();

		session.save(cart);

		t.commit();
		session.close();
		return true;
	}

	public Cart checkIfProdutAlreadyAddedByCustomer(Cart cart) {
		session = sessionFactory.openSession();
		// Using label...............

		Query<Cart> qry = session.createQuery("from Cart c where c.product_id= :pid and c.customer_id=:cid");
		qry.setParameter("pid", cart.getProduct_id());
		qry.setParameter("cid", cart.getCustomer_id());

		List<Cart> l = qry.list();
		Iterator<Cart> it = l.iterator();

		if (it.hasNext()) {
			return it.next();
		}
		return null;
	}

	@Override
	public boolean deleteCartById(int cartId) {
		session = sessionFactory.openSession();

		t = session.beginTransaction();
		Cart cartToDelete = new Cart();
		cartToDelete.setC_id(cartId);
		session.delete(cartToDelete);
		t.commit();
		session.close();
		return true;
	}

	@Override
	public boolean editCart(Cart cart) {
		cart.setProduct_total_price(cart.getProduct_price() * cart.getProduct_quantity());
		session = sessionFactory.openSession();

		t = session.beginTransaction();
		session.update(cart);
		t.commit();
		session.close();
		return true;
	}

	@Override
	public Cart searchCartByCartId(int cartId) {
		Cart CartItems = new Cart();
		session = sessionFactory.openSession();
		// Using label...............

		Query<Cart> qry = session.createQuery("from Cart c where c.c_id=:cid");

		qry.setParameter("cid", cartId);

		Iterator<Cart> it = qry.list().iterator();

		if (it.hasNext()) {
			return it.next();
		}
		return CartItems;
	}

	@Override
	public List<Cart> viewCart(int customerId) {
		List<Cart> listOfCartItems = new ArrayList<>();
		session = sessionFactory.openSession();
		// Using label...............

		Query<Cart> qry = session.createQuery("from Cart c where c.customer_id=:cid");

		qry.setParameter("cid", customerId);

		listOfCartItems = qry.list();

		return listOfCartItems;
	}

}
