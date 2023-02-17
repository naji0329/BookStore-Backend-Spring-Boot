package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordW9DAO;
import com.privatecare.springboot.entity.PdfprocessorRecordW9;

@Service
@Transactional
public class PdfprocessorRecordW9Service implements IPdfprocessorRecordW9Service {
	
	@Autowired
	private IPdfprocessorRecordW9DAO dao;

	@Override
	public PdfprocessorRecordW9 add(PdfprocessorRecordW9 w9) {
		return dao.add(w9);
	}

}
