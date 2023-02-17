package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordSs4DAO;
import com.privatecare.springboot.entity.PdfprocessorRecordSs4;

@Service
@Transactional
public class PdfprocessorRecordSs4Service implements IPdfprocessorRecordSs4Service {
	
	@Autowired
	private IPdfprocessorRecordSs4DAO dao;

	@Override
	public PdfprocessorRecordSs4 add(PdfprocessorRecordSs4 ss4) {
		return dao.add(ss4);
	}

}
