package com.cisc181.core;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import sun.util.calendar.BaseCalendar.Date;

public class Student_Test {

	@BeforeClass
	public static void setup() {
	
		ArrayList course = new ArrayList();
		course.add("math");
		course.add("art");
		course.add("english");
		ArrayList semester = new ArrayList();
		semester.add("fall");
		semester.add("spring");
		ArrayList fallSections = new ArrayList();
		fallSections.add("math01");
		fallSections.add("math02");
		fallSections.add("art01");
		fallSections.add("art02");
		fallSections.add("english01");
		fallSections.add("english02");
		ArrayList springSections = new ArrayList();
		springSections.add("math03");
		springSections.add("math04");
		springSections.add("art03");
		springSections.add("art04");
		springSections.add("english03");
		springSections.add("english04");
	}


	}
	@Test
	public void majorChangeTest(){
		String phone_number = "(302)-540-9919";
		String firstName = "Dale";
		String lastName = "Williams";
		String mName = "Vincent";
		String email = "email@email.com";
		java.util.Date DOB = "Febuary, 16, 1992";
		String Major = "PHYSICS";
		String address = "address";
		Student a = new Student(firstName, mName, lastName,
				DOB, Major, address, phone_number, email);
		String newMajor = a.getMajor(1);
		assertTrue(newMajor = "COMPSI");
			
		
		
	}

	private void assertTrue(String string) {
		// TODO Auto-generated method stub
		
	}
}