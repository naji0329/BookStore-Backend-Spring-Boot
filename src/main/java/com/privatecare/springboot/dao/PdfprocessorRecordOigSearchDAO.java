package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordOigSearch;

@Transactional
@Repository
public class PdfprocessorRecordOigSearchDAO implements IPdfprocessorRecordOigSearchDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordOigSearch add(PdfprocessorRecordOigSearch oigSearch) {
		PdfprocessorRecordOigSearch newOigSearchRecord = new PdfprocessorRecordOigSearch();
		newOigSearchRecord.setRecordId(oigSearch.getRecordId());
		newOigSearchRecord.setRecordfileId(oigSearch.getRecordfileId());
		entityManager.persist(newOigSearchRecord);
		return newOigSearchRecord;
	}

}
