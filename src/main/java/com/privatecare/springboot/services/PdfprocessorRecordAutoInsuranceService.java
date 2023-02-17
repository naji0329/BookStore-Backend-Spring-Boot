package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAutoInsuranceDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAutoInsurance;

@Service
@Transactional
public class PdfprocessorRecordAutoInsuranceService implements IPdfprocessorRecordAutoInsuranceService {
	
	@Autowired
	private IPdfprocessorRecordAutoInsuranceDAO dao;

	@Override
	public PdfprocessorRecordAutoInsurance add(PdfprocessorRecordAutoInsurance autoInsurance) {
		return dao.add(autoInsurance);
	}

}
