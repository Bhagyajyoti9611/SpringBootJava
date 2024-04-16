package com.gentech.serialization;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		readObjectFromFile();

	}

	private static void readObjectFromFile()
	{
		FileInputStream fin=null;
		ObjectInputStream in=null;
		Student obj1=null;
		try
		{
			fin=new FileInputStream("E:\\Demo\\Sample\\students.ser");
			in=new ObjectInputStream(fin);
			
			obj1=(Student) in.readObject();
			
			obj1.showStudentFirstName("Santosh");
			obj1.showCourseName("Research");
			obj1.showCollegeName("LVD College Raichur");
			obj1.showStudentAddress("5th Main,12th cross Attigupe");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				in.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
