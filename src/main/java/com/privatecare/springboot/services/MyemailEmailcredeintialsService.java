package com.privatecare.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IMyemailEmailcredeintialsDAO;
import com.privatecare.springboot.entity.MyemailEmailcredeintials;

@Service
@Transactional
public class MyemailEmailcredeintialsService implements IMyemailEmailcredeintialsService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private IMyemailEmailcredeintialsDAO dao;

	@Override
	public void save(MyemailEmailcredeintials emailcredeintials) {
		String encodedPassword = passwordEncoder.encode(emailcredeintials.getPassword());
		emailcredeintials.setPassword(encodedPassword);
		dao.save(emailcredeintials);
	}

	@Override
	public MyemailEmailcredeintials get() {
		return dao.get();
	}
}
