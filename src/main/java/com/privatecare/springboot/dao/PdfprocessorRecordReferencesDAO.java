package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordReferences;

@Transactional
@Repository
public class PdfprocessorRecordReferencesDAO implements IPdfprocessorRecordReferencesDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordReferences add(PdfprocessorRecordReferences references) {
		PdfprocessorRecordReferences newReferencesRecord = new PdfprocessorRecordReferences();
		newReferencesRecord.setRecordId(references.getRecordId());
		newReferencesRecord.setRecordfileId(references.getRecordfileId());
		entityManager.persist(newReferencesRecord);
		return newReferencesRecord;
	}

}
