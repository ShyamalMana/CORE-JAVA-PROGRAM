package com.shyam;

import java.util.Scanner;

public class Sum_Of_Digit
{
	public static void main(String[]args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check sum of digit-");
	  int no=sc.nextInt();
	  int sum=0;
	  while(no!=0)
	  {
	   int rem=no%10;
	   sum=sum+rem;
	   no=no/10;
	  }
	  System.out.println(sum);
	 }

}
