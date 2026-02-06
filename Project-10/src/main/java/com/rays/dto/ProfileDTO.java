package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_PROFILE")
public class ProfileDTO extends BaseDTO {

	@Column(name = "FULL_NAME", length = 50)
	private String fullName;
	
	@Column(name = "GENDER", length = 50)
	private String gender;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "PROFILE_STATUS", length = 50)
	private String profileStatus;

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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(String profileStatus) {
		this.profileStatus = profileStatus;
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
