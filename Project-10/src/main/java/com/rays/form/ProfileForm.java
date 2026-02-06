package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ProfileDTO;

public class ProfileForm extends BaseForm {

	@NotEmpty(message = "please enter full name")
	private String fullName;

	@NotEmpty(message = "please enter gender")
	private String gender;

	@NotNull(message = "please enter dob")
	private Date dob;

	@NotEmpty(message = "please enter profile status")
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
	public BaseDTO getDto() {

		ProfileDTO dto = new ProfileDTO();

		initDTO(dto);
		dto.setFullName(fullName);
		dto.setGender(gender);
		dto.setProfileStatus(profileStatus);
		dto.setDob(dob);

		return dto;
	}

}
