package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IReportmanagerReportrecordDAO;
import com.privatecare.springboot.entity.ReportmanagerReportrecord;

@Service
@Transactional
public class ReportmanagerReportrecordService implements IReportmanagerReportrecordService {
	
	@Autowired
	private IReportmanagerReportrecordDAO dao;
	

	@Override
	public ReportmanagerReportrecord create(ReportmanagerReportrecord reportrecord) {
		return dao.create(reportrecord);
	}

}
