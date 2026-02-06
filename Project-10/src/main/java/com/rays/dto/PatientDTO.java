package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PATIENT")
public class PatientDTO extends BaseDTO{

	@Column(name = "FULL_NAME", length = 50)
	private String fullName;

	@Column(name = "GENDER", length = 50)
	private String gender;

	@Column(name = "AGE")
	private int age;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "ADDRESS", length = 50)
	private String address;

	@Column(name = "DISEASE", length = 50)
	private String disease;
	
	@Column(name = "ADMISSION_DATE")
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
	public String getValue() {
		return fullName;
	}

	@Override
	public String getUniqueKey() {
		return "fullName";
	}

	@Override
	public String getUniqueValue() {
		return fullName;
	}

	@Override
	public String getLabel() {
		return "fullName";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("fullName", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("fullName", fullName);
		return map;
	}

}
