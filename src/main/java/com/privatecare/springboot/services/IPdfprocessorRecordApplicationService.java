package com.privatecare.springboot.services;

import com.privatecare.springboot.entity.PdfprocessorRecordApplication;

public interface IPdfprocessorRecordApplicationService {
	
	PdfprocessorRecordApplication add(PdfprocessorRecordApplication application);
	
	PdfprocessorRecordApplication update(Integer id, PdfprocessorRecordApplication application);

	PdfprocessorRecordApplication getApplicationRecordById(int id);
}
