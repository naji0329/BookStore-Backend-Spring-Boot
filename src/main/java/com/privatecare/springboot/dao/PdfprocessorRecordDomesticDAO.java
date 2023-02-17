package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDomestic;

@Transactional
@Repository
public class PdfprocessorRecordDomesticDAO implements IPdfprocessorRecordDomesticDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDomestic add(PdfprocessorRecordDomestic domestic) {
		PdfprocessorRecordDomestic newDomesticRecord = new PdfprocessorRecordDomestic();
		newDomesticRecord.setRecordId(domestic.getRecordId());
		newDomesticRecord.setRecordfileId(domestic.getRecordfileId());
		entityManager.persist(newDomesticRecord);
		return newDomesticRecord;
	}

}
