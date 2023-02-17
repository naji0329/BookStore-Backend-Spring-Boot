package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAssistDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAssist;

@Service
@Transactional
public class PdfprocessorRecordAssistService implements IPdfprocessorRecordAssistService {
	
	@Autowired
	private IPdfprocessorRecordAssistDAO dao;

	@Override
	public PdfprocessorRecordAssist add(PdfprocessorRecordAssist assist) {
		return dao.add(assist);
	}

}
