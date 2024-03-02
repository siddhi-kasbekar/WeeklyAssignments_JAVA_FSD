package com.hexaware.springbootweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springbootweb.entity.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
JdbcTemplate jdbcTemplate ;
	
public EmployeeDaoImpl() {
	super();
}
	@Autowired
	public EmployeeDaoImpl(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
		
		
		
	}

	@Override
	public String addEmplpoyee(Employee emp) {
		String insert = "insert into employee_table values(?,?,?)";
		int count = jdbcTemplate.update(insert, emp.getEid(),emp.getEname(),emp.getSalary());
		return count+"records inserted";

	
	
	}
	@Override
	public List<Employee> getAll() {

		String select = "select * from employee_table";
		
		List<Employee> list = jdbcTemplate.query(select, new EmployeeMapper());
		
		return list;
	}
	
	@Override
	public String updateEmplpoyee(Employee emp) {
		String update = "update employee_table set ename=?, salary=? where eid=?";
		int count = jdbcTemplate.update(update, emp.getEname(),emp.getSalary(),emp.getEid());
		return count+"records updated";
	}
	@Override
	public String deleteEmployee(int eid) {


		String delete = "delete from employee_table where eid=?";
		int count = jdbcTemplate.update(delete,eid);
		return count+" records deleted";
	}
	@Override
	public Employee getEmpById(int eid) {
		
		String search = "select * from employee_table where eid=?";
		Employee emp  = jdbcTemplate.queryForObject(search, new EmployeeMapper(), eid);
		return emp;
	}
	
	

	

}
