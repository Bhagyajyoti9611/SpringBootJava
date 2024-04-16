package com.gentech.utildemo;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElementsByIterator();
	//	convertToArray();
	//	withOutGenerics();
		readElementsByLamda();
	}
	
	private static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
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
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("White");
		obj1.add("Green");
		obj1.add("Red");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}

	private static void removeElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	
	private static void readElements1()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}
	
	private static void readElementsByIterator()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void convertToArray()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		System.out.println("Elements :"+obj);
		Object arr[]=obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	private static void withOutGenerics()
	{
		HashSet obj=new HashSet();
		System.out.println("Elements :"+obj);
		obj.add(455);
		obj.add(false);
		obj.add(10.75);
		obj.add("Mango");
		obj.add('W');
		System.out.println("Elements :"+obj);
	}
	
	private static void readElementsByLamda()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Watermelon");
		obj.add("Pineapple");
		obj.add("BlackBerry");
		System.out.println("Elements :"+obj);
		obj.forEach(v1 -> System.out.println(v1));
	}
}
