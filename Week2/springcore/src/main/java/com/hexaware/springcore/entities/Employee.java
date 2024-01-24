package com.hexaware.springcore.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
	
	private int eid;
	@Autowired
	private String ename;
	
	@Autowired
	private Address addr;
	
	public Employee() {
		
	}

	public Employee(int eid, String ename, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.addr = addr;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", addr=" + addr + "]";
	}
	

}
