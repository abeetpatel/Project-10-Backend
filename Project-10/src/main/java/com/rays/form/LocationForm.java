package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LocationDTO;

public class LocationForm extends BaseForm {

	@NotEmpty(message = "please enter city")
	private String city;

	@NotEmpty(message = "please enter state")
	private String state;

	@NotEmpty(message = "please enter country")
	private String country;

	@NotEmpty(message = "please enter locationStatus")
	private String locationStatus;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationStatus() {
		return locationStatus;
	}

	public void setLocationStatus(String locationStatus) {
		this.locationStatus = locationStatus;
	}

	@Override
	public BaseDTO getDto() {
		LocationDTO dto = new LocationDTO();

		initDTO(dto);
		dto.setCity(city);
		dto.setState(state);
		dto.setCountry(country);
		dto.setLocationStatus(locationStatus);

		return dto;
	}

}
