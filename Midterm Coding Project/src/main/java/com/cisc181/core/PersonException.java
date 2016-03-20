package com.cisc181.core;

import java.util.Calendar;
import java.util.regex.Pattern;

import ch.qos.logback.core.boolex.Matcher;
import sun.util.calendar.CalendarDate;
import sun.util.calendar.BaseCalendar.Date;

public class PersonException extends Exception {
	public Date DOB;


	public void PersonException(Date DOB) {
		super();
		this.DOB = DOB;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setAmtOverdrawn(Date DOB) {
		this.DOB = DOB;
	}
	private String phone_number;

	public void PersonException(String phone_number) {
		super();
		this.phone_number = phone_number;
	}

	public String getAmtOverdrawn() {
		return phone_number;
	}

	public void setAmtOverdrawn(String phone_number) {
		this.phone_number = phone_number;
	}



}
