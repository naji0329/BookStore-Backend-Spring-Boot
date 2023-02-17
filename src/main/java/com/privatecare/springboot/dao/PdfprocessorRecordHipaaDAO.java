package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordHipaa;

@Transactional
@Repository
public class PdfprocessorRecordHipaaDAO implements IPdfprocessorRecordHipaaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordHipaa add(PdfprocessorRecordHipaa hipaa) {
		PdfprocessorRecordHipaa newHipaaRecord = new PdfprocessorRecordHipaa();
		newHipaaRecord.setRecordId(hipaa.getRecordId());
		newHipaaRecord.setRecordfileId(hipaa.getRecordfileId());
		entityManager.persist(newHipaaRecord);
		return newHipaaRecord;
	}

}
