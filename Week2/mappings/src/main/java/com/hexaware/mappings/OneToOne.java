package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Address;
import com.hexaware.mappings.entity.Student;

/**
 * Hello world!
 *
 */
public class OneToOne 
{
    public static void main( String[] args )
    {

    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	System.out.println(session);
    	
    	Student student = new Student(103, "harry");
    	//Address address = new Address(2,"Mumbai",student); // we can also use setters 
    	
    	Address address = new Address();
    	address.setAddressId(3);
    	address.setCity("kop");
    	address.setStudent(student);

    	
    	

    	
    	
    	
    	
    	
    	Transaction transaction = session.beginTransaction();
    	session.persist(address);
    	
    	transaction.commit();
    
    }
}
