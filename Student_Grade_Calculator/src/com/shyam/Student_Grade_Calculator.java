package com.shyam;

import java.util.Scanner;

public class Student_Grade_Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number of grades:-");
			int size=sc.nextInt();
			double[]grade=new double[size];
			double sum=0;
			for(int i=0;i<size;i++)
			{
				System.out.println("enter grade "+(i+1)+":");
				grade[i]=sc.nextDouble();
			
			}
			for(double grade1:grade)
			{
				sum=sum+grade1;
			}
			double avggrade=sum/size;
			System.out.println("The average grade is:"+avggrade);
			
		    }
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
		}
		finally 
		{
			sc.close();	
			
		}
		
	}

}
