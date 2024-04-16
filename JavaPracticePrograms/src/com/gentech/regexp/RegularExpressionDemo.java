package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		matchesDemo();
		findDemo();
		countOfMatching();
		displayMatches();
		matchingPosition();
		replaceMatch();
		splitString();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("welcome");
		Matcher match=pattern.matcher("welcome");
		boolean val=match.matches();
		System.out.println(val);
	}
	
	private static void findDemo()
	{
		Pattern pattern=Pattern.compile("hello");
		Matcher match=pattern.matcher("welcome hello sayhello hi greeting");
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void countOfMatching()
	{
		Pattern pattern=Pattern.compile("hello");
		Matcher match=pattern.matcher("welcome hello sayhello hi greeting hello");
		int count=0;
		while(match.find())
		{
			count=count+1;
		}
		System.out.println("Number of Occurance :"+count);
	}

	private static void displayMatches()
	{
		Pattern pattern=Pattern.compile("hello");
		Matcher match=pattern.matcher("welcome hello sayhello hi greeting hello");
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void matchingPosition()
	{
		Pattern pattern=Pattern.compile("hello");
		Matcher match=pattern.matcher("welcome hello sayhello hi greeting hello");
		while(match.find())
		{
			System.out.println(match.group()+" Start :"+match.start()+" End :"+match.end());
		}
	}
	
	private static void replaceMatch()
	{
		Pattern pattern=Pattern.compile("hello");
		Matcher match=pattern.matcher("welcome hello sayhello hi greeting hello");
		String v1=match.replaceAll("good morning");
		System.out.println(v1);
	}
	
	private static void splitString()
	{
		Pattern pattern=Pattern.compile("[!@#$%]");
		String str="Mango!Apple@Banana#Orange$Grapes%Pineapple";
		String s[]=pattern.split(str);
		for(String kk:s)
		{
			System.out.println(kk);
		}
	}
}
