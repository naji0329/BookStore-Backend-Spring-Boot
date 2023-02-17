package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDAO;
import com.privatecare.springboot.entity.PdfprocessorRecord;

@Service
@Transactional
public class PdfprocessorRecordService implements IPdfprocessorRecordService {
	
	@Autowired
	private IPdfprocessorRecordDAO dao;

	@Override
	public PdfprocessorRecord add(PdfprocessorRecord record) {
		return dao.add(record);
	}

	@Override
	public PdfprocessorRecord getApplicationById(int id) {
		return dao.getApplicationById(id);
	}

}
