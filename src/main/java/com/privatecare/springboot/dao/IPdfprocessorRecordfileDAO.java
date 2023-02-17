package com.privatecare.springboot.dao;

import com.privatecare.springboot.entity.PdfprocessorRecordfile;

public interface IPdfprocessorRecordfileDAO {
	
	PdfprocessorRecordfile add(PdfprocessorRecordfile recordfile);

	PdfprocessorRecordfile getRecordfileyId(int recordfileId);
}
