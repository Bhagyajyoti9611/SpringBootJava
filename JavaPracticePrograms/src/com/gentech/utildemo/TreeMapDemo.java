package com.gentech.utildemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
	//	addElements();
	//	readAndRemoveElements();
		readElements();
	}
	
	private static void addElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
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
		TreeMap<String,String> obj=new TreeMap<String,String>();
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
		String v1=obj.get("peacock");
		System.out.println(v1);
		//Remove Key
		obj.remove("peacock");
		//Read Value
		String v2=obj.get("peacock");
		System.out.println(v2);
	}
	
	private static void readElements()
	{
		TreeMap<String,String> obj=new TreeMap<String,String>();
		System.out.println("Elements :"+obj);
		obj.put("mango", "Mango is a king of all fruits");
		obj.put("camel", "Camel is a ship of desrt");
		obj.put("lotus", "Lotus is a national flower");
		obj.put("tiger", "Tiger is a national animal");
		obj.put("peacock", "Peacock is a national Bird");
		obj.put("lion", "Lion is a king of Forest");
		obj.put("raichur", "It is a famous historical place in Karnataka");
		System.out.println("Elements :"+obj);
		obj.forEach((k,v) -> System.out.println(k+ " --> "+v));
	}
}
