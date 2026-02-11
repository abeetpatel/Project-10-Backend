package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

/**
 * @author abeet
 *
 */

@Entity
@Table(name = "ST_ACTIVITY")
public class ActivityDTO extends BaseDTO {

	@Column(name = "ACTIVITY_NAME", length = 50)
	private String activityName;

	@Column(name = "PERFORMED_BY", length = 50)
	private String performedBy;

	@Column(name = "ACTIVITY_STATUS", length = 50)
	private String activityStatus;

	@Column(name = "ACTIVITY_TIME")
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
	public String getValue() {
		return activityName;
	}

	@Override
	public String getUniqueKey() {
		return "activityName";
	}

	@Override
	public String getUniqueValue() {
		return activityName;
	}

	@Override
	public String getLabel() {
		return "Activity";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {

		LinkedHashMap<String, String> map = new LinkedHashMap<>();

		map.put("activityName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {

		LinkedHashMap<String, Object> map = new LinkedHashMap<>();

		map.put("activityName", activityName);

		return map;
	}

}
