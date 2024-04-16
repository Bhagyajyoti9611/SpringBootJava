package com.gentech.stringdemo1;

public class StringBuilderDemo {

	public static void main(String[] args) {
		appendDemo();
		insertDemo();
		deleteDemo();
		reverseString();
	}
	
	private static void appendDemo()
	{
		StringBuilder s=new StringBuilder("Java");
		System.out.println(s);
		s.append(" Programming");
		System.out.println(s);
		System.out.println("+++++++++++");
	}
	
	private static void insertDemo()
	{
		StringBuilder s=new StringBuilder("It is a book");
		StringBuilder s1=s.insert(8, "new ");
		System.out.println("Inserted String :"+s1);
		System.out.println("+++++++++++");
	}

	private static void deleteDemo()
	{
		StringBuilder s=new StringBuilder("It is a new book");
		StringBuilder s1=s.delete(8, 12);
		System.out.println("Deleted String :"+s1);
		System.out.println("+++++++++++");
	}
	
	private static void reverseString()
	{
		StringBuilder s=new StringBuilder("Welcome");
		StringBuilder s1=s.reverse();
		System.out.println("Reversed String :"+s1);
		System.out.println("+++++++++++");
	}
	

}
