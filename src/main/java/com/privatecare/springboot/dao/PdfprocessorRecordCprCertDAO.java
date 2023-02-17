package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordCprCert;

@Transactional
@Repository
public class PdfprocessorRecordCprCertDAO implements IPdfprocessorRecordCprCertDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordCprCert add(PdfprocessorRecordCprCert cprCert) {
		PdfprocessorRecordCprCert newCprCertRecord = new PdfprocessorRecordCprCert();
		newCprCertRecord.setRecordId(cprCert.getRecordId());
		newCprCertRecord.setRecordfileId(cprCert.getRecordfileId());
		entityManager.persist(newCprCertRecord);
		return newCprCertRecord;
	}

}
