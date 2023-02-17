package com.privatecare.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.MyemailRegistrymailpayload;

@Transactional
@Repository
public class MyemailRegistrymailpayloadDAO implements IMyemailRegistrymailpayloadDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	private MyemailRegistrymailpayload getLastInsertedRegistrymailpayload(){
		String hql = "from myemail_registrymailpayload order by id desc";
		Query query = entityManager.createQuery(hql);
		query.setMaxResults(1);
		MyemailRegistrymailpayload registrymailpayload = (MyemailRegistrymailpayload)query.getSingleResult();
		return registrymailpayload;
	}

	@Override
	public MyemailRegistrymailpayload createRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload) {
		MyemailRegistrymailpayload newRegistrymailpayload = new MyemailRegistrymailpayload();
		newRegistrymailpayload.setEmailType(registrymailpayload.getEmailType());
		newRegistrymailpayload.setEmailFrom(registrymailpayload.getEmailFrom());
		newRegistrymailpayload.setEmailSubject(registrymailpayload.getEmailSubject());
		newRegistrymailpayload.setEmailHeader(registrymailpayload.getEmailHeader());
		newRegistrymailpayload.setEmailText(registrymailpayload.getEmailText());
		newRegistrymailpayload.setEmailFooter(registrymailpayload.getEmailFooter());
		entityManager.persist(newRegistrymailpayload);
		MyemailRegistrymailpayload r = getLastInsertedRegistrymailpayload();
		return r;
	}
	
	@Override
	public MyemailRegistrymailpayload updateRegistrymailpayload(MyemailRegistrymailpayload registrymailpayload) {
		MyemailRegistrymailpayload updateRegistrymailpayload = getRegistrymailpayload(registrymailpayload.getId());
		updateRegistrymailpayload.setEmailType(registrymailpayload.getEmailType());
		updateRegistrymailpayload.setEmailFrom(registrymailpayload.getEmailFrom());
		updateRegistrymailpayload.setEmailSubject(registrymailpayload.getEmailSubject());
		updateRegistrymailpayload.setEmailHeader(registrymailpayload.getEmailHeader());
		updateRegistrymailpayload.setEmailText(registrymailpayload.getEmailText());
		updateRegistrymailpayload.setEmailFooter(registrymailpayload.getEmailFooter());
		entityManager.flush();
		return updateRegistrymailpayload;
	}
	
	@Override
	public MyemailRegistrymailpayload getRegistrymailpayload(int id) {
		return entityManager.find(MyemailRegistrymailpayload.class, id);
	}

	@Override
	public Page<MyemailRegistrymailpayload> findAll(Pageable pageable) {
		Query query = entityManager.createQuery("From myemail_registrymailpayload Order by id Desc");
	    int pageNumber = pageable.getPageNumber();
	    int pageSize = pageable.getPageSize();
	    query.setFirstResult((pageNumber) * pageSize);
	    query.setMaxResults(pageSize);
	    List <MyemailRegistrymailpayload> list = query.getResultList();

	    Query queryTotal = entityManager.createQuery
	            ("Select count(e.id) From myemail_registrymailpayload e");
	    long countResult = (long)queryTotal.getSingleResult();
	    int i=(int)countResult;
	    return new PageImpl<>(list, pageable, i);
	}

	@Override
	public boolean deleteMyemailRegistrymailpayload(int id) {
		MyemailRegistrymailpayload registrymailpayload = getRegistrymailpayload(id);
		entityManager.remove(registrymailpayload);
		
		boolean status = entityManager.contains(registrymailpayload);
		if(status){
			return false;
		}
		return true;
	}
}
