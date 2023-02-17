package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordEinDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordEin;

@Service
@Transactional
public class PdfprocessorRecordEinService implements IPdfprocessorRecordEinService {
	
	@Autowired
	private IPdfprocessorRecordEinDAO dao;

	@Override
	public PdfprocessorRecordEin add(PdfprocessorRecordEin ein) {
		return dao.add(ein);
	}

}
