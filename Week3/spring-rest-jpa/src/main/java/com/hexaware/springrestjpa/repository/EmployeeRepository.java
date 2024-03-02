package com.hexaware.springrestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestjpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findByEname(String ename);
	
	List<Employee> findBySalaryGreaterThan(double salary);
	
	@Query("select e from Employee e where e.salary between ?1  and ?2")
	List<Employee> findEmpBySalaryRange(double min, double max);
	
	@Modifying
	@Query("delete from Employee e where e.ename=?1")
	int deleteByEname(String ename);
	
	@Query(value = "SELECT eid, ename, salary FROM employee_info WHERE ename LIKE 's%' ", nativeQuery = true)
	List<Employee> findByNameLike();

	

}
