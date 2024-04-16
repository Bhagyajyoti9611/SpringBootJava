package com.gentech.tests.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiReadWriteFiles {
  
	private static void readWriteContent()
	{
		FileInputStream  fin= null;
		Workbook wb = null;
		Sheet sh1 = null;
		Row row=null;
		try {
			
			fin= new FileInputStream("E:\\\\Excel\\\\Test.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			int rc = sh1.getPhysicalNumberOfRows();
			for(int i=0;i<rc;i++)
			{
				
			}
			
		} catch (Exception e) {

		}
		finally {
			
		}try {
			
		} catch (Exception e) {

		}
	}
	
	public static void main(String[] args) {
		
		readWriteContent();
	}

}
