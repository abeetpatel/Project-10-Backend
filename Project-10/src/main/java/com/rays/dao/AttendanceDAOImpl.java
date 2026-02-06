package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AttendanceDTO;

@Repository
public class AttendanceDAOImpl extends BaseDAOImpl<AttendanceDTO> implements AttendanceDAOInt {

	@Override
	protected List<Predicate> getWhereClause(AttendanceDTO dto, CriteriaBuilder builder, Root<AttendanceDTO> qRoot) {

		List<Predicate> WhereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getPersonName())) {

			WhereCondition.add(builder.like(qRoot.get("personName"), dto.getPersonName() + "%"));

		}

		if (!isEmptyString(dto.getAttendanceStatus())) {

			WhereCondition.add(builder.like(qRoot.get("attendanceStatus"), dto.getAttendanceStatus() + "%"));

		}

		if (!isEmptyString(dto.getRemarks())) {

			WhereCondition.add(builder.like(qRoot.get("remarks"), dto.getRemarks() + "%"));

		}

		if (isNotNull(dto.getAttendanceDate())) {

			WhereCondition.add(builder.equal(qRoot.get("attendanceDate"), dto.getAttendanceDate()));

		}
		
		return WhereCondition;
	}

	@Override
	public Class<AttendanceDTO> getDTOClass() {

		return AttendanceDTO.class;
	}

}
