package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordNursingValidation;

@Transactional
@Repository
public class PdfprocessorRecordNursingValidationDAO implements IPdfprocessorRecordNursingValidationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordNursingValidation add(PdfprocessorRecordNursingValidation nursingValidation) {
		PdfprocessorRecordNursingValidation newNursingValidationRecord = new PdfprocessorRecordNursingValidation();
		newNursingValidationRecord.setRecordId(nursingValidation.getRecordId());
		newNursingValidationRecord.setRecordfileId(nursingValidation.getRecordfileId());
		entityManager.persist(newNursingValidationRecord);
		return newNursingValidationRecord;
	}

}
