package com.gentech.demo.csv;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class ReadCSVFileContent {

	public static void main(String[] args) {
		readContent();

	}
	
	private static void readContent()
	{
		FileReader fr=null;
		CSVReader reader=null;
		try
		{
			fr=new FileReader("E:\\Demo\\Sample\\students.csv");
			reader=new CSVReader(fr);
			String data[];
			while((data=reader.readNext())!=null)
			{
				for(int i=0;i<data.length;i++)
				{
					System.out.print(data[i]+",");
				}
				System.out.println();
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
				reader.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
