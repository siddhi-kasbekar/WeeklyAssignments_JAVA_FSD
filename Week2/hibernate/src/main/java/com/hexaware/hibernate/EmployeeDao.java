package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class EmployeeDao {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    Session session = sessionFactory.openSession();
    
    public List<Employee> getAllEmployees() {

		Query<Employee> query = session.createNamedQuery("getAllEmployees");

		List<Employee> list = query.getResultList();

		return list;
				
		}
	
	
	
		public  Employee  getEmployeeByName() {
			
			
			
			Query<Employee> query = session.createNamedQuery("getEmployeeByName");
			
					query.setParameter("name", "stacy");
			
				Employee emp = (Employee) query.getSingleResult();
			
			return emp;
		}
		
		public List<Employee> getEmployeeBySalary(){
			
			Query<Employee> query = session.createNamedQuery("getEmployeeBySalary");
			
			query.setParameter("salary", 50000.00);
			
			List<Employee> list = query.getResultList();
			
			return list;
		}

}
