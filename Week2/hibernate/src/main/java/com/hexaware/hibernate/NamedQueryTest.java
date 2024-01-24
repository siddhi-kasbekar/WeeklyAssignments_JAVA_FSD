package com.hexaware.hibernate;

import java.util.List;

import com.hexaware.hibernate.entity.Employee;

public class NamedQueryTest {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();
		List<Employee> list =	dao.getAllEmployees();
			
			System.out.println("Employees from Named Query");
			
			System.out.println(list);	
			
			
					Employee emp =	dao.getEmployeeByName();
					
					System.out.println(emp);
					
					List<Employee> list2 = dao.getEmployeeBySalary();
					System.out.println("employees having salary = 50000");
					System.out.println(list2);
	}

}
