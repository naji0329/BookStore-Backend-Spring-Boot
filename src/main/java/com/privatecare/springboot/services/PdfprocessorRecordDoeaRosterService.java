package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDoeaRosterDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDoeaRoster;

@Service
@Transactional
public class PdfprocessorRecordDoeaRosterService implements IPdfprocessorRecordDoeaRosterService {
	
	@Autowired
	private IPdfprocessorRecordDoeaRosterDAO dao;

	@Override
	public PdfprocessorRecordDoeaRoster add(PdfprocessorRecordDoeaRoster doeaRoster) {
		return dao.add(doeaRoster);
	}

}
