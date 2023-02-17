package com.privatecare.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="reportmanager_reportrecord")
@Table(name="reportmanager_reportrecord")
public class ReportmanagerReportrecord implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="date")
	private String date;
	
	@Column(name="morning_file")
	private String morningFile;
	
	@Column(name="evening_file")
	private String eveningFile;
	
	@Column(name="result_file")
	private String resultFile;
	
	@Column(name="archived")
	private Integer archived;
	
	@Column(name="employment_type")
	private String employmentType;
	
	@Column(name="report_type")
	private String reportType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMorningFile() {
		return morningFile;
	}

	public void setMorningFile(String morningFile) {
		this.morningFile = morningFile;
	}

	public String getEveningFile() {
		return eveningFile;
	}

	public void setEveningFile(String string) {
		this.eveningFile = string;
	}

	public String getResultFile() {
		return resultFile;
	}

	public void setResultFile(String resultFile) {
		this.resultFile = resultFile;
	}

	public Integer getArchived() {
		return archived;
	}

	public void setArchived(Integer archived) {
		this.archived = archived;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	
}
