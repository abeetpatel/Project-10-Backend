package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SUPPORT")
public class SupportDTO extends BaseDTO {

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "ISSUE_TYPE")
	private String issueType;

	@Column(name = "ISSUE_DESCRIPTION")
	private String issueDescription;

	@Column(name = "TICKET_STATUS")
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
	public String getValue() {
		return userName;
	}

	@Override
	public String getUniqueKey() {
		return "userName";
	}

	@Override
	public String getUniqueValue() {
		return userName;
	}

	@Override
	public String getLabel() {
		return "User Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {

		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("userName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<>();

		map.put("userName", userName);

		return map;
	}
}
