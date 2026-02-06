package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VehicalDTO;

@Repository
public class VehicalDAOImpl extends BaseDAOImpl<VehicalDTO> implements VehicalDAOInt{

	@Override
	protected List<Predicate> getWhereClause(VehicalDTO dto, CriteriaBuilder builder, Root<VehicalDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if (!isEmptyString(dto.getBrand())) {

			whereCondition.add(builder.like(qRoot.get("brand"), dto.getBrand() + "%"));
		}
		
		if (!isEmptyString(dto.getBodyType())) {

			whereCondition.add(builder.like(qRoot.get("bodyType"), dto.getBodyType() + "%"));
		}
		
		if (!isEmptyString(dto.getVehicalNo())) {

			whereCondition.add(builder.like(qRoot.get("vehicalNo"), dto.getVehicalNo() + "%"));
		}
		
		if (isNotNull(dto.getPurchaseDate())) {

			whereCondition.add(builder.equal(qRoot.get("purchaseDate"), dto.getPurchaseDate()));
		}
		
		return whereCondition;
	}

	@Override
	public Class<VehicalDTO> getDTOClass() {
		return VehicalDTO.class;
	}

}
