package com.cisc181.core;
import java.util.UUID;


public class Course {
	public UUID CourseID;
	public String CourseName;
	public int GradePoints;
	public String Major;


	public Course(UUID CourseID, String CourseName, int GradePoints, String Major)
	{
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
		this.Major = Major;
	}



}

