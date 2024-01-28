package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entity.Department;
import com.hexaware.mappings.entity.Employee;

public class OneToMany_manyToOne {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee(201,"tom",70000);
		Employee e2 = new Employee(202,"rani",77000);
		Employee e3 = new Employee(203,"tony",80000);
		Employee e4 = new Employee(204,"isha",50000);
		
		Department d1 = new Department();
		d1.setDeptId(2);
		d1.setDeptName("testing");
		
		d1.addEmp(e1);
		d1.addEmp(e2);
		d1.addEmp(e3);
		d1.addEmp(e4);
		
		session.persist(d1);
		
		transaction.commit();

		
	}

}
