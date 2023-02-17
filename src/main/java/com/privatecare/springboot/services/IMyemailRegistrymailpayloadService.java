package com.privatecare.springboot.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.privatecare.springboot.entity.MyemailRegistrymailpayload;

public interface IMyemailRegistrymailpayloadService {

	Page<MyemailRegistrymailpayload> findAll(Pageable pageable);
	
	MyemailRegistrymailpayload getRegistrymailpayload(Integer id);

	boolean deleteRegistrymailpayload(int id);

	MyemailRegistrymailpayload createRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload);

	MyemailRegistrymailpayload updateRegistrymailpayload(int id, MyemailRegistrymailpayload registrymailpayload);

}
