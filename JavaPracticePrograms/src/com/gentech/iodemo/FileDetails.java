package com.gentech.iodemo;

import java.io.File;

public class FileDetails {

	public static void main(String[] args) {
		File f=new File("E:\\Demo\\Sample\\Welcome.txt");
		//Show Name of the File
		String name=f.getName();
		System.out.println("File Name :"+name);
		// File Path
		String path1=f.getPath();
		System.out.println("File Path :"+path1);
		// File Path
		String path2=f.getAbsolutePath();
		System.out.println("File Path :"+path2);
		// Parent Folder Path
		String parentFolder1=f.getParent();
		System.out.println("Parent Folder :"+parentFolder1);
		// Parent Folder Path
		File parentFolder2=f.getParentFile();
		System.out.println("Parent Folder :"+parentFolder2);
		//show read Permission
		boolean v1=f.canRead();
		System.out.println("Is it readable File:"+v1);
		//show execute Permission
		boolean v2=f.canExecute();
		System.out.println("Is it readable File:"+v2);
		//show write Permission
		boolean v3=f.canWrite();
		System.out.println("Is it readable File:"+v3);
		//Verify File
		boolean v4=f.isFile();
		System.out.println("Is it a File ?:"+v4);
		//Verify Folder
		boolean v5=f.isDirectory();
		System.out.println("Is it a Folder ?:"+v5);
	}

}
