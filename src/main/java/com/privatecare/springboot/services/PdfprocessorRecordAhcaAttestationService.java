package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordAhcaAttestationDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordAhcaAttestation;

@Service
@Transactional
public class PdfprocessorRecordAhcaAttestationService implements IPdfprocessorRecordAhcaAttestationService {
	
	@Autowired
	private IPdfprocessorRecordAhcaAttestationDAO dao;

	@Override
	public PdfprocessorRecordAhcaAttestation add(PdfprocessorRecordAhcaAttestation ahcaAttestation) {
		return dao.add(ahcaAttestation);
	}

}
