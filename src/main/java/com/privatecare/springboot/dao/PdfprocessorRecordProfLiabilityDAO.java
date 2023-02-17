package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordProfLiability;

@Transactional
@Repository
public class PdfprocessorRecordProfLiabilityDAO implements IPdfprocessorRecordProfLiabilityDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordProfLiability add(PdfprocessorRecordProfLiability profLiability) {
		PdfprocessorRecordProfLiability newProfLiabilityRecord = new PdfprocessorRecordProfLiability();
		newProfLiabilityRecord.setRecordId(profLiability.getRecordId());
		newProfLiabilityRecord.setRecordfileId(profLiability.getRecordfileId());
		entityManager.persist(newProfLiabilityRecord);
		return newProfLiabilityRecord;
	}

}
