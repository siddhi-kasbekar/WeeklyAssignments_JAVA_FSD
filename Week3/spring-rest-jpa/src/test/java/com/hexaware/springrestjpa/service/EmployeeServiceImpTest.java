package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entities.Employee;


@SpringBootTest
class EmployeeServiceImpTest {
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpTest.class);
	
	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("InsertEmployee")
	void testAddEmployee() {
		
//		Employee emp = new Employee(115,"Ashu", 70000);
//		Employee e1 = service.addEmployee(emp);
//		logger.info("employee added successfully");
//		assertEquals(115, e1.getEid());
	}

	@Test
	void testUpdateEmployee() {
	}

	@Test
	void testDeleteEmpById() {
	}

	@Test
	void testGetAllEmp() {
		
//		List<Employee> list = service.getAllEmp();
//		boolean isEmpty = list.isEmpty();
//		assertFalse(isEmpty);
	}

}
