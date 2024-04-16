package com.gentech.utildemo;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
	//	addElements();
		readAndRemoveElements();
	}

	private static void addElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put("raichur", "It is a famous historical place in Karnataka");
		System.out.println("Elements :"+obj);
	}

	private static void readAndRemoveElements()
	{
		Hashtable<String,String> obj=new Hashtable<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put("raichur", "It is a famous historical place in Karnataka");
		System.out.println("Elements :"+obj);
		//Read Value
		String v1=obj.get("lion");
		System.out.println(v1);
		//Remove Key
		obj.remove("lion");
		//Read Value
		String v2=obj.get("lion");
		System.out.println(v2);
	}

}
