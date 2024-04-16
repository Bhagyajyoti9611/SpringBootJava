package com.gentech.iodemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		writeContent();

	}
	
	private static void writeContent()
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fw=new FileWriter("E:\\Demo\\Sample\\Welcome3.txt",true);
			bw=new BufferedWriter(fw);
			bw.write("Java is a programming language, It used for application.");
			bw.newLine();
			bw.write("JavaScript is a scripting language, It used for frontend.");
			bw.newLine();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
