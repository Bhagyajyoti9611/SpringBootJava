package com.gentech.utildemo;
class MyClass<T>
{
	T obj=null;
	
	void add(T obj)
	{
		this.obj=obj;	
	}
	T get()
	{
		return obj;
	}
}
public class GenericsDemo1 {
	public static void main(String[] args) {
		//Using Generics
		MyClass<Integer> o1=new MyClass<Integer>();
		o1.add(140);
		int v1=o1.get();
		System.out.println(v1);
		o1.add(340);
		int v2=o1.get();
		System.out.println(v2);
		// Without Generics
		MyClass o2=new MyClass();
		o2.add("Mango");
		String s1=(String) o2.get();
		System.out.println(s1);
		o2.add('Y');
		char ch1=(char) o2.get();
		System.out.println(ch1);
	}

}
