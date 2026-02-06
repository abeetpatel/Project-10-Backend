package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VehicalDAOInt;
import com.rays.dto.VehicalDTO;

@Service
@Transactional
public class VehicalServiceImpl extends BaseServiceImpl<VehicalDTO, VehicalDAOInt> implements VehicalServiceInt{

}
