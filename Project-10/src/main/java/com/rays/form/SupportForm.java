package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SupportDTO;

public class SupportForm extends BaseForm {

	@NotEmpty(message = "please enter user name")
	private String userName;

	@NotEmpty(message = "please enter issue type")
	private String issueType;

	@NotEmpty(message = "please enter issue description")
	private String issueDescription;

	@NotEmpty(message = "please enter ticket status")
	private String ticketStatus;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	@Override
	public BaseDTO getDto() {
		SupportDTO dto = new SupportDTO();

		initDTO(dto);
		dto.setIssueDescription(issueDescription);
		dto.setIssueType(issueType);
		dto.setTicketStatus(ticketStatus);
		dto.setUserName(userName);

		return dto;
	}

}
