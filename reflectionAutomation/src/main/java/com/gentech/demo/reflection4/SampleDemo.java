package com.gentech.demo.reflection4;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.gentech.demo.reflection4.Sample");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
