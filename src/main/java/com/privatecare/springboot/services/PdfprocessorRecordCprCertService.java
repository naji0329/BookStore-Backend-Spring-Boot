package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordCprCertDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordCprCert;

@Service
@Transactional
public class PdfprocessorRecordCprCertService implements IPdfprocessorRecordCprCertService {
	
	@Autowired
	private IPdfprocessorRecordCprCertDAO dao;

	@Override
	public PdfprocessorRecordCprCert add(PdfprocessorRecordCprCert cprCert) {
		return dao.add(cprCert);
	}

}
