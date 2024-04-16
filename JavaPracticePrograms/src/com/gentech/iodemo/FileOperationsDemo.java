package com.gentech.iodemo;

import java.io.File;

public class FileOperationsDemo {

	public static void main(String[] args) {
	//	createFile();
	//	renameFile();
	//	deleteFile();
		fileCollections();
	}

	private static void createFile()
	{
		try
		{
			File f=new File("E:\\Demo\\Sample\\Welcome1.txt");
			f.createNewFile();
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void renameFile()
	{
		File f=new File("E:\\Demo\\Sample\\Welcome1.txt");
		File f2=new File("E:\\Demo\\Sample\\Demo_Welcome1.txt");
		f.renameTo(f2);
	}
	
	private static void deleteFile()
	{
		File f2=new File("E:\\Demo\\Sample\\Demo_Welcome1.txt");
		boolean v1=f2.delete();
		System.out.println("Is File Deleted ?:"+v1);
	}
	
	private static void fileCollections()
	{
		File f=new File("E:\\Demo\\Sample");
		File f2[]=f.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isFile())
			{
				String filepath=f2[i].getPath();
				System.out.println(filepath);
			}
		}
	}
}
