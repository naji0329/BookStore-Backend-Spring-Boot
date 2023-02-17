package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDrivinglicense;

@Transactional
@Repository
public class PdfprocessorRecordDrivinglicenseDAO implements IPdfprocessorRecordDrivinglicenseDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDrivinglicense add(PdfprocessorRecordDrivinglicense drivinglicense) {
		PdfprocessorRecordDrivinglicense newDrivinglicenseRecord = new PdfprocessorRecordDrivinglicense();
		newDrivinglicenseRecord.setRecordId(drivinglicense.getRecordId());
		newDrivinglicenseRecord.setRecordfileId(drivinglicense.getRecordfileId());
		entityManager.persist(newDrivinglicenseRecord);
		return newDrivinglicenseRecord;
	}

}
