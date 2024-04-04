package com.shyam;

public class Factorial 
{
	static void fact(int a,int b)
	 {
	  int fact=1;
	  for(int i=a;i>=b;i--)
	  {
	    fact=fact*i;
	  }
	  System.out.println(fact);
	 }
	 public static void main(String[]args)
	 {
	  fact(5,1);
	  
	 }

}
