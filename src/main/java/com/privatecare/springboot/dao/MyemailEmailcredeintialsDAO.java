package com.privatecare.springboot.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.privatecare.springboot.entity.MyemailEmailcredeintials;

@Transactional
@Repository
public class MyemailEmailcredeintialsDAO implements IMyemailEmailcredeintialsDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void save(MyemailEmailcredeintials emailcredeintials) {
		if(emailcredeintials.getId() == 0 || StringUtils.isEmpty(emailcredeintials.getId())) {
			MyemailEmailcredeintials newEmailcredeintials = new MyemailEmailcredeintials();
			newEmailcredeintials.setUsername(emailcredeintials.getUsername());
			newEmailcredeintials.setPassword(emailcredeintials.getPassword());
			newEmailcredeintials.setHost(emailcredeintials.getHost());
			newEmailcredeintials.setPort(emailcredeintials.getPort());
			entityManager.persist(newEmailcredeintials);
		} else {
			MyemailEmailcredeintials updateEmailcredeintials = this.getById(emailcredeintials.getId());
			updateEmailcredeintials.setUsername(emailcredeintials.getUsername());
			updateEmailcredeintials.setPassword(emailcredeintials.getPassword());
			updateEmailcredeintials.setHost(emailcredeintials.getHost());
			updateEmailcredeintials.setPort(emailcredeintials.getPort());
			entityManager.flush();
		}		
	}

	@Override
	public MyemailEmailcredeintials get() {
		try {
			String hql = "from myemail_emailcredeintials order by id DESC";
			Query query = entityManager.createQuery(hql);
			query.setMaxResults(1);
			MyemailEmailcredeintials email = (MyemailEmailcredeintials)query.getSingleResult();
			return email;
		} catch(NoResultException ex) {
			return null;
		}
	}
	
	@Override
	public MyemailEmailcredeintials getById(int id) {
		try {
			String hql = "from myemail_emailcredeintials where id=:id";
			Query query = entityManager.createQuery(hql);
			query.setParameter("id", id);
			query.setMaxResults(1);
			MyemailEmailcredeintials email = (MyemailEmailcredeintials)query.getSingleResult();
			return email;
		} catch(NoResultException ex) {
			return null;
		}
	}
}
