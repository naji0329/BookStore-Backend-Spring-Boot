package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordOigSearchDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordOigSearch;

@Service
@Transactional
public class PdfprocessorRecordOigSearchService implements IPdfprocessorRecordOigSearchService {
	
	@Autowired
	private IPdfprocessorRecordOigSearchDAO dao;

	@Override
	public PdfprocessorRecordOigSearch add(PdfprocessorRecordOigSearch oigSearch) {
		return dao.add(oigSearch);
	}

}
