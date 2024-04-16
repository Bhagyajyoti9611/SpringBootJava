package com.gentech.utildemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) {
	//	writeContent();
		readContent();
	}
	
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("E:\\Demo\\Sample\\login.properties");
			prop=new Properties();
			prop.setProperty("user", "demoUser1");
			prop.setProperty("pwd", "Password@123");
			prop.setProperty("pin", "1234");
			prop.store(fout, "It is for Testing purpose");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	private static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("E:\\Demo\\Sample\\login.properties");
			prop=new Properties();
			prop.load(fin);
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("pwd"));
			System.out.println(prop.getProperty("pin"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
