package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordPrivacy;

@Transactional
@Repository
public class PdfprocessorRecordPrivacyDAO implements IPdfprocessorRecordPrivacyDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordPrivacy add(PdfprocessorRecordPrivacy privacy) {
		PdfprocessorRecordPrivacy newPrivacyRecord = new PdfprocessorRecordPrivacy();
		newPrivacyRecord.setRecordId(privacy.getRecordId());
		newPrivacyRecord.setRecordfileId(privacy.getRecordfileId());
		entityManager.persist(newPrivacyRecord);
		return newPrivacyRecord;
	}

}
