package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.DocumentDAOInt;
import com.rays.dto.DocumentDTO;

@Service
@Transactional
public class DocumentServiceImpl extends BaseServiceImpl<DocumentDTO, DocumentDAOInt> implements DocumentServiceInt{

}
