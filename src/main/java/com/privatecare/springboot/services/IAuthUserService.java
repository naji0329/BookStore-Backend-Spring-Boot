package com.privatecare.springboot.services;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.privatecare.springboot.entity.AuthUser;

public interface IAuthUserService {
	
	Object login(String email, String password, Integer registrationType);
	
	Integer register(AuthUser authUser, String siteURL) throws UnsupportedEncodingException, MessagingException, IOException;
	
	void sendVerificationCode(String email, String siteURL) throws MessagingException, UnsupportedEncodingException;
	
	boolean verifyEmail(String email, String verificationCode);

	Page<AuthUser> findAll(Pageable pageable);
	
	AuthUser getAuthUser(Integer id);
	
	AuthUser getAuthUserById(Integer id);

	boolean deleteAuthUser(int id);

	AuthUser createUser(AuthUser user);

	AuthUser updateUser(int id, AuthUser user);

	List<AuthUser> findAllUsers();

}
