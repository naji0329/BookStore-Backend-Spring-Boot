package com.privatecare.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="auth_user")
@Table(name="auth_user")
public class AuthUser implements Serializable {
	
	@Column(name = "verification_code", length = 64)
	private String verificationCode;
	
	private boolean enabled;
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="password")
	@NotNull(message = "Password is required.")
	@Size(min = 6, message = "Password should be atleast 6 characters.")
	private String password;
	
	@Column(name="last_login")
	private String lastLogin;
	
	@Column(name="is_superuser")
	private Integer isSuperuser;
	
	@Column(name="username")
	private String username;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	@NotNull(message = "Email is required.")
	@Email(message = "Email is not well formatted.")
	private String email;
	
	@Column(name="is_staff")
	private Integer isStaff;
	
	@Column(name="is_active")
	private Integer isActive;
	
	@Column(name="date_joined")
	private String dateJoined;
	
	@Column(name="first_name")
	private String firstName;
	
	@Transient
	private Integer groupId;
	
	@Column(name="registration_type")
	private Integer registrationType;
	
	@Transient
	private List<Integer> userGroupIds;
	
	public void setVerificationCode(String code) {
		this.verificationCode = code;
	};
	
	public String getVerificationCode() {
		return this.verificationCode;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean getEnabled() {
		return this.enabled;
	}

	public Integer getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(Integer registrationType) {
		this.registrationType = registrationType;
	}

	public List<Integer> getUserGroupIds() {
		return userGroupIds;
	}

	public void setUserGroupIds(List<Integer> userGroupIds) {
		this.userGroupIds = userGroupIds;
	}

	@Transient
	private List<AuthUserGroups> userGroups;

	public List<AuthUserGroups> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(List<AuthUserGroups> userGroups) {
		this.userGroups = userGroups;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void userGroupByUserId(Integer groupId) {
		this.groupId = groupId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getIsSuperuser() {
		return isSuperuser;
	}

	public void setIsSuperuser(Integer isSuperuser) {
		this.isSuperuser = isSuperuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(Integer isStaff) {
		this.isStaff = isStaff;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
