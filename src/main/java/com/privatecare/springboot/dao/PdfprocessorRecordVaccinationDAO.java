package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordVaccination;

@Transactional
@Repository
public class PdfprocessorRecordVaccinationDAO implements IPdfprocessorRecordVaccinationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordVaccination add(PdfprocessorRecordVaccination vaccination) {
		PdfprocessorRecordVaccination newVaccinationRecord = new PdfprocessorRecordVaccination();
		newVaccinationRecord.setRecordId(vaccination.getRecordId());
		newVaccinationRecord.setRecordfileId(vaccination.getRecordfileId());
		entityManager.persist(newVaccinationRecord);
		return newVaccinationRecord;
	}

}
