package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAssist;

@Transactional
@Repository
public class PdfprocessorRecordAssistDAO implements IPdfprocessorRecordAssistDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAssist add(PdfprocessorRecordAssist assist) {
		PdfprocessorRecordAssist newAssistRecord = new PdfprocessorRecordAssist();
		newAssistRecord.setRecordId(assist.getRecordId());
		newAssistRecord.setRecordfileId(assist.getRecordfileId());
		entityManager.persist(newAssistRecord);
		return newAssistRecord;
	}

}
