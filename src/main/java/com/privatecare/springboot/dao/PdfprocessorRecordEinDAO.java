package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordEin;

@Transactional
@Repository
public class PdfprocessorRecordEinDAO implements IPdfprocessorRecordEinDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordEin add(PdfprocessorRecordEin ein) {
		PdfprocessorRecordEin newEinRecord = new PdfprocessorRecordEin();
		newEinRecord.setRecordId(ein.getRecordId());
		newEinRecord.setRecordfileId(ein.getRecordfileId());
		entityManager.persist(newEinRecord);
		return newEinRecord;
	}

}
