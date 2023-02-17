package com.privatecare.springboot.dao;

import java.util.List;

import com.privatecare.springboot.entity.AuthUserGroups;

public interface IAuthUserGroupsDAO {
	
	List<AuthUserGroups> findByUserId(int userId);
	
	AuthUserGroups getAuthUserGroups(int id);
	
	void save(AuthUserGroups groups);

	void deleteAuthUserGroups(int userId);
}
