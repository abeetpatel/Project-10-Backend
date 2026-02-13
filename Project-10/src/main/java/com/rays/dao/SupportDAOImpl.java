package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SupportDTO;

@Repository
public class SupportDAOImpl extends BaseDAOImpl<SupportDTO> implements SupportDAOInt {

	@Override
	protected List<Predicate> getWhereClause(SupportDTO dto, CriteriaBuilder builder, Root<SupportDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getUserName())) {
			whereCondition.add(builder.like(qRoot.get("userName"), dto.getUserName()));
		}
		
		if(!isEmptyString(dto.getIssueType())) {
			whereCondition.add(builder.like(qRoot.get("issueType"), dto.getIssueType()));
		}
		
		if(!isEmptyString(dto.getIssueDescription())) {
			whereCondition.add(builder.like(qRoot.get("issueDescription"), dto.getIssueDescription()));
		}
		
		if(!isEmptyString(dto.getTicketStatus())) {
			whereCondition.add(builder.like(qRoot.get("ticketStatus"), dto.getTicketStatus()));
		}
		
		return whereCondition;
	}

	@Override
	public Class<SupportDTO> getDTOClass() {
		return SupportDTO.class;
	}

}
