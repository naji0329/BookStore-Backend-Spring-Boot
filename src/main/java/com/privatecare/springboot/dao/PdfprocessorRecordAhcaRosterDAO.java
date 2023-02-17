package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAhcaRoster;

@Transactional
@Repository
public class PdfprocessorRecordAhcaRosterDAO implements IPdfprocessorRecordAhcaRosterDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAhcaRoster add(PdfprocessorRecordAhcaRoster ahcaRoster) {
		PdfprocessorRecordAhcaRoster newAhcaRosterRecord = new PdfprocessorRecordAhcaRoster();
		newAhcaRosterRecord.setRecordId(ahcaRoster.getRecordId());
		newAhcaRosterRecord.setRecordfileId(ahcaRoster.getRecordfileId());
		entityManager.persist(newAhcaRosterRecord);
		return newAhcaRosterRecord;
	}

}
