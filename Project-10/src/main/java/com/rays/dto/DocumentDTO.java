package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_DOCUMENT")
public class DocumentDTO extends BaseDTO {

	@Column(name = "DOCUMENT_NAME", length = 50)
	private String documentName;

	@Column(name = "DOCUMENT_TYPE", length = 50)
	private String documentType;

	@Column(name = "FILE_PATH", length = 50)
	private String filePath;

	@Column(name = "UPLOAD_DATE")
	private Date uploadDate;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	@Override
	public String getValue() {
		return documentName;
	}

	@Override
	public String getUniqueKey() {
		return "documentName";
	}

	@Override
	public String getUniqueValue() {
		return documentName;
	}

	@Override
	public String getLabel() {
		return "Document Name";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("documentName", "asc");

		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("documentName", documentName);
		return map;
	}

}
