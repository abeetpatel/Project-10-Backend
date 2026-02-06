package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.PatientDTO;

@Repository
public class PatientDAOImpl extends BaseDAOImpl<PatientDTO> implements PatientDAOInt{

	@Override
	protected List<Predicate> getWhereClause(PatientDTO dto, CriteriaBuilder builder, Root<PatientDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		 if (dto.getAge() > 0) {  
			 whereCondition.add(builder.equal(qRoot.get("age"), dto.getAge()));
         }


		if (!isEmptyString(dto.getFullName())) {

			whereCondition.add(builder.like(qRoot.get("fullName"), dto.getFullName() + "%"));
		}

		if (!isEmptyString(dto.getGender())) {

			whereCondition.add(builder.like(qRoot.get("gender"), dto.getGender() + "%"));
			
		}

		
		/*
		 * if (isNotNull(dto.getAge())){
		 * 
		 * 
		 * whereCondition.add(builder.equal(qRoot.get("age"), dto.getAge())); }
		 */
		 
		if (!isEmptyString(dto.getPhoneNumber())){

			whereCondition.add(builder.like(qRoot.get("phoneNumber"), dto.getPhoneNumber()));
		}
		
		if (!isEmptyString(dto.getAddress())){

			whereCondition.add(builder.like(qRoot.get("address"), dto.getAddress()));
		}
		
		if (!isEmptyString(dto.getDisease())){

			whereCondition.add(builder.like(qRoot.get("disease"), dto.getDisease()));
		}

		if (isNotNull(dto.getAdmissionDate())){

			whereCondition.add(builder.equal(qRoot.get("admissionDate"), dto.getAdmissionDate() ));
		}

		

		return whereCondition;
	}

	@Override
	public Class<PatientDTO> getDTOClass() {
		return PatientDTO.class;
	}

}
