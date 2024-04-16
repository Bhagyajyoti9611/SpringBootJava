package com.gentech.tests.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteExcelContent {
	public static void main(String[] args) {
		readWriteContent();

	}
	
	private static void readWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row sh1Row=null;
		Row sh2Row=null;
		Cell sh1Cell=null;
		Cell sh2Cell=null;
		try
		{
			fin=new FileInputStream("E:\\Excel\\Test.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				sh1Row=sh1.getRow(r);
				sh2Row=sh2.getRow(r);
				if(sh2Row==null)
				{
					sh2Row=sh2.createRow(r);
				}
				int cc=sh1Row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					sh1Cell=sh1Row.getCell(c);
					String data=sh1Cell.getStringCellValue();
					sh2Cell=sh2Row.getCell(c);
					if(sh2Cell==null)
					{
						sh2Cell=sh2Row.createCell(c);
					}
					sh2Cell.setCellValue(data);
				}
			}
			fout=new FileOutputStream("E:\\Excel\\Test.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
