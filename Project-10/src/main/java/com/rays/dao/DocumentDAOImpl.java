package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DocumentDTO;

@Repository
public class DocumentDAOImpl extends BaseDAOImpl<DocumentDTO> implements DocumentDAOInt {

	@Override
	protected List<Predicate> getWhereClause(DocumentDTO dto, CriteriaBuilder builder, Root<DocumentDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getDocumentName())) {
			whereCondition.add(builder.like(qRoot.get("documentName"), dto.getDocumentName() + "%"));
		}

		if (!isEmptyString(dto.getDocumentType())) {
			whereCondition.add(builder.like(qRoot.get("documentType"), dto.getDocumentType() + "%"));
		}

		if (!isEmptyString(dto.getFilePath())) {
			whereCondition.add(builder.like(qRoot.get("filePath"), dto.getFilePath() + "%"));
		}

		if (isNotNull(dto.getUploadDate())) {
			whereCondition.add(builder.equal(qRoot.get("uploadDate"), dto.getUploadDate()));
		}

		return whereCondition;
	}

	@Override
	public Class<DocumentDTO> getDTOClass() {
		return DocumentDTO.class;
	}

}
