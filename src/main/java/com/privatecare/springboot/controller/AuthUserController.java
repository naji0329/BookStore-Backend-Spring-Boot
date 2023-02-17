package com.privatecare.springboot.controller;

import java.util.List;

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

import com.privatecare.springboot.entity.AuthUser;
import com.privatecare.springboot.services.IAuthUserService;

@Controller
@CrossOrigin
@RequestMapping("user")
public class AuthUserController {
	
	@Autowired
	private IAuthUserService service;
	
	@GetMapping("/list")
	@ResponseBody
	public Page<AuthUser> userList(@RequestParam("page") Integer page, 
			@RequestParam("size") Integer size) {
		Sort sort = Sort.by(Sort.Order.desc("id"));
		Pageable pageable = PageRequest.of(page, size, sort);
		return service.findAll(pageable);
	}
	
	@GetMapping("/allList")
	@ResponseBody
	public List<AuthUser> allList() {
		return service.findAllUsers();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAuthUser(@PathVariable("id") int id){
		boolean isDeleted = service.deleteAuthUser(id);
		if(isDeleted){
			String responseContent = "User has been deleted successfully";
			return new ResponseEntity<String>(responseContent,HttpStatus.OK);
		}
		String error = "Error while deleting User from database";
		return new ResponseEntity<String>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@PostMapping("/add")
	public ResponseEntity<AuthUser> createUser(@RequestBody AuthUser user){
		AuthUser u = service.createUser(user);
		return new ResponseEntity<AuthUser>(u, HttpStatus.OK);
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<AuthUser> updateUser(@PathVariable("id") int id, @RequestBody AuthUser user){
		AuthUser u = service.updateUser(id, user);
		return new ResponseEntity<AuthUser>(u, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AuthUser> getUserById(@PathVariable("id") int id){
		AuthUser u = service.getAuthUserById(id);
		return new ResponseEntity<AuthUser>(u, HttpStatus.OK);
	}
}
