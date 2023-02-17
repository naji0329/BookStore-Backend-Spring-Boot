package com.privatecare.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.privatecare.springboot.entity.AuthGroup;
import com.privatecare.springboot.services.IAuthGroupService;

@Controller
@CrossOrigin
@RequestMapping("group")
public class AuthGroupController {
	
	@Autowired
	private IAuthGroupService service;
	
	@GetMapping("/list")
	@ResponseBody
	public ResponseEntity<List<AuthGroup>> groupList() {
		List<AuthGroup> list = service.getAllGroupList();
		return new ResponseEntity<List<AuthGroup>>(list, HttpStatus.OK);
	}
}
