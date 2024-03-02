package com.hexaware.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootweb.dao.IEmployeeDao;
import com.hexaware.springbootweb.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeDao dao;
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request,HttpServletResponse response ) {
		
		int eid = Integer.parseInt(request.getParameter("employeeId"));
		String ename = request.getParameter("employeeName");
		double  salary = Double.parseDouble(request.getParameter("employeeSalary"));


		Employee emp = new Employee(eid,ename,salary);
		return dao.addEmplpoyee(emp);
		
		
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	@ResponseBody
	public String updateEmployee(HttpServletRequest request ) {
		
		int eid = Integer.parseInt(request.getParameter("empId"));
		String ename = request.getParameter("empName");
		double  salary = Double.parseDouble(request.getParameter("empSalary"));


		Employee emp = new Employee(eid,ename,salary);
		return dao.updateEmplpoyee(emp);
		
		
		
	}
	
	@RequestMapping(value="/delete")
	@ResponseBody
	public String delete(HttpServletRequest request) {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		
		return dao.deleteEmployee(eid);
		
	}
	
	@RequestMapping(value="/getbyid")
	@ResponseBody
	public Employee getById(HttpServletRequest request) {
		
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		
		return dao.getEmpById(eid);
		
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	//@ResponseBody
	public String getEmp(HttpSession session){
		
		
        List<Employee> list = dao.getAll();
        
        session.setAttribute("empList", list);
		return "displayAll";
		
	}
	
	@RequestMapping(value="/getjsp", method=RequestMethod.GET)
	
	public String get() {
		return "success";
	}
	
	

}
