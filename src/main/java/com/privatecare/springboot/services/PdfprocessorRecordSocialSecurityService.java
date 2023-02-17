package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IPdfprocessorRecordSocialSecurityDAO;
import com.privatecare.springboot.entity.PdfprocessorRecordSocialSecurity;

@Service
@Transactional
public class PdfprocessorRecordSocialSecurityService implements IPdfprocessorRecordSocialSecurityService {
	
	@Autowired
	private IPdfprocessorRecordSocialSecurityDAO dao;

	@Override
	public PdfprocessorRecordSocialSecurity add(PdfprocessorRecordSocialSecurity socialSecurity) {
		return dao.add(socialSecurity);
	}

}
