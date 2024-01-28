package com.hexaware.mappings.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")//to make bidirectional use mappedBy for many to  one
	//@JoinColumn(name= "dno")
	private Set<Employee> set = new HashSet<Employee>(); // collections should be initialized to avoid nullPoitner Escep

	public Department() {
		super();
	}

	public Department(int deptId, String deptName, Set<Employee> set) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.set = set;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Employee> getSet() {
		return set;
	}

	public void setSet(Set<Employee> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", set=" + set + "]";
	}
	
	public void addEmp(Employee emp) {
		
		emp.setDepartment(this);//binding emp to current dept - for may to one 
		
		Set<Employee> set = getSet();
		
		set.add(emp);
		
		
	}
	
	
	

}
