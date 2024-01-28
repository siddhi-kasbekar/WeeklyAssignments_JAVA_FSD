package com.hexaware.hibernatemappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernatemappings.entity.Address;
import com.hexaware.hibernatemappings.entity.Customer;


/**
 * Hello world!
 *
 */
public class OneToOne {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		
		
		
		
		Customer c1 = new Customer();
		c1.setCustId(101);
		c1.setCustName("stacy");
		c1.setPhone("8728478236");
		
		Address addr = new Address();
		addr.setAid(1);
		addr.setCity("Mumbai");
		addr.setPin(419223);
		addr.setCustomers(c1);
		
		

		
		
		Transaction transaction = session.beginTransaction();
    	session.persist(addr);
    	
    	transaction.commit();
	}
}
