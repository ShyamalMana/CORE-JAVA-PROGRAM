package com.shyam;

import java.util.Scanner;

public class Palindrome_checker 
{
	private static Scanner sc =new Scanner(System.in);
	public static void NumberPalindrome() 
	{
		System.out.println("enter integer data for cheaking");
		int intialdata = sc.nextInt();
		int d1 = intialdata;
		int rev1 =0;
		while(intialdata!=0)
		{
			int r = intialdata%10;
			rev1 = (rev1*10)+r;
			intialdata = intialdata/10;
		}
		if (d1==rev1) 
		{
			System.out.println(d1+"- is palindrome");
		}
		else {
			System.out.println(d1+"- not palindrome");
		}
	}
	public static void StringPalindrome() 
	{
		System.out.println("enter String data to cheak");
		sc.nextLine();
		String strdata = sc.nextLine();
		String d2 = strdata;
		String rev2 = "";
		for (int i =d2.length()-1; i >= 0; i--) 
		{
			
				rev2 = rev2+d2.charAt(i);
				
			}
	
		if(strdata.equals(rev2))
		{
			System.out.println(rev2+"- Is String Palindrome");
		}
		else {
			System.out.println(rev2+" - is not palindrome");
		}
	}
	public static void main(String[] args)  
	{
		
		System.out.println("enter 1 for integer data");
		System.out.println("enter 2 for String data");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			NumberPalindrome();
			
			break;
		case 2:
			StringPalindrome();
			
			break;

		default:
			System.out.println("Invalid Choice");
			return;
		}
	}


}
