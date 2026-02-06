package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDTO;

public class EmployeeForm extends BaseForm{
	
	@NotEmpty(message = "please enter name")
	@Pattern(regexp = "^[A-Za-z ]+$", message = "Only letters are allowed")
	private String name;

	@NotEmpty(message = "please enter address")
	private String address;

	@NotEmpty(message = "Please enter post")
    private String post;

	@NotEmpty(message = "please enter salary")
	private String salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public EmployeeDTO getDto() {

		EmployeeDTO dto = initDTO(new EmployeeDTO());
		dto.setName(name);
		dto.setAddress(address);
		dto.setPost(post);
		dto.setSalary(salary);
		return dto;
	}

}
