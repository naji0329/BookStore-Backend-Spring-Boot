package com.privatecare.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.AuthGroup;
import com.privatecare.springboot.entity.AuthUserGroups;

@Transactional
@Repository
public class AuthGroupDAO implements IAuthGroupDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public AuthGroup getAuthGroup(int id) {
		return entityManager.find(AuthGroup.class, id);
	}

	@Override
	public List<AuthUserGroups> userGroupByUserId(int userId) {
		Query query = entityManager.createQuery("FROM auth_user_groups ug LEFT JOIN auth_group g ON g.id = ug.groupId WHERE ug.userId = :userId");
		query.setParameter("userId", userId);
	    List<AuthUserGroups> groupList = query.getResultList();
	    return groupList;
	}

	@Override
	public List<AuthGroup> getAllGroupList() {
		Query query = entityManager.createQuery("From auth_group Order By id desc");
		List<AuthGroup> list = query.getResultList();
		return list;
	}

}
