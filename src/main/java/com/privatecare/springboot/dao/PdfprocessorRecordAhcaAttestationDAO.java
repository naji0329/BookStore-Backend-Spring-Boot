package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordAhcaAttestation;

@Transactional
@Repository
public class PdfprocessorRecordAhcaAttestationDAO implements IPdfprocessorRecordAhcaAttestationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordAhcaAttestation add(PdfprocessorRecordAhcaAttestation ahcaAttestation) {
		PdfprocessorRecordAhcaAttestation newAhcaAttestationRecord = new PdfprocessorRecordAhcaAttestation();
		newAhcaAttestationRecord.setRecordId(ahcaAttestation.getRecordId());
		newAhcaAttestationRecord.setRecordfileId(ahcaAttestation.getRecordfileId());
		entityManager.persist(newAhcaAttestationRecord);
		return newAhcaAttestationRecord;
	}

}
