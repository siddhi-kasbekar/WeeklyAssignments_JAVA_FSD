package com.hexaware.mappings;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Order;
import com.hexaware.mappings.entity.Product;

public class ManyToMany {

	public static void main(String[] args) {

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Product p1 = new Product();
		p1.setProdId(1);
		p1.setProdName("fridge");
		
		Product p2 = new Product();
		p1.setProdId(2);
		p1.setProdName("TV");
		
		Product p3 = new Product();
		p1.setProdId(3);
		p1.setProdName("washing Machine");
		
		Order o1 = new Order();
		o1.setOrderid(101);
		o1.setPurchaseDate(LocalDate.now());
		o1.addProduct(p1);
		o1.addProduct(p2);
		o1.addProduct(p3);
		
		Order o2 = new Order();
		o2.setOrderid(102);
		o2.setPurchaseDate(LocalDate.now());
		o2.addProduct(p2);
		o2.addProduct(p3);
		
		session.persist(o1);
		session.persist(o2);
		
		transaction.commit();

	}

}
