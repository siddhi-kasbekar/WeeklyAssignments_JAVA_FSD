package com.hexaware.springrestjpa.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImp.class);


	@Override
	public Employee addEmployee(Employee employee) {
		logger.info(employee +"added from add service");
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {


		return repo.save(employee);

	}

	@Override
	public Employee getEmpById(long eid) {
//		Optional<Employee> optional =  repo.findById(eid);
//		Employee emp = null;
//		if(optional.isPresent()) {
//			emp = optional.get();
//		} or
		
		return repo.findById(eid).orElse(null);
		
	}

	@Override
	public String deleteEmpById(long eid) {
		
		 repo.deleteById(eid);
		 return "record deleted";
	}

	@Override
	public List<Employee> getAllEmp() {
		return repo.findAll();
	}

	@Override
	public List<Employee> getByEname(String ename) {
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> findBySalarySorted() {
		//return repo.findAll(Sort.by(Order.asc("salary")));
		
		return repo.findAll(Sort.by("salary"));
	}

	@Override
	public List<Employee> findBySalaryRange(double min, double max) {
		return repo.findEmpBySalaryRange(min, max);
	}

	@Override
	
	public int deleteByEname(String ename) {
		return repo.deleteByEname(ename);
	}

	@Override
	public List<Employee> findByNameLike() {
		return repo.findByNameLike();
	}
	
	
//	public static boolean validateEmployeeData(Employee emp) {
//		String ename = emp.getEname();
//		
//		boolean flag = false;
//		
//		if(emp.getEid()>99 && emp.getSalary()>1000 && emp.getEname())
//	}

}
