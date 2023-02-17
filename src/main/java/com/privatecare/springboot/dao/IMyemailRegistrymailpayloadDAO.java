package com.privatecare.springboot.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.privatecare.springboot.entity.MyemailRegistrymailpayload;

public interface IMyemailRegistrymailpayloadDAO {

	MyemailRegistrymailpayload createRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload);
	
	MyemailRegistrymailpayload updateRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload);

	MyemailRegistrymailpayload getRegistrymailpayload(int id);

	Page<MyemailRegistrymailpayload> findAll(Pageable pageable);

	boolean deleteMyemailRegistrymailpayload(int id);
}
