package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ActivityDTO;

@Repository
public class ActivityDAOImpl extends BaseDAOImpl<ActivityDTO> implements ActivityDAOInt {

	@Override
	protected List<Predicate> getWhereClause(ActivityDTO dto, CriteriaBuilder builder, Root<ActivityDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getActivityName())) {

			whereCondition.add(builder.like(qRoot.get("activityName"), dto.getActivityName()));

		}

		if (!isEmptyString(dto.getActivityStatus())) {

			whereCondition.add(builder.like(qRoot.get("activityStatus"), dto.getActivityStatus()));

		}

		if (!isEmptyString(dto.getPerformedBy())) {

			whereCondition.add(builder.like(qRoot.get("performedBy"), dto.getPerformedBy()));

		}

		if (isNotNull(dto.getActivityTime())) {

			whereCondition.add(builder.equal(qRoot.get("activityTime"), dto.getActivityTime()));

		}

		return whereCondition;
	}

	@Override
	public Class<ActivityDTO> getDTOClass() {
		return ActivityDTO.class;
	}

}
