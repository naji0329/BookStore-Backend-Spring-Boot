package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAhcaRosterDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaRoster;

@Service
@Transactional
public class PdfprocessorRecordAhcaRosterService implements IPdfprocessorRecordAhcaRosterService {
	
	@Autowired
	private IPdfprocessorRecordAhcaRosterDAO dao;

	@Override
	public PdfprocessorRecordAhcaRoster add(PdfprocessorRecordAhcaRoster ahcaRoster) {
		return dao.add(ahcaRoster);
	}

}
