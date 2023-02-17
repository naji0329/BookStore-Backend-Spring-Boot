package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAhcaLevelDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaLevel;

@Service
@Transactional
public class PdfprocessorRecordAhcaLevelService implements IPdfprocessorRecordAhcaLevelService {
	
	@Autowired
	private IPdfprocessorRecordAhcaLevelDAO dao;

	@Override
	public PdfprocessorRecordAhcaLevel add(PdfprocessorRecordAhcaLevel ahcaLevel) {
		return dao.add(ahcaLevel);
	}

}
