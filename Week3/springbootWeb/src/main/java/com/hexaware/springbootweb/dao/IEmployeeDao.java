package com.hexaware.springbootweb.dao;

import java.util.List;

import com.hexaware.springbootweb.entity.Employee;

public interface IEmployeeDao {
	
	public String addEmplpoyee(Employee emp);
	
	public String updateEmplpoyee(Employee emp);
	
	public String deleteEmployee(int eid);
	
	public Employee getEmpById(int eid);
	
	public List<Employee> getAll();

}
