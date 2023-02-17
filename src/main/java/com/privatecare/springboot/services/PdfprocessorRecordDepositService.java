package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordDepositDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordDeposit;

@Service
@Transactional
public class PdfprocessorRecordDepositService implements IPdfprocessorRecordDepositService {
	
	@Autowired
	private IPdfprocessorRecordDepositDAO dao;

	@Override
	public PdfprocessorRecordDeposit add(PdfprocessorRecordDeposit deposit) {
		return dao.add(deposit);
	}

}
