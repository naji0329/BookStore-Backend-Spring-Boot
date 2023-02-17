package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordfileDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordfile;

@Service
@Transactional
public class PdfprocessorRecordfileService implements IPdfprocessorRecordfileService {
	
	@Autowired
	private IPdfprocessorRecordfileDAO dao;

	@Override
	public PdfprocessorRecordfile add(PdfprocessorRecordfile recordfile) {
		return dao.add(recordfile);
	}

	@Override
	public PdfprocessorRecordfile getRecordfileById(int recordfileId) {
		return dao.getRecordfileyId(recordfileId);
	}
	

}
