package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordW9;

@Transactional
@Repository
public class PdfprocessorRecordW9DAO implements IPdfprocessorRecordW9DAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordW9 add(PdfprocessorRecordW9 w9) {
		PdfprocessorRecordW9 newW9Record = new PdfprocessorRecordW9();
		newW9Record.setRecordId(w9.getRecordId());
		newW9Record.setRecordfileId(w9.getRecordfileId());
		entityManager.persist(newW9Record);
		return newW9Record;
	}

}
