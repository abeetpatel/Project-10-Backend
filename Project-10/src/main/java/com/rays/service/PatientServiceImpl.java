package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.PatientDAOInt;
import com.rays.dto.PatientDTO;


@Service
public class PatientServiceImpl extends BaseServiceImpl<PatientDTO, PatientDAOInt> implements PatientServiceInt{

}
