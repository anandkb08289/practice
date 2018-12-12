package org.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{ 
	//static Scanner sc=new Scanner(System.in);
	public static int getInt()
	{ Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		return i;
	}
	public static double getDouble()
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double i=sc.nextDouble();
		return i;
	}
	public static String getString()
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String i=sc.next();
		return i;
	}
	public static float getFloat()
	{Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		float i=sc.nextFloat();
		return i;
	}
	public static boolean isAnangram(String s1,String s2)
	{
		int[] c1=countAlp(s1);
		int[] c2=countAlp(s2);
		for (int i = 0; i < 26; i++) 
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	public static int[] countAlp(String s)
	{
		int[] arr=new int[26];
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				arr[ch-65]++;
			}
			if(ch>='a'&&ch<='z')
			{
				arr[ch-97]++;
			}
		}
		return arr;
	}
	public static boolean isPanagram(String s)
	{
		int[] c1=countAlp(s);
		for (int i = 0; i < 26; i++) 
		{
			if(c1[i]>=1)
			{
				return true;
			}
		}
		return false;
	}
	
}


