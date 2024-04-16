package com.gentech.utildemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {
	public static void main(String[] args) {
	//	addElements();
	//	removeElements();
	//	readElements1();
	//	readElements2();
	//	readElementsByIterator();
	//	readElementsByListIterator();
	//	withOutGenerics();
		queueDemo();
	}
	
	private static void addElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
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
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Blue");
		obj1.add("Green");
		obj1.add("Red");
		obj.addAll(obj1);
		System.out.println("Elements :"+obj);
	}

	private static void removeElements()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		obj.remove(1);
		System.out.println("Elements :"+obj);
		obj.remove("Grapes");
		System.out.println("Elements :"+obj);
		obj.removeAll(obj);
		System.out.println("Elements :"+obj);
	}
	
	private static void readElements1()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
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
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
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
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
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
	
	private static void readElementsByListIterator()
	{
		LinkedList<String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add(1,"Pineapple");
		obj.add("Kiwi");
		obj.add("Watermelon");
		obj.add("Banana");
		System.out.println("Elements :"+obj);
		ListIterator<String> listElements=obj.listIterator();
		System.out.println("Read forward Direction!!");
		while(listElements.hasNext())
		{
			System.out.println(listElements.next());
		}
		System.out.println("Read backward Direction!!");
		while(listElements.hasPrevious())
		{
			System.out.println(listElements.previous());
		}
	}
	
	private static void withOutGenerics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("Elements :"+obj);
		obj.add(true);
		obj.add(450);
		obj.add(12.99);
		obj.add('W');
		obj.add("Mango");
		System.out.println("Elements :"+obj);
	}
	
	private static void queueDemo()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements :"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		obj.add(600);
		obj.add(700);
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
		obj.remove();
		System.out.println("Elements :"+obj);
	}
}
