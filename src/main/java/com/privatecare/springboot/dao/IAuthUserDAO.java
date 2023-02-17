package com.privatecare.springboot.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.privatecare.springboot.entity.AuthUser;

public interface IAuthUserDAO {
	
	Object login(String email, Integer registrationType);
	
	AuthUser register(AuthUser authUser);

	void save(AuthUser authUser);

	AuthUser getAuthUser(int id);
	
	AuthUser getAuthUserByEmail(String email);
	
	boolean isExistingAuthUserEmail(String email);
	
	boolean isExistingAuthUsername(String username);

	Page<AuthUser> findAll(Pageable pageable);

	boolean deleteAuthUser(int id);

	List<AuthUser> findAllUsers();
	
//	void saveVerificationCode(String email, String verificationCode);
}
