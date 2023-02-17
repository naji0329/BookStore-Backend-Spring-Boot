package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDomesticDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDomestic;

@Service
@Transactional
public class PdfprocessorRecordDomesticService implements IPdfprocessorRecordDomesticService {
	
	@Autowired
	private IPdfprocessorRecordDomesticDAO dao;

	@Override
	public PdfprocessorRecordDomestic add(PdfprocessorRecordDomestic domestic) {
		return dao.add(domestic);
	}

}
