package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	private Enrollment(){
		
	}
	private Enrollment(UUID SectionID, UUID StudentID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		
	}
	public void setGrade(double Grade){
		this.Grade = Grade;
		
	}

}
