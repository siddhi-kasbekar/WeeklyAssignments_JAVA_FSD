package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.entities.Employee;

public interface IEmployeeService {
	


	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	
	public Employee getEmpById(long eid);
	
	public String  deleteEmpById(long eid);
	
	public List<Employee> getAllEmp();
	
	public List<Employee> getByEname(String ename);
	
	public List<Employee> getBySalaryGT(double salary);


	public List<Employee> findBySalarySorted();
	
	public List<Employee> findBySalaryRange(double min, double max);
	
	public int deleteByEname(String ename);
	
	public List<Employee> findByNameLike();


}
