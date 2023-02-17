package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordVaccinationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordVaccination;

@Service
@Transactional
public class PdfprocessorRecordVaccinationService implements IPdfprocessorRecordVaccinationService {
	
	@Autowired
	private IPdfprocessorRecordVaccinationDAO dao;

	@Override
	public PdfprocessorRecordVaccination add(PdfprocessorRecordVaccination vaccination) {
		return dao.add(vaccination);
	}

}
