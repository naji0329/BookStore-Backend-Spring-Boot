package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordNursingLicense;

@Transactional
@Repository
public class PdfprocessorRecordNursingLicenseDAO implements IPdfprocessorRecordNursingLicenseDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordNursingLicense add(PdfprocessorRecordNursingLicense nursingLicense) {
		PdfprocessorRecordNursingLicense newNursingLicenseRecord = new PdfprocessorRecordNursingLicense();
		newNursingLicenseRecord.setRecordId(nursingLicense.getRecordId());
		newNursingLicenseRecord.setRecordfileId(nursingLicense.getRecordfileId());
		entityManager.persist(newNursingLicenseRecord);
		return newNursingLicenseRecord;
	}

}
