package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDoeaLevelDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDoeaLevel;

@Service
@Transactional
public class PdfprocessorRecordDoeaLevelService implements IPdfprocessorRecordDoeaLevelService {
	
	@Autowired
	private IPdfprocessorRecordDoeaLevelDAO dao;

	@Override
	public PdfprocessorRecordDoeaLevel add(PdfprocessorRecordDoeaLevel doeaLevel) {
		return dao.add(doeaLevel);
	}

}
