package com.gentech.iodemo;

import java.io.File;

public class FolderOperations {
	public static void main(String[] args) {
	//	createFolder();
	//	createNestedFolder();
	//	renameFolder();
	//	deleteFolder();
		folderCollections();
	}
	
	private static void createFolder()
	{
		File f=new File("E:\\Demo\\Sample\\Testing");
		boolean v1=f.mkdir();
		System.out.println(v1);
	}

	private static void createNestedFolder()
	{
		File f=new File("E:\\Demo\\Sample\\Testing\\Test1\\Test2\\Test3");
		boolean v1=f.mkdirs();
		System.out.println(v1);
	}
	
	private static void renameFolder()
	{
		File f=new File("E:\\Demo\\Sample\\Testing");
		File f2=new File("E:\\Demo\\Sample\\API_Testing");
		f.renameTo(f2);
	}
	
	private static void deleteFolder()
	{
		File f2=new File("E:\\Demo\\Sample\\API_Testing");
		boolean v1=f2.delete();
		System.out.println(v1);
	}
	
	private static void folderCollections()
	{
		File f=new File("E:\\Demo\\Sample");
		File f2[]=f.listFiles();
		for(int i=0;i<f2.length;i++)
		{
			if(f2[i].isDirectory())
			{
				String filepath=f2[i].getPath();
				System.out.println(filepath);
			}
		}
	}
}
