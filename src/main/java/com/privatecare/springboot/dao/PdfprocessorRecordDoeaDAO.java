package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDoea;

@Transactional
@Repository
public class PdfprocessorRecordDoeaDAO implements IPdfprocessorRecordDoeaDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDoea add(PdfprocessorRecordDoea doea) {
		PdfprocessorRecordDoea newDoeaRecord = new PdfprocessorRecordDoea();
		newDoeaRecord.setRecordId(doea.getRecordId());
		newDoeaRecord.setRecordfileId(doea.getRecordfileId());
		entityManager.persist(newDoeaRecord);
		return newDoeaRecord;
	}

}
