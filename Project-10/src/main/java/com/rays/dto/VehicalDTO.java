package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_VEHICAL")
public class VehicalDTO extends BaseDTO {

	@Column(name = "VEHICAL_NO", length = 10)
	private String vehicalNo;
	
	@Column(name = "BODY_TYPE", length = 50)
	private String bodyType;
	
	@Column(name = "BRAND", length = 50)
	private String brand;
	
	@Column(name = "PURCHASE_DATE")
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
	
	public String getKey() {
		return id + "";
	}

	@Override
	public String getValue() {
		return vehicalNo;
	}

	@Override
	public String getUniqueKey() {
		return "vehicalNo";
	}

	@Override
	public String getUniqueValue() {
		return vehicalNo;
	}

	@Override
	public String getLabel() {
		return "Vehical No";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("vehicalNo", "asc");
		
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("vehicalNo", vehicalNo);
		return map;
	}

}
