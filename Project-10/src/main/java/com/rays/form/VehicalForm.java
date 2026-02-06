package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VehicalDTO;

public class VehicalForm extends BaseForm {

	@NotEmpty(message = "please enter vehical no")
	private String vehicalNo;

	@NotEmpty(message = "please enter body type")
	private String bodyType;

	@NotEmpty(message = "please enter brand")
	private String brand;

	@NotNull(message = "please enter purchase date")
	private Date purchaseDate;

	public String getVehicalNo() {
		return vehicalNo;
	}

	public void setVehicalNo(String vehicalNo) {
		this.vehicalNo = vehicalNo;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public BaseDTO getDto() {

		VehicalDTO dto = new VehicalDTO();

		initDTO(dto);
		dto.setBodyType(bodyType);
		dto.setBrand(brand);
		dto.setVehicalNo(vehicalNo);
		dto.setPurchaseDate(purchaseDate);

		return dto;
	}

}
