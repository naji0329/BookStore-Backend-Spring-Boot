package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordNursingValidationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordNursingValidation;

@Service
@Transactional
public class PdfprocessorRecordNursingValidationService implements IPdfprocessorRecordNursingValidationService {
	
	@Autowired
	private IPdfprocessorRecordNursingValidationDAO dao;

	@Override
	public PdfprocessorRecordNursingValidation add(PdfprocessorRecordNursingValidation nursingValidation) {
		return dao.add(nursingValidation);
	}

}
