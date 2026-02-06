package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ProfileDAOInt;
import com.rays.dto.ProfileDTO;

@Service
@Transactional
public class ProfileServiceImpl extends BaseServiceImpl<ProfileDTO, ProfileDAOInt> implements ProfileServiceInt {

}
