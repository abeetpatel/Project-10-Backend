package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.PatientDTO;

public class PatientForm extends BaseForm {

	@NotEmpty(message = "please enter full name")
	private String fullName;

	@NotEmpty(message = "please enter gender")
	private String gender;

	@NotNull(message = "please enter age")
	private int age;

	@NotEmpty(message = "please enter phone number")
	private String phoneNumber;

	@NotEmpty(message = "please enter address")
	private String address;

	@NotEmpty(message = "please enter disease")
	private String disease;

	@NotNull(message = "please enter admission date")
	private Date admissionDate;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	@Override
	public BaseDTO getDto() {
		
		PatientDTO dto = initDTO(new PatientDTO());
		dto.setFullName(fullName);
		dto.setGender(gender);
		dto.setAge(age);
		dto.setPhoneNumber(phoneNumber);
		dto.setAddress(address);
		dto.setDisease(disease);
		dto.setAdmissionDate(admissionDate);
		return dto;
	}

}
