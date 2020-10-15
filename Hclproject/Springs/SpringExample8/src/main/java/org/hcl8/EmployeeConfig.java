package org.hcl8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "org.hcl8")
public class EmployeeConfig {
@Bean(name="employee")
public Employee getEmployee(){
	Employee emp=new Employee();
	emp.setEmployeeName("Sathish");
	emp.setEmployeeMobileNumber1(831758714);
	emp.setEmployeeSalary(45000);
	emp.setEmployeeEmail("me@gmail.com");
	emp.setAddress(getAddress());
	return emp;
}
@Bean(name="address")
public Address getAddress(){
	Address add=new  Address();
	add.setLine1("AnnaNagar");
	add.setLine2("Kaveripattnam");
	add.setCity("Krishnagiri");
	add.setPincode("560084");
	return add;
}
}
