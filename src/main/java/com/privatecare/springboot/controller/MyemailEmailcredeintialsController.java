package com.privatecare.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.privatecare.springboot.entity.MyemailEmailcredeintials;
import com.privatecare.springboot.services.IMyemailEmailcredeintialsService;

@Controller
@CrossOrigin
@RequestMapping("emailConfig")
public class MyemailEmailcredeintialsController {
	
	@Autowired
	private IMyemailEmailcredeintialsService service;
	
	@PutMapping("/update")
	public ResponseEntity<String> updateUser(@RequestBody MyemailEmailcredeintials emailcredeintials){
		service.save(emailcredeintials);
		String responseContent = "Email Configuration updated successfully.";
		return new ResponseEntity<String>(responseContent,HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public ResponseEntity<MyemailEmailcredeintials> get() {
		MyemailEmailcredeintials email = service.get();
		return new ResponseEntity<MyemailEmailcredeintials>(email, HttpStatus.OK);
	}
}
