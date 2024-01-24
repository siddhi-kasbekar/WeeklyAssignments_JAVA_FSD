package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        Session session = sessionFactory.openSession();
        System.out.println(session);
        
        Transaction tsn = session.beginTransaction();
        
        //update
//        Employee  emp2 = session.get(Employee.class, 101);
//        System.out.println(emp2);
//        
//        emp2.setEname("stacy");
//        emp2.setSalary(90000);
//        Serializable seri =   session.save(emp2);
//        System.out.println(seri.toString());
//        System.out.println(emp2);
        
        //insert
        Employee emp = new Employee(103,"Mr. smith",60000);    
//        Employee emp1 = new Employee(105,"harry",60000);   
//        session.save(emp1);
//        session.save(emp);

        
        
//      Serializable seri =   session.save(emp);
//      System.out.println(seri.toString());
        
       //session.delete(emp2);
        
        session.saveOrUpdate(emp);
      
      tsn.commit();
      session.close();//cache level-1 is cleared
        
    }
}
