package com.gentech.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	public void showStudentFirstName(String name)
	{
		System.out.println("First Name of Student "+name);
	}

	public void showCourseName(String name)
	{
		System.out.println("Course Name of Student is "+name);
	}
	
	public void showCollegeName(String name)
	{
		System.out.println("College Name of the Student is "+name);
	}
	
	public void showStudentAddress(String address)
	{
		System.out.println("Address of the student is "+address);
	}
}
