package com.hexaware.mappings.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	private int sidstudentId;
	private String studentName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "aid")
	private Address address;

	public Student() {
		super();
	}

	public Student(int sidstudentId, String studentName, Address address) {
		super();
		this.sidstudentId = sidstudentId;
		this.studentName = studentName;
		this.address = address;
	}
	

	public Student(int sidstudentId, String studentName) {
		super();
		this.sidstudentId = sidstudentId;
		this.studentName = studentName;
	}

	public int getSidstudentId() {
		return sidstudentId;
	}

	public void setSidstudentId(int sidstudentId) {
		this.sidstudentId = sidstudentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
