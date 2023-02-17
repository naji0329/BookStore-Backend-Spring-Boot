package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordCeuDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordCeu;

@Service
@Transactional
public class PdfprocessorRecordCeuService implements IPdfprocessorRecordCeuService {
	
	@Autowired
	private IPdfprocessorRecordCeuDAO dao;

	@Override
	public PdfprocessorRecordCeu add(PdfprocessorRecordCeu ceu) {
		return dao.add(ceu);
	}

}
