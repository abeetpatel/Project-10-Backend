package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AuditDTO;

public class AuditForm extends BaseForm {

	@NotEmpty(message = "please enter action type")
	private String actionType;

	@NotEmpty(message = "please enter action by")
	private String actionBy;

	@NotEmpty(message = "please enter action result")
	private String actionResult;

	@NotNull(message = "please enter action time")
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
	public BaseDTO getDto() {

		AuditDTO dto = new AuditDTO();

		initDTO(dto);
		dto.setActionBy(actionBy);
		dto.setActionResult(actionResult);
		dto.setActionTime(actionTime);
		dto.setActionType(actionType);

		return dto;

	}

}
