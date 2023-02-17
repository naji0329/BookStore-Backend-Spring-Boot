package com.privatecare.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.AuthUserGroups;

@Transactional
@Repository
public class AuthUserGroupsDAO implements IAuthUserGroupsDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(AuthUserGroups userGroups) {
		AuthUserGroups g = new AuthUserGroups();
    	g.setUserId(userGroups.getUserId());
    	g.setGroupId(userGroups.getGroupId());
		entityManager.persist(g);
	}
	
	@Override
	public AuthUserGroups getAuthUserGroups(int id) {
		return entityManager.find(AuthUserGroups.class, id);
	}

	@Override
	public List<AuthUserGroups> findByUserId(int userId) {
		Query query = entityManager.createQuery("From auth_user_groups where user_id = :userId");
		query.setParameter("userId", userId);
	    List<AuthUserGroups> groupList = query.getResultList();
	    return groupList;
	}

	@Override
	public void deleteAuthUserGroups(int userId) {
		List<AuthUserGroups> list = findByUserId(userId);
		for(int i=0; i<list.size(); i++) {
			AuthUserGroups group = list.get(i);
			entityManager.remove(group);
		}
	}
}
