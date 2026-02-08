package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AuditDTO;

@Repository
public class AuditDAOImpl extends BaseDAOImpl<AuditDTO> implements AuditDAOInt {

	@Override
	protected List<Predicate> getWhereClause(AuditDTO dto, CriteriaBuilder builder, Root<AuditDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getActionBy())) {

			whereCondition.add(builder.like(qRoot.get("actionBy"), dto.getActionBy() + "%"));

		}

		if (!isEmptyString(dto.getActionResult())) {

			whereCondition.add(builder.like(qRoot.get("actionResult"), dto.getActionResult() + "%"));

		}

		if (!isEmptyString(dto.getActionType())) {

			whereCondition.add(builder.like(qRoot.get("actionType"), dto.getActionType() + "%"));

		}

		if (isNotNull(dto.getActionTime())) {

			whereCondition.add(builder.equal(qRoot.get("actionTime"), dto.getActionTime()));

		}

		return whereCondition;
	}

	@Override
	public Class<AuditDTO> getDTOClass() {
		return AuditDTO.class;
	}

}
