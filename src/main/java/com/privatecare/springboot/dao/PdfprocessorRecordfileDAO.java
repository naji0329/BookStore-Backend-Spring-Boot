package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.PdfprocessorRecordfile;

@Transactional
@Repository
public class PdfprocessorRecordfileDAO implements IPdfprocessorRecordfileDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public PdfprocessorRecordfile add(PdfprocessorRecordfile recordfile) {
		PdfprocessorRecordfile newRecordfile = new PdfprocessorRecordfile();
		newRecordfile.setVerified(0);
		newRecordfile.setFilename(recordfile.getFilename());
		entityManager.persist(newRecordfile);
		return newRecordfile;
	}

	@Override
	public PdfprocessorRecordfile getRecordfileyId(int id) {
		String hql = "from pdfprocessor_recordfile where id=:id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		query.setMaxResults(1);
		PdfprocessorRecordfile recordfile = (PdfprocessorRecordfile)query.getSingleResult();
		return recordfile;
	}

}
