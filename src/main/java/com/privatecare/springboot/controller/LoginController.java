package com.privatecare.springboot.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.privatecare.springboot.entity.AuthUser;
import com.privatecare.springboot.services.IAuthUserService;

@Controller
@CrossOrigin
@RequestMapping("auth")
public class LoginController {
	
	@Autowired
	private IAuthUserService service;
		
	@GetMapping("/login")
	@ResponseBody
	public ResponseEntity<Object> login(@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("registrationType") Integer registrationType){
		
		Object loginUser = service.login(email, password, registrationType);

		if(loginUser != null) {
			return new ResponseEntity<Object>(loginUser, HttpStatus.OK);
		} else {
			return new ResponseEntity<Object>(loginUser, HttpStatus.NOT_MODIFIED);
		}
	}

	@PostMapping("/signup")
	@ResponseBody
	public ResponseEntity<Integer> signup(@RequestBody AuthUser authUser, HttpServletRequest request) throws MessagingException, IOException {
		return new ResponseEntity<Integer>(service.register(authUser, getSiteURL(request)), HttpStatus.OK);
	}
	
	private String getSiteURL(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(), "");
	}
	
	@GetMapping("/verifyEmail")
	@ResponseBody
	public ResponseEntity<Integer> verifyEmail(@RequestParam("email") String email, @RequestParam("verificationCode") String verificationCode){
		boolean bool = service.verifyEmail(email, verificationCode);
		if(bool) {
			System.out.println("verification success!");
			return new ResponseEntity<Integer>(1, HttpStatus.OK);
		}
		return new ResponseEntity<Integer>(0, HttpStatus.OK);
	}
	
	@GetMapping("/sendVerificationCode")
	@ResponseBody
	public ResponseEntity<String> sendVerificationCode(@RequestParam("email") String email, HttpServletRequest request) 
			throws MessagingException, UnsupportedEncodingException{
		System.out.println(getSiteURL(request));
		service.sendVerificationCode(email, getSiteURL(request));
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
}
