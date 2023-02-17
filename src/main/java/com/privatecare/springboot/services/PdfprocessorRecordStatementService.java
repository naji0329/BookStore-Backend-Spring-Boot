package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordStatementDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordStatement;

@Service
@Transactional
public class PdfprocessorRecordStatementService implements IPdfprocessorRecordStatementService {
	
	@Autowired
	private IPdfprocessorRecordStatementDAO dao;

	@Override
	public PdfprocessorRecordStatement add(PdfprocessorRecordStatement statement) {
		return dao.add(statement);
	}

}
