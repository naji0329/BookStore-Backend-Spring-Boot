package com.privatecare.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.privatecare.springboot.entity.ReportmanagerReportrecord;
import com.privatecare.springboot.services.IReportmanagerReportrecordService;

@Controller
@CrossOrigin
@RequestMapping("reports")
public class ReportmanagerReportrecordController {
	
	@Autowired
	private IReportmanagerReportrecordService service;
	
	@PostMapping("/add")
	public ResponseEntity<ReportmanagerReportrecord> createUser(@RequestBody ReportmanagerReportrecord reportrecord){
		ReportmanagerReportrecord r = service.create(reportrecord);
		return new ResponseEntity<ReportmanagerReportrecord>(r, HttpStatus.OK);	
	}
	
}
