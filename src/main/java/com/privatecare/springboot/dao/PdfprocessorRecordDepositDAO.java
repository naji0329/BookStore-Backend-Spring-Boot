package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDeposit;

@Transactional
@Repository
public class PdfprocessorRecordDepositDAO implements IPdfprocessorRecordDepositDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDeposit add(PdfprocessorRecordDeposit deposit) {
		PdfprocessorRecordDeposit newDepositRecord = new PdfprocessorRecordDeposit();
		newDepositRecord.setRecordId(deposit.getRecordId());
		newDepositRecord.setRecordfileId(deposit.getRecordfileId());
		entityManager.persist(newDepositRecord);
		return newDepositRecord;
	}

}
