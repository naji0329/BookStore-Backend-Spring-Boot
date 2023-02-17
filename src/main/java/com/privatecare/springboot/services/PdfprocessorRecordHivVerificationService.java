package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordHivVerificationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordHivVerification;

@Service
@Transactional
public class PdfprocessorRecordHivVerificationService implements IPdfprocessorRecordHivVerificationService {
	
	@Autowired
	private IPdfprocessorRecordHivVerificationDAO dao;

	@Override
	public PdfprocessorRecordHivVerification add(PdfprocessorRecordHivVerification hivVerification) {
		return dao.add(hivVerification);
	}

}
