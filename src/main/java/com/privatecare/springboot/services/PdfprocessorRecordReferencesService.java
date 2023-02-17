package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordReferencesDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordReferences;

@Service
@Transactional
public class PdfprocessorRecordReferencesService implements IPdfprocessorRecordReferencesService {
	
	@Autowired
	private IPdfprocessorRecordReferencesDAO dao;

	@Override
	public PdfprocessorRecordReferences add(PdfprocessorRecordReferences references) {
		return dao.add(references);
	}

}
