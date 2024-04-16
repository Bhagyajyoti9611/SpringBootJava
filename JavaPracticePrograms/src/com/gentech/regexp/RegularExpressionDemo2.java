package com.gentech.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
	//	regExpDemo1();
		refExpDemo2();
	}

	private static void regExpDemo1()
	{
		Pattern pattern=Pattern.compile("[0-9]{3}");
		String str="Kolar has recieved 112 milimeter rain yesterday";
		Matcher match=pattern.matcher(str);
		String val=match.replaceAll("many");
		System.out.println(val);
	}
	
	private static void refExpDemo2()
	{
		Pattern pattern=Pattern.compile("[a-zA-Z]+");
		String str="The temple is at the top of the hill";
		Matcher match=pattern.matcher(str);
		while(match.find())
		{
			System.out.println(match.group());
		}
		
	}
}
