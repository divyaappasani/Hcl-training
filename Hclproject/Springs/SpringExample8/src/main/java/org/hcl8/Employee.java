package org.hcl8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String employeeName;
	private int employeeMobileNumber1;
	private long employeeSalary;
	private String employeeEmail;
	private Address address;

	public Employee() {

	}

	public Employee(String employeeName, int employeeMobileNumber1, long employeeSalary, String employeeEmail,
			Address address) {
		super();
		this.employeeName = employeeName;
		this.employeeMobileNumber1 = employeeMobileNumber1;
		this.employeeSalary = employeeSalary;
		this.employeeEmail = employeeEmail;
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeMobileNumber1() {
		return employeeMobileNumber1;
	}

	public void setEmployeeMobileNumber1(int employeeMobileNumber1) {
		this.employeeMobileNumber1 = employeeMobileNumber1;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public void display() {
		System.out.println("Name:" + getEmployeeName());
		System.out.println("The contact Number"+getEmployeeMobileNumber1());	
		System.out.println(getEmployeeSalary());
		System.out.println(getEmployeeEmail());
		Address add = getAddress();
		add.display();
	}

}
