package com.privatecare.springboot.dao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.privatecare.springboot.entity.AuthUser;

@Transactional
@Repository
public class AuthUserDAO implements IAuthUserDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	    return new JdbcTemplate(dataSource);
	}
	
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public Object login(String email, Integer reigstrationType) {
		String hql = "FROM auth_user WHERE email=:email and registration_type = :registrationType";
		Query query = entityManager.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("registrationType", reigstrationType);
		query.setMaxResults(1);
		AuthUser authUser = (AuthUser)query.getSingleResult();
		return authUser;
	}

	@Override
	public AuthUser register(AuthUser authUser) {
		LocalDateTime now = LocalDateTime.now();
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	String formatDateTime = now.format(format);
    	
		AuthUser registerUser = new AuthUser();
		registerUser.setEmail(authUser.getEmail());
		registerUser.setIsSuperuser(authUser.getRegistrationType());
		registerUser.setUsername(authUser.getFirstName() + " " + authUser.getLastName());
		registerUser.setFirstName(authUser.getFirstName());
		registerUser.setLastName(authUser.getLastName());
		registerUser.setPassword(authUser.getPassword());
		registerUser.setIsActive(0);
		registerUser.setIsStaff(authUser.getRegistrationType());
		registerUser.setDateJoined(formatDateTime);
		registerUser.setLastLogin(formatDateTime);
		registerUser.setRegistrationType(authUser.getRegistrationType());
		entityManager.persist(registerUser);
		AuthUser au = getLastInsertedAuthUser();
		return au;
	}
	
	private AuthUser getLastInsertedAuthUser(){
		String hql = "from auth_user order by id DESC";
		Query query = entityManager.createQuery(hql);
		query.setMaxResults(1);
		AuthUser authUser = (AuthUser)query.getSingleResult();
		return authUser;
	}

	@Override
	public void save(AuthUser authUser) {
		AuthUser loginUser = getAuthUser(authUser.getId());
    	LocalDateTime now = LocalDateTime.now();
    	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	String formatDateTime = now.format(format);
    	loginUser.setLastLogin(formatDateTime);
		entityManager.flush();
	}
	
	public AuthUser getAuthUser(int id) {
		String hql = "from auth_user where id=:id";
		Query query = entityManager.createQuery(hql);
		query.setParameter("id", id);
		query.setMaxResults(1);
		AuthUser authUser = (AuthUser)query.getSingleResult();
		return authUser;
	}
	
	public AuthUser getAuthUserByEmail(String email) {
		String hql = "from auth_user where email=:email";
		Query query = entityManager.createQuery(hql);
		query.setParameter("email", email);
		query.setMaxResults(1);
		AuthUser authUser = (AuthUser)query.getSingleResult();
		return authUser;
	}
	
	public boolean isExistingAuthUserEmail(String email) {
		Query query = entityManager.createQuery("Select count(id) From auth_user Where LOWER(email) like LOWER('"+email+"')");
		long count = (long)query.getSingleResult();
//		System.out.println("count: " + count);
		if(count > 0)return true;
		else return false;
	}
	
	public boolean isExistingAuthUsername(String username) {
		Query query = entityManager.createQuery("Select count(id) From auth_user Where LOWER(username) like LOWER('"+username+"')");
		long count = (long)query.getSingleResult();
//		System.out.println("count: " + count);
		if(count > 0)return true;
		else return false;
	}

	@Override
	public Page<AuthUser> findAll(Pageable pageable) {
		Query query = entityManager.createQuery("From auth_user Order by id desc");
	    int pageNumber = pageable.getPageNumber();
	    int pageSize = pageable.getPageSize();
	    query.setFirstResult((pageNumber) * pageSize);
	    query.setMaxResults(pageSize);
	    List <AuthUser> userList = query.getResultList();

	    Query queryTotal = entityManager.createQuery
	            ("Select count(u.id) From auth_user u");
	    long countResult = (long)queryTotal.getSingleResult();
	    int i=(int)countResult;
	    return new PageImpl<>(userList, pageable, i);
	}

	@Override
	public boolean deleteAuthUser(int id) {
		AuthUser authUser = getAuthUser(id);
		entityManager.remove(authUser);
		
		boolean status = entityManager.contains(authUser);
		if(status){
			return false;
		}
		return true;
	}

	@Override
	public List<AuthUser> findAllUsers() {
		Query query = entityManager.createQuery("From auth_user Where is_active = 1 Order by id desc");
	    List <AuthUser> userList = query.getResultList();
		return userList;
	}
	
//	public void saveVerificationCode(String email, String verificationCode) {
//		Query query = entityManager.createQuery("UPDATE auth_user SET verification_code='"+verificationCode+"' WHERE LOWER(email)=LOWER('"+email+"')");
//		query.executeUpdate();
//	}
}
