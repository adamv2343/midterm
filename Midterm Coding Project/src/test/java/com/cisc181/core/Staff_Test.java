package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import sun.util.calendar.BaseCalendar.Date;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}
	
	@Test
	public void test() {
		ArrayList salary = new ArrayList();
		salary.add(30000);
		salary.add(40000);
		salary.add(50000);
		assertTrue((30000+40000+50000) - 3 == 40000);
		
	}	
	
	@Test(expected=PersonException.class)
	public void TestDate() throws PersonException{
			String phone_number = "(302)-438-9919";
			String firstName = "Bill";
			String lastName = "Smith";
			String mName = "John";
			String email = "email@email.com";
			Date DOB = "Febuary, 16, 1985";
			String address = "address";
			Person a = new Person(firstName, mName, lastName,
					DOB, address, phone_number, email);
			a.getDOB();
		
			
		}
	@Test(expected=PersonException.class)
	public void TestPone() throws PersonException{
			String phone_number = "(302)-438-9919";
			String firstName = "Bill";
			String lastName = "Smith";
			String mName = "John";
			String email = "email@email.com";
			java.util.Date DOB = "Febuary, 16, 1985";
			String address = "address";
			Person a = new Person(firstName, mName, lastName,
					DOB, address, phone_number, email);
			a.getPhone();
		
			
		}
	}


}
