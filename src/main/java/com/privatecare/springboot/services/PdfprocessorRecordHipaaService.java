package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordHipaaDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordHipaa;

@Service
@Transactional
public class PdfprocessorRecordHipaaService implements IPdfprocessorRecordHipaaService {
	
	@Autowired
	private IPdfprocessorRecordHipaaDAO dao;

	@Override
	public PdfprocessorRecordHipaa add(PdfprocessorRecordHipaa hipaa) {
		return dao.add(hipaa);
	}

}
