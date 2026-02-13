package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SupportDAOInt;
import com.rays.dto.SupportDTO;

@Service
@Transactional
public class SupportServiceImpl extends BaseServiceImpl<SupportDTO, SupportDAOInt> implements SupportServiceInt{

}
