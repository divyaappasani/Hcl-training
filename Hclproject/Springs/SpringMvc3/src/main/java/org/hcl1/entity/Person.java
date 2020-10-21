package org.hcl1.entity;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Person {
	@NotBlank(message = "Last name is required")
	@Length(min = 3, max = 8,message="length allowed is 3 to 8 characters")
	private String firstName;
	@NotBlank(message = "Last name is required")
	private String lastName;

	public Person() {

	}

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
