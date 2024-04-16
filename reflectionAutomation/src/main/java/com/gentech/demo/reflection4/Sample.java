package com.gentech.demo.reflection4;

public class Sample {
	
	static
	{
		Sample o=new Sample();
		o.display1();
		o.display2();
		o.display3();
		o.display4();
		o.display5();
		Sample.display6();
		Sample.display7();
		Sample.display8();
		Sample.display9();
		Sample.display10();
	}
	
	public void display1()
	{
		System.out.println("It is display1 method statement!!");
	}

	public void display2()
	{
		System.out.println("It is display2 method statement!!");
	}
	
	public void display3()
	{
		System.out.println("It is display3 method statement!!");
	}
	
	public void display4()
	{
		System.out.println("It is display4 method statement!!");
	}
	
	public void display5()
	{
		System.out.println("It is display5 method statement!!");
	}
	
	public static void display6()
	{
		System.out.println("It is display6 method statement!!");
	}
	
	public static void display7()
	{
		System.out.println("It is display7 method statement!!");
	}
	
	public static void display8()
	{
		System.out.println("It is display8 method statement!!");
	}
	
	public static void display9()
	{
		System.out.println("It is display9 method statement!!");
	}
	
	public static void display10()
	{
		System.out.println("It is display10 method statement!!");
	}
}
