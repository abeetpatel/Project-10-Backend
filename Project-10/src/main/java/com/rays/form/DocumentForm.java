package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DocumentDTO;

public class DocumentForm extends BaseForm {

	@NotEmpty(message = "please enter document name")
	private String documentName;

	@NotEmpty(message = "please enter document type")
	private String documentType;

	@NotEmpty(message = "please enter file path")
	private String filePath;

	@NotNull(message = "please enter upload date")
	private Date uploadDate;

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

	@Override
	public BaseDTO getDto() {

		DocumentDTO dto = new DocumentDTO();

		initDTO(dto);
		dto.setDocumentName(documentName);
		dto.setDocumentType(documentType);
		dto.setFilePath(filePath);
		dto.setUploadDate(uploadDate);

		return dto;
	}

}
