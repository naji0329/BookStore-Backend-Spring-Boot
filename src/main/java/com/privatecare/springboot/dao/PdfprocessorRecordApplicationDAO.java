package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordApplication;

@Transactional
@Repository
public class PdfprocessorRecordApplicationDAO implements IPdfprocessorRecordApplicationDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordApplication add(PdfprocessorRecordApplication application) {
		PdfprocessorRecordApplication newApplicationRecord = new PdfprocessorRecordApplication();
		newApplicationRecord.setRecordId(application.getRecordId());
		newApplicationRecord.setRecordfileId(application.getRecordfileId());
		entityManager.persist(newApplicationRecord);
		return newApplicationRecord;
	}

	@Override
	public PdfprocessorRecordApplication update(Integer id, PdfprocessorRecordApplication application) {
		PdfprocessorRecordApplication newApplication = getApplicationRecordById(id);
		if(newApplication != null) {
			newApplication.setRecordId(application.getRecordId());
			newApplication.setRecordfileId(application.getRecordfileId());
			entityManager.flush();
		}
		return newApplication;
	}

	@Override
	public PdfprocessorRecordApplication getApplicationRecordById(int id) {
//		String hql = "from pdfprocessor_record_application a left join pdfprocessor_record r on a.recordId = r.id"
//				+ " left join pdfprocessor_recordfile rf on rf.id = a.recordfileId where r.id=:id";
		String hql = "from pdfprocessor_record_application where id=:id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		query.setMaxResults(1);
		PdfprocessorRecordApplication application = (PdfprocessorRecordApplication)query.getSingleResult();
		return application;
	}

}
