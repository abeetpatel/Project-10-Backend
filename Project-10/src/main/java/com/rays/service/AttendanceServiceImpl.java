package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.AttendanceDAOInt;
import com.rays.dto.AttendanceDTO;

@Service
@Transactional
public class AttendanceServiceImpl extends BaseServiceImpl<AttendanceDTO, AttendanceDAOInt>
		implements AttendanceServiceInt {

}
