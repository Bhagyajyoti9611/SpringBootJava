package com.gentech.stringdemo1;
class Student
{
	String firstName;
	int age;
	Student(String firstName,int age)
	{
		this.firstName=firstName;
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "First Name is "+firstName+" and age is "+age;
	}
}
public class StringDemo2 {
	public static void main(String[] args) {
		Student obj=new Student("Santosh",21);
		System.out.println(obj);

	}

}
