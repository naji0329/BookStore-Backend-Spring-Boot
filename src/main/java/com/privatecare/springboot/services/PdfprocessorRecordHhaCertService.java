package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordHhaCertDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordHhaCert;

@Service
@Transactional
public class PdfprocessorRecordHhaCertService implements IPdfprocessorRecordHhaCertService {
	
	@Autowired
	private IPdfprocessorRecordHhaCertDAO dao;

	@Override
	public PdfprocessorRecordHhaCert add(PdfprocessorRecordHhaCert hhaCertrecord) {
		return dao.add(hhaCertrecord);
	}

}
