package com.privatecare.springboot.services;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.privatecare.springboot.dao.IAuthGroupDAO;
import com.privatecare.springboot.dao.IAuthUserDAO;
import com.privatecare.springboot.dao.IAuthUserGroupsDAO;
import com.privatecare.springboot.dao.IMyemailEmailcredeintialsDAO;
import com.privatecare.springboot.entity.AuthUser;
import com.privatecare.springboot.entity.AuthUserGroups;
import com.privatecare.springboot.entity.MyemailEmailcredeintials;

import net.bytebuddy.utility.RandomString;

@Service
@Transactional
public class AuthUserService implements IAuthUserService {
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private IAuthUserDAO dao;
	
	@Autowired
	private IAuthUserGroupsDAO userGroupsDao;
	
	@Autowired
	private IAuthGroupDAO groupDao;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private IMyemailEmailcredeintialsDAO emailcredeintialsDao;

	@Override
	public Object login(String email, String password, Integer registrationType) {
	    PasswordEncoder passencoder = new BCryptPasswordEncoder();
	    Object user = dao.login(email, registrationType);
	    if(user == null) {
	    	return null;
	    } else {
	    	String encodedPassword = ((AuthUser) user).getPassword();
		    if(passencoder.matches(password, encodedPassword)) {
		    	LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
				String formatDateTime = now.format(format);
				AuthUser loginUser = dao.getAuthUser(((AuthUser) user).getId());
				loginUser.setLastLogin(formatDateTime);
				dao.save(loginUser);
		    	return user;
		    } else {
		    	return null;
		    }
	    }
	}

	@Override
	public Integer register(AuthUser authUser, String siteURL) throws AddressException, MessagingException, IOException{
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		String formatDateTime = now.format(format);
		
		if(authUser.getRegistrationType() == 1) {
			authUser.setIsSuperuser(1);
			authUser.setIsStaff(1);
			authUser.setIsActive(1);
		} else {
			authUser.setIsSuperuser(0);
			authUser.setIsStaff(0);
			authUser.setIsActive(0);
		}

		String encodedPassword = passwordEncoder.encode(authUser.getPassword());
		authUser.setPassword(encodedPassword);
		
		authUser.setUsername(authUser.getFirstName() + " " + authUser.getLastName());
		authUser.setDateJoined(formatDateTime);
		authUser.setLastLogin(formatDateTime);
//		sendmail();
		if(dao.isExistingAuthUserEmail(authUser.getEmail())) {
			System.out.println("This email already exist!");
			return 1;
		}
		
		if(dao.isExistingAuthUsername(authUser.getUsername())) {
			System.out.println("This username already exist!");
			return 2;
		}
//		String randomCode = RandomString.make(64);
//	    authUser.setVerificationCode(randomCode);
	    authUser.setEnabled(false);
	    
		dao.register(authUser);
		
//		sendVerificationEmail(authUser, siteURL);
		return 0;
	}
	
	public void sendVerificationCode(String email, String siteURL)
	        throws MessagingException, UnsupportedEncodingException {
		AuthUser user = dao.getAuthUserByEmail(email);
	    String toAddress = user.getEmail();
	    String fromAddress = "lauralhuillier90@gmail.com";
	    String senderName = "Preferred Private Care";
	    String subject = "Please verify your registration";
	    String content = "Dear [[name]],<br>"
	            + "Please click the link below to verify your registration:<br>"
	            + "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>"
	            + "Thank you,<br>"
	            + "Your company name.";
	     
	    MimeMessage message = mailSender.createMimeMessage();
	    MimeMessageHelper helper = new MimeMessageHelper(message);
	     
	    helper.setFrom(fromAddress, senderName);
	    helper.setTo(toAddress);
	    helper.setSubject(subject);
	     
	    content = content.replace("[[name]]", user.getFirstName() + " " + user.getLastName());
	    String verifyURL = siteURL + "/verify?code=" + user.getVerificationCode();
	     
	    content = content.replace("[[URL]]", verifyURL);
	     
	    System.out.println(content);
	    
	    helper.setText(content, true);	     
	    mailSender.send(message);
	    String randomCode = RandomString.make(64);
	    System.out.println(siteURL + "/caregiver-step-1/" + randomCode);
	    user.setVerificationCode(randomCode);
	     
	}
	
	public boolean verifyEmail(String email, String verificationCode) {
		AuthUser user = dao.getAuthUserByEmail(email);
		if(user.getVerificationCode().equals(verificationCode)) {
			user.setEnabled(true);
			return true;
		}
		return false;
	}
	
//	private void sendmail() throws AddressException, MessagingException, IOException {
//		MyemailEmailcredeintials emailcredeintials = emailcredeintialsDao.get();
//	   Properties props = new Properties();
//	   props.put("mail.smtp.auth", "true");
//	   props.put("mail.smtp.starttls.enable", "true");
//	   props.put("mail.smtp.host", emailcredeintials.getHost());
//	   props.put("mail.smtp.port", emailcredeintials.getPort());
//	   
//	   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
//	      protected PasswordAuthentication getPasswordAuthentication() {
//	         return new PasswordAuthentication(emailcredeintials.getUsername(), emailcredeintials.getPassword());
//	      }
//	   });
//	   Message msg = new MimeMessage(session);
//	   msg.setFrom(new InternetAddress(emailcredeintials.getUsername(), false));
//	
//	   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailcredeintials.getUsername()));
//	   msg.setSubject("Please verify your registration");
//	   String content = "Dear [[name]],<br>" + "Please click the link below to verify your registration:<br>" 
//				+ "<h3><a href=\"[[URL]]/caregiver-step-2\" target=\"_self\">VERIFY</a></h3>" + "Thank you,<br>" + "Preferred Private Care.";
//	   msg.setContent(content, "text/html");
//	   msg.setSentDate(new Date());
//	
//	   MimeBodyPart messageBodyPart = new MimeBodyPart();
//	   messageBodyPart.setContent(content, "text/html");
//	
//	   Multipart multipart = new MimeMultipart();
//	   multipart.addBodyPart(messageBodyPart);
//	   MimeBodyPart attachPart = new MimeBodyPart();
//	
//	   multipart.addBodyPart(attachPart);
//	   msg.setContent(multipart);
//	   Transport.send(msg);   
//	}
//	
//	private void sendVerificationEmail(AuthUser user, String siteURL) throws UnsupportedEncodingException, MessagingException{
//		String toAddress = user.getEmail();
//		String fromAddress = "Test@gmail.com";
//		String senderName = "Preferred Private Care";
//		String subject = "Please verify your registration";
//		String content = "Dear [[name]],<br>" + "Please click the link below to verify your registration:<br>" 
//				+ "<h3><a href=\"[[URL]]\" target=\"_self\">VERIFY</a></h3>" + "Thank you,<br>" + "Preferred Private Care.";
//		
//		MimeMessage message = mailSender.createMimeMessage();
//		MimeMessageHelper helper = new MimeMessageHelper(message);
//		
//		helper.setFrom(fromAddress, senderName);
//		helper.setTo(toAddress);
//		helper.setSubject(subject);
//		
//		content = content.replace("[[name]]", user.getUsername());
//		String randomCode = RandomString.make(64);
//		String verifyURL = siteURL + "/verify?code=" + randomCode;
//		content = content.replace("[[URL]]", verifyURL);
//		helper.setText(content, true);
//		mailSender.send(message);
//	}

	@Override
	public Page<AuthUser> findAll(Pageable pageable) {
		return dao.findAll(pageable);
	}

	@Override
	public AuthUser getAuthUser(Integer id) {
		return dao.getAuthUser(id);
	}

	@Override
	public boolean deleteAuthUser(int id) {
		userGroupsDao.deleteAuthUserGroups(id);
		return dao.deleteAuthUser(id);
	}

	@Override
	public AuthUser createUser(AuthUser user) {		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
		String formatDateTime = now.format(format);
		
		if(user.getRegistrationType() == 1) {
			user.setIsSuperuser(1);
			user.setIsStaff(1);
			user.setIsActive(1);
		} else {
			user.setIsSuperuser(0);
			user.setIsStaff(0);
			user.setIsActive(0);
		}

		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		user.setUsername(user.getFirstName() + " " + user.getLastName());
		user.setDateJoined(formatDateTime);
		user.setLastLogin(formatDateTime);
		AuthUser resultUser = dao.register(user);
		
		List<Integer> userGroupIds = user.getUserGroupIds();
		if(userGroupIds.size() > 0) {
			for(int i=0; i<userGroupIds.size(); i++) {
				Integer userGroupId = userGroupIds.get(i);
				AuthUserGroups authGroup = new AuthUserGroups();
				authGroup.setUserId(resultUser.getId());
				authGroup.setGroupId(userGroupId);
				userGroupsDao.save(authGroup);
			}
		}
		return resultUser;
	}

	@Override
	public AuthUser updateUser(int id, AuthUser user) {
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		AuthUser selectUser = dao.getAuthUser(id);
		if(!StringUtils.isEmpty(user.getPassword())) {
			selectUser.setPassword(encodedPassword);
		}
		selectUser.setLastName(user.getLastName());
		selectUser.setFirstName(user.getFirstName());
		selectUser.setEmail(user.getEmail());
		selectUser.setRegistrationType(user.getRegistrationType());
		
		List<AuthUserGroups> userGroups = userGroupsDao.findByUserId(id);
		for(int i=0; i < userGroups.size(); i++) {
			userGroupsDao.deleteAuthUserGroups(id);
		}
		
		for(int j=0; j < user.getUserGroupIds().size(); j++) {
			AuthUserGroups newUserGroup = new AuthUserGroups();
			newUserGroup.setUserId(id);
			newUserGroup.setGroupId(user.getUserGroupIds().get(j));
			userGroupsDao.save(newUserGroup);
		}		
		return selectUser;
	}

	@Override
	public AuthUser getAuthUserById(Integer id) {
		AuthUser user = dao.getAuthUser(id);
		List<AuthUserGroups> groups = groupDao.userGroupByUserId(id);
		user.setUserGroups(groups);
		return user;
	}

	@Override
	public List<AuthUser> findAllUsers() {
		return dao.findAllUsers();
	}

}
