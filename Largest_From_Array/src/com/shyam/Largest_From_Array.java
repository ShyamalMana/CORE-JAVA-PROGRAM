package com.shyam;

public class Largest_From_Array
{
	public static void main(String[] args) {
		int []arr= {5,9,18,75,85,49};
		int first=0;
		int second=0;
		int last=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				last=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				last=second;
				second=arr[i];
			}
			else
			{
				last=arr[i];
			}
		}
		System.out.println("first largest no is:-"+first);
		System.out.println("second largest no is:-"+second);
		System.out.println("third largest no is:-"+last);
	}

}
