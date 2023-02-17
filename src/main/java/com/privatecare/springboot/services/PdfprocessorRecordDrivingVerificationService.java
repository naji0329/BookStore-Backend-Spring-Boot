package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDrivingVerificationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDrivingVerification;

@Service
@Transactional
public class PdfprocessorRecordDrivingVerificationService implements IPdfprocessorRecordDrivingVerificationService {
	
	@Autowired
	private IPdfprocessorRecordDrivingVerificationDAO dao;

	@Override
	public PdfprocessorRecordDrivingVerification add(PdfprocessorRecordDrivingVerification drivingVerification) {
		return dao.add(drivingVerification);
	}

}
