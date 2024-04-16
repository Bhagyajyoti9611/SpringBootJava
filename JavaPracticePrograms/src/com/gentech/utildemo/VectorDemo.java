package com.gentech.utildemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
	//	readElementsByEnumeration();
		withOutGenerics();
	}
	
	private static void addElements()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
		obj.add("Mango");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		Vector<String> obj1=new Vector();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("Red");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}
	
	private static void removeElements()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.remove("Pineapple");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	
	private static void readElements1()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		for(String kk:obj)
		{
			System.out.println(kk);
		}
	}

	private static void readElements2()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	
	private static void readElementsByIterator()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	
	private static void readElementsByEnumeration()
	{
		Vector<String> obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		Enumeration<String> ite=obj.elements();
		while(ite.hasMoreElements())
		{
			System.out.println(ite.nextElement());
		}
	}
	
	private static void withOutGenerics()
	{
		Vector obj=new Vector();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements :"+obj);
	}
}
