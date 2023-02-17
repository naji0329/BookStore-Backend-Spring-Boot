package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordProfLiabilityDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordProfLiability;

@Service
@Transactional
public class PdfprocessorRecordProfLiabilityService implements IPdfprocessorRecordProfLiabilityService {
	
	@Autowired
	private IPdfprocessorRecordProfLiabilityDAO dao;

	@Override
	public PdfprocessorRecordProfLiability add(PdfprocessorRecordProfLiability profLiability) {
		return dao.add(profLiability);
	}

}
