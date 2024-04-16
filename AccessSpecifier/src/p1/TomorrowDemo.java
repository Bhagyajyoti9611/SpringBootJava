package p1;

import java.util.Scanner;

public class TomorrowDemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string");
		String s =scn.next();
		StringBuilder obj = new StringBuilder();
		char ch[]= s.toCharArray();
		int count=0;
		for (char c : ch)
		{
			if(c=='O')
			{
				count++;
				for(int i=1;i<=count;i++)
				{
					obj.append("$");
				}
			}
			else
			{
				obj.append(c);
			}
		}
		System.out.println(obj);
	}

}
