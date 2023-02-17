package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAhcaLevel;

@Transactional
@Repository
public class PdfprocessorRecordAhcaLevelDAO implements IPdfprocessorRecordAhcaLevelDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAhcaLevel add(PdfprocessorRecordAhcaLevel ahcaLevel) {
		PdfprocessorRecordAhcaLevel newAhcaLevelRecord = new PdfprocessorRecordAhcaLevel();
		newAhcaLevelRecord.setRecordId(ahcaLevel.getRecordId());
		newAhcaLevelRecord.setRecordfileId(ahcaLevel.getRecordfileId());
		entityManager.persist(newAhcaLevelRecord);
		return newAhcaLevelRecord;
	}

}
