package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordNursingLicenseDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordNursingLicense;

@Service
@Transactional
public class PdfprocessorRecordNursingLicenseService implements IPdfprocessorRecordNursingLicenseService {
	
	@Autowired
	private IPdfprocessorRecordNursingLicenseDAO dao;

	@Override
	public PdfprocessorRecordNursingLicense add(PdfprocessorRecordNursingLicense nursingLicense) {
		return dao.add(nursingLicense);
	}

}
