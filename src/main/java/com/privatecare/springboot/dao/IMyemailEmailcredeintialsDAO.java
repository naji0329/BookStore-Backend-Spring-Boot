package com.privatecare.springboot.dao;

import com.privatecare.springboot.entity.MyemailEmailcredeintials;

public interface IMyemailEmailcredeintialsDAO {
	
	void save(MyemailEmailcredeintials emailcredeintials);

	MyemailEmailcredeintials get();
	
	MyemailEmailcredeintials getById(int id);
}
