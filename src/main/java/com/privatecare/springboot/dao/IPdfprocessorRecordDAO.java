package com.privatecare.springboot.dao;

import com.privatecare.springboot.entity.PdfprocessorRecord;

public interface IPdfprocessorRecordDAO {
	
	PdfprocessorRecord add(PdfprocessorRecord record);

	PdfprocessorRecord getApplicationById(int id);
	
}
