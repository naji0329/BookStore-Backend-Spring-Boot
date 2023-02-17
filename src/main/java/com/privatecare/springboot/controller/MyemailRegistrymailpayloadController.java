package com.privatecare.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.privatecare.springboot.entity.MyemailRegistrymailpayload;
import com.privatecare.springboot.services.IMyemailRegistrymailpayloadService;

@Controller
@CrossOrigin
@RequestMapping("emailTemp")
public class MyemailRegistrymailpayloadController {
	
	@Autowired
	private IMyemailRegistrymailpayloadService service;
	
	@GetMapping("/list")
	@ResponseBody
	public Page<MyemailRegistrymailpayload> list(@RequestParam("page") Integer page, 
			@RequestParam("size") Integer size) {
		Sort sort = Sort.by(Sort.Order.desc("id"));
		Pageable pageable = PageRequest.of(page, size, sort);
		return service.findAll(pageable);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRegistrymailpayload(@PathVariable("id") int id){
		boolean isDeleted = service.deleteRegistrymailpayload(id);
		if(isDeleted){
			String responseContent = "Email Template has been deleted successfully";
			return new ResponseEntity<String>(responseContent,HttpStatus.OK);
		}
		String error = "Error while deleting Email Template from database";
		return new ResponseEntity<String>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/add")
	public ResponseEntity<MyemailRegistrymailpayload> createRegistrymailpayload(@RequestBody MyemailRegistrymailpayload registrymailpayload){
		MyemailRegistrymailpayload r = service.createRegistrymailpayload(registrymailpayload);
		return new ResponseEntity<MyemailRegistrymailpayload>(r, HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<MyemailRegistrymailpayload> updateRegistrymailpayload(@PathVariable("id") int id, 
			@RequestBody MyemailRegistrymailpayload registrymailpayload){
		MyemailRegistrymailpayload r = service.updateRegistrymailpayload(id, registrymailpayload);
		return new ResponseEntity<MyemailRegistrymailpayload>(r, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MyemailRegistrymailpayload> getMailpayload(@PathVariable("id") int id) {
		MyemailRegistrymailpayload mailpayload = service.getRegistrymailpayload(id);
		return new ResponseEntity<MyemailRegistrymailpayload>(mailpayload, HttpStatus.OK);
	}
}
