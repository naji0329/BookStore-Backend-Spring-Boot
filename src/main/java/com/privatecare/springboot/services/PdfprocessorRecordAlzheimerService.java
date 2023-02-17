package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAlzheimerDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAlzheimer;

@Service
@Transactional
public class PdfprocessorRecordAlzheimerService implements IPdfprocessorRecordAlzheimerService {
	
	@Autowired
	private IPdfprocessorRecordAlzheimerDAO dao;

	@Override
	public PdfprocessorRecordAlzheimer add(PdfprocessorRecordAlzheimer alzheimer) {
		return dao.add(alzheimer);
	}

}
