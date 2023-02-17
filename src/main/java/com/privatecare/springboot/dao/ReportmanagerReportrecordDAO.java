package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.ReportmanagerReportrecord;

@Transactional
@Repository
public class ReportmanagerReportrecordDAO implements IReportmanagerReportrecordDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public ReportmanagerReportrecord create(ReportmanagerReportrecord reportrecord) {
		ReportmanagerReportrecord newReportrecord = new ReportmanagerReportrecord();
		newReportrecord.setDate(reportrecord.getDate());
		newReportrecord.setMorningFile(reportrecord.getMorningFile());
		newReportrecord.setEveningFile(reportrecord.getEveningFile());
		newReportrecord.setResultFile(reportrecord.getResultFile());
		newReportrecord.setArchived(reportrecord.getArchived());
		newReportrecord.setEmploymentType(reportrecord.getEmploymentType());
		newReportrecord.setReportType(reportrecord.getReportType());
		entityManager.persist(newReportrecord);
		ReportmanagerReportrecord r = getLastInsertedRecord();
		return r;
	}
	
	private ReportmanagerReportrecord getLastInsertedRecord(){
		String hql = "from reportmanager_reportrecord order by id DESC";
		Query query = entityManager.createQuery(hql);
		query.setMaxResults(1);
		ReportmanagerReportrecord reportrecord = (ReportmanagerReportrecord)query.getSingleResult();
		return reportrecord;
	}

}
