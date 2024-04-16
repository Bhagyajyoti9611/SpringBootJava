package com.gentech.utildemo;
class MyClass2
{
	public static<E> void readElements(E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenericsDemo2 {
	public static void main(String[] args) {
		Integer arr[]= {10,20,30,40,50};
		MyClass2.readElements(arr);
		Character[] ch= {'A','S','D','F','G'};
		MyClass2.readElements(ch);
		Double d[]= {1.1,2.2,3.3,4.4,5.5};
		MyClass2.readElements(d);
	}

}
