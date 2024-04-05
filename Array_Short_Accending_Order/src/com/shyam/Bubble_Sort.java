package com.shyam;

public class Bubble_Sort 
{
	public static void main(String[] args) {
		int [] arr= {8,78,4,7,9,5,56};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int c=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=c;
				}
			}
			
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
