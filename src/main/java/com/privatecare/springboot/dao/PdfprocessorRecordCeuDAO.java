package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordCeu;

@Transactional
@Repository
public class PdfprocessorRecordCeuDAO implements IPdfprocessorRecordCeuDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordCeu add(PdfprocessorRecordCeu ceu) {
		PdfprocessorRecordCeu newCeuRecord = new PdfprocessorRecordCeu();
		newCeuRecord.setRecordId(ceu.getRecordId());
		newCeuRecord.setRecordfileId(ceu.getRecordfileId());
		entityManager.persist(newCeuRecord);
		return newCeuRecord;
	}

}
