package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordApplicationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordApplication;

@Service
@Transactional
public class PdfprocessorRecordApplicationService implements IPdfprocessorRecordApplicationService {
	
	@Autowired
	private IPdfprocessorRecordApplicationDAO dao;

	@Override
	public PdfprocessorRecordApplication add(PdfprocessorRecordApplication application) {
		return dao.add(application);
	}

	@Override
	public PdfprocessorRecordApplication update(Integer id, PdfprocessorRecordApplication application) {
		return dao.update(id, application);
	}

	@Override
	public PdfprocessorRecordApplication getApplicationRecordById(int id) {
		return dao.getApplicationRecordById(id);
	}

}
