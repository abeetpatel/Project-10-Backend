package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AttendanceDTO;

public class AttendanceFrom extends BaseForm {

	@NotEmpty(message = "please enter person name")
	private String personName;

	@NotNull(message = "please enter attendance date")
	private Date attendanceDate;

	@NotEmpty(message = "please enter attendance status")
	private String attendanceStatus;

	@NotEmpty(message = "please enter remarks")
	private String remarks;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public BaseDTO getDto() {

		AttendanceDTO dto = new AttendanceDTO();

		initDTO(dto);
		dto.setPersonName(personName);
		dto.setAttendanceDate(attendanceDate);
		dto.setAttendanceStatus(attendanceStatus);
		dto.setRemarks(remarks);

		return dto;
	}

}
