package order_of_occurance;

import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of col and rows");
		int n=sc.nextInt();
		
		for (int row = 1; row <=n; row++)
		{
			for (int col = 1; col <=n; col++) 
			{
				if( row==col||row>=col)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("- ");
				}
				
			}
			System.out.println();
			
		}
		
	}


}
