package com.shyam;

import java.util.Scanner;

public class Strong_Number 
{
	static void ad(int a)
	{
		int copy=a;
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			int fact=1;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			a=a/10;
		}
		if(copy==sum)
		{
			System.out.println("strong no");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check if it Strong or not----");
		int n=sc.nextInt();
		ad(n);
	}
}
