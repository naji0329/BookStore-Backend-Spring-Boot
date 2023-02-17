package com.privatecare.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pdfprocessor_record_ein")
@Table(name="pdfprocessor_record_ein")
public class PdfprocessorRecordEin implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="record_id")
	private int recordId;
	
	@Column(name="recordfile_id")
	private int recordfileId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public int getRecordfileId() {
		return recordfileId;
	}

	public void setRecordfileId(int recordfileId) {
		this.recordfileId = recordfileId;
	}
	
}
