package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordHivVerification;

@Transactional
@Repository
public class PdfprocessorRecordHivVerificationDAO implements IPdfprocessorRecordHivVerificationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordHivVerification add(PdfprocessorRecordHivVerification hivVerification) {
		PdfprocessorRecordHivVerification newHivVerificationRecord = new PdfprocessorRecordHivVerification();
		newHivVerificationRecord.setRecordId(hivVerification.getRecordId());
		newHivVerificationRecord.setRecordfileId(hivVerification.getRecordfileId());
		entityManager.persist(newHivVerificationRecord);
		return newHivVerificationRecord;
	}

}
