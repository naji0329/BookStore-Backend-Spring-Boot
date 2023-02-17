package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordSs4;

@Transactional
@Repository
public class PdfprocessorRecordSs4DAO implements IPdfprocessorRecordSs4DAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordSs4 add(PdfprocessorRecordSs4 ss4) {
		PdfprocessorRecordSs4 newSs4Record = new PdfprocessorRecordSs4();
		newSs4Record.setRecordId(ss4.getRecordId());
		newSs4Record.setRecordfileId(ss4.getRecordfileId());
		entityManager.persist(newSs4Record);
		return newSs4Record;
	}

}
