package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordSocialSecurity;

@Transactional
@Repository
public class PdfprocessorRecordSocialSecurityDAO implements IPdfprocessorRecordSocialSecurityDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordSocialSecurity add(PdfprocessorRecordSocialSecurity socialSecurity) {
		PdfprocessorRecordSocialSecurity newSocialSecurityRecord = new PdfprocessorRecordSocialSecurity();
		newSocialSecurityRecord.setRecordId(socialSecurity.getRecordId());
		newSocialSecurityRecord.setRecordfileId(socialSecurity.getRecordfileId());
		entityManager.persist(newSocialSecurityRecord);
		return newSocialSecurityRecord;
	}

}
