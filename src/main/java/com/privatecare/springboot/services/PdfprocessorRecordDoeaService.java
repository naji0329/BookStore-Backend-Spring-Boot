package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDoeaDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDoea;

@Service
@Transactional
public class PdfprocessorRecordDoeaService implements IPdfprocessorRecordDoeaService {
	
	@Autowired
	private IPdfprocessorRecordDoeaDAO dao;

	@Override
	public PdfprocessorRecordDoea add(PdfprocessorRecordDoea doea) {
		return dao.add(doea);
	}

}
