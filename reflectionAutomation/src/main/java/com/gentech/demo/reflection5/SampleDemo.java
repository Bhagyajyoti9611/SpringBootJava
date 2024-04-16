package com.gentech.demo.reflection5;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class strparam[]=new Class[1];
			strparam[0]=String.class;
			
			Method methd1=obj.getClass().getMethod("showStudentName", strparam);
			methd1.invoke(obj, new String("Santosh"));
			
			Class intparam[]=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method methd2=obj.getClass().getMethod("showAge", intparam);
			methd2.invoke(obj, 21);
			
			
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
