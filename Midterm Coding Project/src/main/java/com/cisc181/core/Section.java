package com.cisc181.core;

import java.util.UUID;

public class Section {
	public UUID CourseID;
	public UUID Semester;
	public UUID Section;
	public int RoomID;
	
	public Section(UUID CourseID, UUID Semester, UUID Section, int RoomID)
	{
		this.CourseID = CourseID;
		this.Semester = Semester;
		this.Section = Section;
		this.RoomID = RoomID;
	}
	

}
