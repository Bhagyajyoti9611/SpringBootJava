
package com.gentech.stringdemo1;

public class StringOperations {

	public static void main(String[] args) {
		lowercase();
		uppercase();
		displayNumberOfChars();
		verifyEmptyString();
		replacedemo();
		compareStrings1();
		compareStrings2();
		compareString3();
		characterAtPosition();
		existanceOfString();
		showCharacterArray();
		extractString1();
		splitDemo();
		convertToString();
	}

	private static void lowercase()
	{
		String s1="WELCOME";
		String s2=s1.toLowerCase();
		System.out.println("Lower case :"+s2);
		System.out.println("++++++++++++");
	}
	
	private static void uppercase()
	{
		String s1="welcome";
		String s2=s1.toUpperCase();
		System.out.println("Upper case :"+s2);
		System.out.println("++++++++++++");
	}
	
	private static void displayNumberOfChars()
	{
		String s1=new String("welcome");
		System.out.println("# of Chars :"+s1.length());
		System.out.println("++++++++++++");
	}
	
	private static void verifyEmptyString()
	{
		String s1="";
		String s2=new String();
		System.out.println("Is s1 object Empty ?"+s1.isEmpty());
		System.out.println("Is s2 object Empty ?"+s2.isEmpty());
		System.out.println("Is s1 object blank ?"+s1.isBlank());
		System.out.println("Is s2 object blank ?"+s2.isBlank());
		System.out.println("++++++++++++");
	}
	
	private static void replacedemo()
	{
		String s1="It is a new palace";
		System.out.println("Repalced Result:"+s1.replace("is", "was"));
		System.out.println("++++++++++++");
	}
	
	private static void compareStrings1()
	{
		String s1="Welcome";
		String s2=new String("Welcome");
		System.out.println("Reference of s1 and s2 are same :"+(s1==s2));
		System.out.println("Content of s1 and s2 are same :"+(s1.equals(s2)));
		System.out.println("++++++++++++");
	}
	
	private static void compareStrings2()
	{
		String s1="WELCOME";
		String s2=new String("Welcome");
		System.out.println("Content of s1 and s2 are same :"+(s1.equals(s2)));
		System.out.println("Ignore case of Content of s1 and s2  :"+(s1.equalsIgnoreCase(s2)));
		System.out.println("++++++++++++");
	}
	
	private static void compareString3()
	{
		String s1="welcome";
		String s2="WELCOME";
		System.out.println("Content of s1 and s2 are same :"+(s1.compareTo(s2)));
		System.out.println("Ignoer case of Content of s1 and s2 :"+(s1.compareToIgnoreCase(s2)));
		System.out.println("++++++++++++");
	}
	
	private static void characterAtPosition()
	{
		String s1="PROGRAM";
		System.out.println("Character at position 3 :"+s1.charAt(3));
		System.out.println("++++++++++++");
	}
	
	private static void existanceOfString()
	{
		String s1=new String("Bangalore is capital city of Karnataka");
		System.out.println("Starts With :"+s1.startsWith("Bangalore"));
		System.out.println("Ends With :"+s1.endsWith("Karnataka"));
		System.out.println("Contains :"+s1.contains("capital"));
		System.out.println("++++++++++++");
	}
	
	private static void showCharacterArray()
	{
		String s="Welcome";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("++++++++++++");
	}
	
	private static void extractString1()
	{
		String s1="Programming";
		System.out.println("Based on Position :"+s1.substring(3));
		System.out.println("Based on Range :"+s1.substring(4, 7));
		System.out.println("++++++++++++");
	}
	
	private static void splitDemo()
	{
		String s1="Orange,Apple,Mango";
		String str[]=s1.split(",");
		for(String kk:str)
		{
			System.out.println(kk);
		}
		System.out.println("++++++++++++");
	}
	
	private static void convertToString()
	{
		double d=14.75;
		String s1=String.valueOf(d);
		System.out.println(s1);
		boolean b=true;
		String s2=String.valueOf(b);
		System.out.println(s2);
		System.out.println("++++++++++++");
	}
}
