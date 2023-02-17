package com.privatecare.springboot.services;

import com.privatecare.springboot.entity.PdfprocessorRecord;

public interface IPdfprocessorRecordService {
	
	PdfprocessorRecord add(PdfprocessorRecord record);

	PdfprocessorRecord getApplicationById(int id);
}
