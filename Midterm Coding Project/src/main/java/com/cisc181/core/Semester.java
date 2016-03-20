package com.cisc181.core;
import java.util.Date;
import java.util.UUID;

public class Semester {
	public UUID SemesterID;
	public Date startDate;
	public Date endDate;
	
	public Semester(UUID SemesterID, Date startDate, Date endDate)
	{
		this.SemesterID = SemesterID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	

}
