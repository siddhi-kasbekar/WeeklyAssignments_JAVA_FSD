package com.springannotations.beans;

import org.springframework.stereotype.Component;

//@Service
//@Repository
@Component
public class Employee {
	
	private int eid;
	private String ename;
	
	 public Employee() {
	        // Default constructor
	    }
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	
	public int getEid() {
		return eid;
	}



	public void setEid( int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}


	
	

}
