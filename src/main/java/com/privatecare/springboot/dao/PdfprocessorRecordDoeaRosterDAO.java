package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordDoeaRoster;

@Transactional
@Repository
public class PdfprocessorRecordDoeaRosterDAO implements IPdfprocessorRecordDoeaRosterDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordDoeaRoster add(PdfprocessorRecordDoeaRoster doeaRoster) {
		PdfprocessorRecordDoeaRoster newDoeaRosterRecord = new PdfprocessorRecordDoeaRoster();
		newDoeaRosterRecord.setRecordId(doeaRoster.getRecordId());
		newDoeaRosterRecord.setRecordfileId(doeaRoster.getRecordfileId());
		entityManager.persist(newDoeaRosterRecord);
		return newDoeaRosterRecord;
	}

}
