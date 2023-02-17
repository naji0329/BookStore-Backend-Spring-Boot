package com.privatecare.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name="pdfprocessor_record_application")
@Table(name="pdfprocessor_record_application")
public class PdfprocessorRecordApplication implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="record_id")
	private int recordId;
	
	@Column(name="recordfile_id")
	private int recordfileId;
	
	@Transient
	private PdfprocessorRecord record;
	
	@Transient
	private PdfprocessorRecordfile recordfile;

	public PdfprocessorRecord getRecord() {
		return record;
	}

	public void setRecord(PdfprocessorRecord record) {
		this.record = record;
	}

	public PdfprocessorRecordfile getRecordfile() {
		return recordfile;
	}

	public void setRecordfile(PdfprocessorRecordfile recordfile) {
		this.recordfile = recordfile;
	}

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
