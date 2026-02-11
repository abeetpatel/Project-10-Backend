package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.LocationDTO;

@Repository
public class LocationDAOImpl extends BaseDAOImpl<LocationDTO> implements LocationDAOInt {

	@Override
	protected List<Predicate> getWhereClause(LocationDTO dto, CriteriaBuilder builder, Root<LocationDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCity())) {
			whereCondition.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
		}
		
		if (!isEmptyString(dto.getState())) {
			whereCondition.add(builder.like(qRoot.get("state"), dto.getState() + "%"));
		}
		
		if (!isEmptyString(dto.getCountry())) {
			whereCondition.add(builder.like(qRoot.get("country"), dto.getCountry() + "%"));
		}
		
		if (!isEmptyString(dto.getLocationStatus())) {
			whereCondition.add(builder.like(qRoot.get("locationStatus"), dto.getLocationStatus() + "%"));
		}

		return whereCondition;
	}

	@Override
	public Class<LocationDTO> getDTOClass() {
		return LocationDTO.class;
	}

}
