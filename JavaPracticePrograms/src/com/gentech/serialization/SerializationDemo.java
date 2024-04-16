package com.gentech.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		writeObjectToFile();

	}
	
	private static void writeObjectToFile()
	{
		FileOutputStream fout=null;
		ObjectOutputStream out=null;
		Student obj=null;
		try
		{
			fout=new FileOutputStream("E:\\Demo\\Sample\\students.ser");
			out=new ObjectOutputStream(fout);
			obj=new Student();
			
			out.writeObject(obj);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				out.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
