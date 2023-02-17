package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDoeaLevel;

@Transactional
@Repository
public class PdfprocessorRecordDoeaLevelDAO implements IPdfprocessorRecordDoeaLevelDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDoeaLevel add(PdfprocessorRecordDoeaLevel doeaLevel) {
		PdfprocessorRecordDoeaLevel newDoeaLevelRecord = new PdfprocessorRecordDoeaLevel();
		newDoeaLevelRecord.setRecordId(doeaLevel.getRecordId());
		newDoeaLevelRecord.setRecordfileId(doeaLevel.getRecordfileId());
		entityManager.persist(newDoeaLevelRecord);
		return newDoeaLevelRecord;
	}

}
