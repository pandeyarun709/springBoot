package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empId;
	private String userName;
	private int contactNo;
	private String Designation;
	private int Location;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getLocation() {
		return Location;
	}
	public void setLocation(int location) {
		Location = location;
	}
	
	public void test() {
		System.out.println("Employee is here !!!");
	}

}
