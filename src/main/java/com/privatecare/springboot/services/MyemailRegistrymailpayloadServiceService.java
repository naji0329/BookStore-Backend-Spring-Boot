package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IMyemailRegistrymailpayloadDAO;
import com.privatecare.springboot.entity.MyemailRegistrymailpayload;

@Service
@Transactional
public class MyemailRegistrymailpayloadServiceService implements IMyemailRegistrymailpayloadService {
	
	@Autowired
	private IMyemailRegistrymailpayloadDAO dao;

	@Override
	public Page<MyemailRegistrymailpayload> findAll(Pageable pageable) {
		return dao.findAll(pageable);
	}

	@Override
	public MyemailRegistrymailpayload getRegistrymailpayload(Integer id) {
		return dao.getRegistrymailpayload(id);
	}

	@Override
	public boolean deleteRegistrymailpayload(int id) {
		return dao.deleteMyemailRegistrymailpayload(id);
	}

	@Override
	public MyemailRegistrymailpayload createRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload) {
		return dao.createRegistrymailpayload(registrymailpayload);
	}

	@Override
	public MyemailRegistrymailpayload updateRegistrymailpayload(int id,
			MyemailRegistrymailpayload registrymailpayload) {
		
		MyemailRegistrymailpayload mailpayload = dao.updateRegistrymailpayload(registrymailpayload);
		return mailpayload;
	}

}
