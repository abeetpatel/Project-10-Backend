package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ActivityDTO;

public class ActivityForm extends BaseForm {

	@NotEmpty(message = "please enter activity name")
	private String activityName;

	@NotEmpty(message = "please enter performed by")
	private String performedBy;

	@NotEmpty(message = "please enter activity status")
	private String activityStatus;

	@NotNull(message = "please enter activity time")
	private Date activityTime;

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(String activityStatus) {
		this.activityStatus = activityStatus;
	}

	public String getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(String performedBy) {
		this.performedBy = performedBy;
	}

	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}

	@Override
	public BaseDTO getDto() {

		ActivityDTO dto = new ActivityDTO();

		initDTO(dto);
		dto.setActivityName(activityName);
		dto.setActivityStatus(activityStatus);
		dto.setActivityTime(activityTime);
		dto.setPerformedBy(performedBy);

		return dto;
	}

}
