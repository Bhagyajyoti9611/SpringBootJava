package com.gentech.demo.csv;

import java.io.FileWriter;

import com.opencsv.CSVWriter;

public class WriteCSVFilecontent {

	public static void main(String[] args) {
		writeContent();

	}

	private static void writeContent()
	{
		FileWriter fw=null;
		CSVWriter writer=null;
		try
		{
			fw=new FileWriter("E:\\Demo\\Sample\\employees.csv");
			writer=new CSVWriter(fw);
			
			String header[]= {"empid","ename","job","sal","dname","state","country"};
			writer.writeNext(header);
			
			String row1[]={"11","Santosh","Manager","9700","Research","Karnataka","India"};
			writer.writeNext(row1);
			
			String row2[]={"12","Adams","Analyst","3700","Accounting","Kerala","India"};
			writer.writeNext(row2);
			
			String row3[]={"13","Jones","Salesman","5500","Sales","Tamilnadu","India"};
			writer.writeNext(row3);
						
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				writer.flush();
				writer.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
