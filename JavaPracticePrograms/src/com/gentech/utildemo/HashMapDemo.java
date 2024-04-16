package com.gentech.utildemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//	addElements();
		//	readAndRemoveElements();
		readElements();
	}

	private static void addElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put(null, "It supports null keys!!!!");
		System.out.println("Elements :"+obj);
	}

	private static void readAndRemoveElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put(null, "It supports null keys!!!!");
		System.out.println("Elements :"+obj);
		// Read Value
		String v1=obj.get("mango");
		System.out.println(v1);
		//Remove Value
		obj.remove("mango");
		// Read Value
		String v2=obj.get("mango");
		System.out.println(v2);
	}
	
	private static void readElements()
	{
		HashMap<String,String> obj=new HashMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put(null, "It supports null keys!!!!");
		System.out.println("Elements :"+obj);
		obj.forEach((k,v) -> System.out.println(k+" --> "+v));
	}
}
