package com.privatecare.springboot.dao;

import com.privatecare.springboot.entity.PdfprocessorRecordApplication;

public interface IPdfprocessorRecordApplicationDAO {
	
	PdfprocessorRecordApplication add(PdfprocessorRecordApplication application);

	PdfprocessorRecordApplication update(Integer id, PdfprocessorRecordApplication application);

	PdfprocessorRecordApplication getApplicationRecordById(int id);

}
