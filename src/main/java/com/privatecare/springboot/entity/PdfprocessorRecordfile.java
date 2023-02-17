package com.privatecare.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pdfprocessor_recordfile")
@Table(name="pdfprocessor_recordfile")
public class PdfprocessorRecordfile implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="verified")
	private int verified;
	
	@Column(name="verified_by_id")
	private Integer verifiedById;
	
	@Column(name="filename")
	private String filename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public Integer getVerifiedById() {
		return verifiedById;
	}

	public void setVerifiedById(Integer verifiedById) {
		this.verifiedById = verifiedById;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

}
