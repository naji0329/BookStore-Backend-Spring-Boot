package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordHhaCert;

@Transactional
@Repository
public class PdfprocessorRecordHhaCertDAO implements IPdfprocessorRecordHhaCertDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordHhaCert add(PdfprocessorRecordHhaCert hhaCert) {
		PdfprocessorRecordHhaCert newHhaCertRecord = new PdfprocessorRecordHhaCert();
		newHhaCertRecord.setRecordId(hhaCert.getRecordId());
		newHhaCertRecord.setRecordfileId(hhaCert.getRecordfileId());
		entityManager.persist(newHhaCertRecord);
		return newHhaCertRecord;
	}

}
