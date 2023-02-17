package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecord;

@Transactional
@Repository
public class PdfprocessorRecordDAO implements IPdfprocessorRecordDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecord add(PdfprocessorRecord record) {
		PdfprocessorRecord newRecord = new PdfprocessorRecord();
		newRecord.setEmail(record.getEmail());
		newRecord.setName(record.getName());
		newRecord.setSurname(record.getSurname());
		newRecord.setCreated(record.getCreated());
		newRecord.setLicenseType(record.getLicenseType());
		newRecord.setSubscribed(record.getSubscribed());
		newRecord.setEmployeeic("All");
		newRecord.setApplicationUpdated(0);
		newRecord.setContractorAgreeUpdated(0);
		newRecord.setNursingLicenseUpdated(0);
		newRecord.setNursingValidationUpdated(0);
		newRecord.setHhaCertUpdated(0);
		newRecord.setHhaDoeaUpdated(0);
		newRecord.setHhaSchoolUpdated(0);
		newRecord.setOigSearchUpdated(0);
		newRecord.setDrivingLicenseUpdated(0);
		newRecord.setDrivingVerificationUpdated(0);
		newRecord.setSocialSecurityUpdated(0);
		newRecord.setCprCertUpdated(0);
		newRecord.setStatementUpdated(0);
		newRecord.setDrVerificationUpdated(0);
		newRecord.setAssistUpdated(0);
		newRecord.setHivVerificationUpdated(0);
		newRecord.setAhcaAttestationUpdated(0);
		newRecord.setAhcaLevelUpdated(0);
		newRecord.setPrivacyUpdated(0);
		newRecord.setReferencesUpdated(0);
		newRecord.setReferences2Updated(0);
		newRecord.setVaccinationUpdated(0);
		newRecord.setAutoInsuranceUpdated(0);
		newRecord.setProfLiabilityUpdated(0);
		newRecord.setDoeaLevelUpdated(0);
		newRecord.setDoeaUpdated(0);
		newRecord.setAlzheimerUpdated(0);
		newRecord.setDomesticUpdated(0);
		newRecord.setHipaaUpdated(0);
		newRecord.setCeuUpdated(0);
		newRecord.setDepositUpdated(0);
		newRecord.setW9Updated(0);
		newRecord.setEinUpdated(0);
		newRecord.setEverifyUpdated(0);
		newRecord.setAhcaRosterUpdated(0);
		newRecord.setDoeaRosterUpdated(0);
		newRecord.setConfirmationUpdated(0);
		newRecord.setFinalized(0);
		newRecord.setArchived(1);
		newRecord.setHasNewRejections(0);
		newRecord.setSexUpdated(0);
		newRecord.setSs4Updated(0);
		newRecord.setAdrdUpdated(0);
		newRecord.setEmploymentAgreeUpdated(0);
		newRecord.setPpdUpdated(0);
		newRecord.setW4Updated(0);
		newRecord.setHhaSkillsUpdated(0);
		entityManager.persist(newRecord);
		return newRecord;
	}

	@Override
	public PdfprocessorRecord getApplicationById(int id) {
		String hql = "from pdfprocessor_record where id=:id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		query.setMaxResults(1);
		PdfprocessorRecord record = (PdfprocessorRecord)query.getSingleResult();
		return record;
	}

}
