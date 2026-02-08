package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_AUDIT")
public class AuditDTO extends BaseDTO {

	@Column(name = "ACTION_TYPE", length = 50)
	private String actionType;

	@Column(name = "ACTION_BY", length = 50)
	private String actionBy;

	@Column(name = "ACTION_RESULT", length = 50)
	private String actionResult;

	@Column(name = "ACTION_TIME")
	private Date actionTime;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionBy() {
		return actionBy;
	}

	public void setActionBy(String actionBy) {
		this.actionBy = actionBy;
	}

	public String getActionResult() {
		return actionResult;
	}

	public void setActionResult(String actionResult) {
		this.actionResult = actionResult;
	}

	public Date getActionTime() {
		return actionTime;
	}

	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	@Override
	public String getValue() {
		return actionType;
	}

	@Override
	public String getUniqueKey() {
		return "actionType";
	}

	@Override
	public String getUniqueValue() {
		return actionType;
	}

	@Override
	public String getLabel() {
		return "actionType";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {

		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("actionType", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<>();

		map.put("actionType", actionType);

		return map;
	}

}
