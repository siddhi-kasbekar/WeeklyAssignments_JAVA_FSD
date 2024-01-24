package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

public class HibernateSelect {

	public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        
        //HQL or JPQL
        String selectQuery = "select  e  from Employee e where e.salary > ?1 "; // positional parameters

        Query<Employee>  query = session.createQuery(selectQuery);
        
        query.setParameter(1, 80000.00);
        
        List<Employee> list = query.getResultList();
        for (Employee employee : list) {
        	System.out.println(employee);
			
		}
        
        System.out.println("name containing i ");
        //String select2 = "select e from Employee e where e.ename like '%i%' ";
        
        String select3 = "select e from Employee e where e.eid = :empid";//with named paramater
        Query<Employee>  query2 = session.createQuery(select3);

        query2.setParameter("empid", 101);

        
        
        System.out.println(query2.getResultList());
        
        String select4 = "select * from Employee ";
        NativeQuery<Employee> query4 =   session.createNativeQuery(select4,Employee.class);
       // List list1 = query4.getResultList();
        List<Employee> list1 = query4.list();
        System.out.println("native query");
        System.out.println(list1);
        
        NativeQuery<Employee> query5 = session.createSQLQuery(select4);
        System.out.println(query5);

        query5.addEntity(Employee.class);
        List<Employee> list5 = query5.list();
        System.out.println("createSQLQuery");
        System.out.println(list5);
	}

}
