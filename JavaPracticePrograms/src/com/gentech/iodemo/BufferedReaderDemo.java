package com.gentech.iodemo;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		readContent();

	}
	
	private static void readContent()
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("E:\\Demo\\Sample\\Welcome.txt");
			br=new BufferedReader(fr);
			String sline=null;
			while(true)
			{
				sline=br.readLine();
				if(sline==null)
				{
					break;
				}
				System.out.println(sline);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}
