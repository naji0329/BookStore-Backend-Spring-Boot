package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAlzheimer;

@Transactional
@Repository
public class PdfprocessorRecordAlzheimerDAO implements IPdfprocessorRecordAlzheimerDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAlzheimer add(PdfprocessorRecordAlzheimer alzheimer) {
		PdfprocessorRecordAlzheimer newAlzheimerRecord = new PdfprocessorRecordAlzheimer();
		newAlzheimerRecord.setRecordId(alzheimer.getRecordId());
		newAlzheimerRecord.setRecordfileId(alzheimer.getRecordfileId());
		entityManager.persist(newAlzheimerRecord);
		return newAlzheimerRecord;
	}

}
