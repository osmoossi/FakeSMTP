package com.nilhcem.fakesmtp.model;

import lombok.Data;

import java.util.Date;

@Data
public final class EmailModel {

	private Date receivedDate;
	private String from;
	private String to;
	private String subject;
	private String emailStr;
	
}
