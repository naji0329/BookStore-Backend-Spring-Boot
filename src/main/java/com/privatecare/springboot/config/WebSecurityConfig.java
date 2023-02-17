package com.privatecare.springboot.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.privatecare.springboot.dao.IMyemailEmailcredeintialsDAO;
import com.privatecare.springboot.entity.MyemailEmailcredeintials;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Autowired
	private IMyemailEmailcredeintialsDAO dao;
	
	@Bean
    public JavaMailSenderImpl mailSender() {
        MyemailEmailcredeintials emailcredeintial = dao.get();        
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost(emailcredeintial.getHost());
        mailSender.setPort(emailcredeintial.getPort());
        mailSender.setUsername(emailcredeintial.getUsername());
        mailSender.setPassword(emailcredeintial.getPassword());
        
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.ssl.enable", "true");

        return mailSender;
    }
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
    }

}
