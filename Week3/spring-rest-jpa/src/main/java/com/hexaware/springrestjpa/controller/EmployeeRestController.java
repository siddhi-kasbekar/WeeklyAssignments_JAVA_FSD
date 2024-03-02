package com.hexaware.springrestjpa.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.Employee;
import com.hexaware.springrestjpa.exception.EmployeeNotFoundException;
import com.hexaware.springrestjpa.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeRestController.class);


	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee insertEmp(@RequestBody Employee employee) {

		logger.warn("from controller");
		return service.addEmployee(employee);

	}

	@PutMapping("/update") //recommended to use pathvariable
	public Employee updateEmp(@RequestBody @Valid Employee employee) {

		return service.updateEmployee(employee);

	}
	
	@GetMapping("/get/{eid}")
	public Employee getEmpById(@PathVariable long eid) throws EmployeeNotFoundException {
		Employee emp =  service.getEmpById(eid);
		
		if(emp==null) {
			throw new EmployeeNotFoundException();
		}
		return emp;
		
	}
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return service.getAllEmp();
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteEmpById(@PathVariable long eid) {
		return service.deleteEmpById(eid);
		
	}
	
	@GetMapping("/getbyname/{ename}")
	public List<Employee> getEmpByEname(@PathVariable String ename) {
		return service.getByEname(ename);
		
	}
	
	@GetMapping("/getbysalary/{salary}")
	public List<Employee> getEmpBySalaryGT(@PathVariable double salary) {
		return service.getBySalaryGT(salary);
		
	}
	
	@GetMapping("/getbysalarysorted")
	public List<Employee> getBySalarySorted(){
		return service.findBySalarySorted();
	}
	
	@GetMapping("/getbysalaryrange/{min}/{max}")
	public List<Employee> getBySalaryByRange(@PathVariable double min, @PathVariable double max){
		return service.findBySalaryRange(min, max);
	}
	
	@DeleteMapping("/deletebyname/{ename}")
	public String deleteEmpByEname(@PathVariable String ename) {
		int count =  service.deleteByEname(ename);
		 return  count+" record deleted";
		
	}
	
	@GetMapping("/getbynamelike")
	public List<Employee> getByNameLike(){
		return service.findByNameLike();
	}

}
