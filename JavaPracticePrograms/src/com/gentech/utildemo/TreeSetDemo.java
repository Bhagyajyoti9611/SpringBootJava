package com.gentech.utildemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElementsByIterator();
		convertToArray();
	}
	
	private static void addElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		TreeSet<String> obj1=new TreeSet<String>();
		obj1.add("Blue");
		obj1.add("Red");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}

	private static void removeElements()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		obj.add("Berry");
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);;
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		obj.add("Berry");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElementsByIterator()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		obj.add("Berry");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void convertToArray()
	{
		TreeSet<String> obj=new TreeSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		obj.add("Berry");
		System.out.println("Elements :"+obj);
		Object[] arr=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
