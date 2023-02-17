package com.privatecare.springboot.services;

import com.privatecare.springboot.entity.PdfprocessorRecordfile;

public interface IPdfprocessorRecordfileService {
	
	PdfprocessorRecordfile add(PdfprocessorRecordfile recordfile);

	PdfprocessorRecordfile getRecordfileById(int recordfileId);
}
