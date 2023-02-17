package com.privatecare.springboot.dao;

import java.util.List;

import com.privatecare.springboot.entity.AuthGroup;
import com.privatecare.springboot.entity.AuthUserGroups;

public interface IAuthGroupDAO {
	
	List<AuthUserGroups> userGroupByUserId(int userId);
	
	AuthGroup getAuthGroup(int id);

	List<AuthGroup> getAllGroupList();
	
}
