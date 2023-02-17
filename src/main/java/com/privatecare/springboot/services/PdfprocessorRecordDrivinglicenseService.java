package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDrivinglicenseDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDrivinglicense;

@Service
@Transactional
public class PdfprocessorRecordDrivinglicenseService implements IPdfprocessorRecordDrivinglicenseService {
	
	@Autowired
	private IPdfprocessorRecordDrivinglicenseDAO dao;

	@Override
	public PdfprocessorRecordDrivinglicense add(PdfprocessorRecordDrivinglicense drivinglicenseRecord) {
		return dao.add(drivinglicenseRecord);
	}

}
