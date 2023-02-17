package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAutoInsurance;

@Transactional
@Repository
public class PdfprocessorRecordAutoInsuranceDAO implements IPdfprocessorRecordAutoInsuranceDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAutoInsurance add(PdfprocessorRecordAutoInsurance autoInsurance) {
		PdfprocessorRecordAutoInsurance newAutoInsuranceRecord = new PdfprocessorRecordAutoInsurance();
		newAutoInsuranceRecord.setRecordId(autoInsurance.getRecordId());
		newAutoInsuranceRecord.setRecordfileId(autoInsurance.getRecordfileId());
		entityManager.persist(newAutoInsuranceRecord);
		return newAutoInsuranceRecord;
	}

}
