package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl extends BaseDAOImpl<EmployeeDTO> implements EmployeeDAOInt{

	@Override
	protected List<Predicate> getWhereClause(EmployeeDTO dto, CriteriaBuilder builder, Root<EmployeeDTO> qRoot) {
		
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
			}
		
		if (!isEmptyString(dto.getAddress())) {

			whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress() + "%"));
		}

		if (isNotNull(dto.getPost())){

			whereCondition.add(builder.equal(qRoot.get("post"), dto.getPost()));
		}

		if (!isEmptyString(dto.getSalary())) {

			whereCondition.add(builder.like(qRoot.get("salary"), dto.getSalary() + "%"));
		}
		
		return whereCondition;
	}

	@Override
	public Class<EmployeeDTO> getDTOClass() {
		return EmployeeDTO.class;
	}

}
