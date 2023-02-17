package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDrivingVerification;

@Transactional
@Repository
public class PdfprocessorRecordDrivingVerificationDAO implements IPdfprocessorRecordDrivingVerificationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDrivingVerification add(PdfprocessorRecordDrivingVerification drivingVerification) {
		PdfprocessorRecordDrivingVerification newDrivingVerificationRecord = new PdfprocessorRecordDrivingVerification();
		newDrivingVerificationRecord.setRecordId(drivingVerification.getRecordId());
		newDrivingVerificationRecord.setRecordfileId(drivingVerification.getRecordfileId());
		entityManager.persist(newDrivingVerificationRecord);
		return newDrivingVerificationRecord;
	}

}
