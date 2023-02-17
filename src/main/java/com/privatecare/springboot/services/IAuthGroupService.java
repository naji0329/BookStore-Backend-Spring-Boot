package com.privatecare.springboot.services;

import java.util.List;

import com.privatecare.springboot.entity.AuthGroup;
import com.privatecare.springboot.entity.AuthUserGroups;

public interface IAuthGroupService {
	
	AuthGroup getAuthGroupById(Integer id);
	
	List<AuthUserGroups> userGroupByUserId(Integer userId);

	List<AuthGroup> getAllGroupList();
}
