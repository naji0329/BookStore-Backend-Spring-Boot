package com.privatecare.springboot.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Id;

public class ApplicationRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	private List<CaregiverUploadRequest> caregiverUploadRequestList;
	
	private String email;
	
	private String firstname;
	
	private String lastname;
	
	private String licenseType;
	
	private Integer subscribed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<CaregiverUploadRequest> getCaregiverUploadRequestList() {
		return caregiverUploadRequestList;
	}

	public void setCaregiverUploadRequestList(List<CaregiverUploadRequest> caregiverUploadRequestList) {
		this.caregiverUploadRequestList = caregiverUploadRequestList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public Integer getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(Integer subscribed) {
		this.subscribed = subscribed;
	}
}
