package com.gentech.stringdemo1;

public class Practice {
	static void StringPattern()
	{
		String s ="Welcome";
		char ch[]=s.toCharArray();
		for(int k=s.length()-1;k>=0;k--)
		{
			for(int i=0;i<=k;i++)
			{
				System.out.print(" " +ch[i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		

		StringPattern();
	}

}
