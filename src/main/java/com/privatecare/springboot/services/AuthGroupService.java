package com.privatecare.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.dao.IAuthGroupDAO;
import com.privatecare.springboot.entity.AuthGroup;
import com.privatecare.springboot.entity.AuthUserGroups;

@Service
@Transactional
public class AuthGroupService implements IAuthGroupService {
	
	@Autowired
	private IAuthGroupDAO dao;
	
	@Override
	public AuthGroup getAuthGroupById(Integer id) {
		return dao.getAuthGroup(id);
	}

	@Override
	public List<AuthUserGroups> userGroupByUserId(Integer userId) {
		return dao.userGroupByUserId(userId);
	}

	@Override
	public List<AuthGroup> getAllGroupList() {
		return dao.getAllGroupList();
	}

}
