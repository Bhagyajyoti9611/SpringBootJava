package com.gentech.wrapper;

public class WrapperClassDemo {

	public static void main(String[] args) {
	//	autoBoxingDemo();
		unboxingDemo();
	}
	
	private static void autoBoxingDemo()
	{
		int a=45;
		System.out.println("int a :"+a);
		Integer b=Integer.valueOf(a);
		System.out.println("Integer b:"+b);
		//Autoboxing
		Integer c=a;
		System.out.println("Integer c :"+c);
	}
	
	private static void unboxingDemo()
	{
		Integer a=Integer.valueOf(100);
		System.out.println("Integer a:"+a);
		int b=a.intValue();
		System.out.println("int b:"+b);
		//unboxing
		int c=a;
		System.out.println("int c:"+c);
	}

}
