package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordStatement;

@Transactional
@Repository
public class PdfprocessorRecordStatementDAO implements IPdfprocessorRecordStatementDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordStatement add(PdfprocessorRecordStatement statement) {
		PdfprocessorRecordStatement newStatementRecord = new PdfprocessorRecordStatement();
		newStatementRecord.setRecordId(statement.getRecordId());
		newStatementRecord.setRecordfileId(statement.getRecordfileId());
		entityManager.persist(newStatementRecord);
		return newStatementRecord;
	}

}
