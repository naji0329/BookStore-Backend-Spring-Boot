package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordPrivacyDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordPrivacy;

@Service
@Transactional
public class PdfprocessorRecordPrivacyService implements IPdfprocessorRecordPrivacyService {
	
	@Autowired
	private IPdfprocessorRecordPrivacyDAO dao;

	@Override
	public PdfprocessorRecordPrivacy add(PdfprocessorRecordPrivacy privacy) {
		return dao.add(privacy);
	}

}
