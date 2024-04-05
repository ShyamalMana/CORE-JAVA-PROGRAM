package com.shyam;

import java.util.Scanner;

public class Temperature_Converter 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temp value and unit As c , f");
		String T = sc.nextLine();
		sc.close();
		char L = T.charAt(T.length()-1);
		String l = String.valueOf(L);
		int z = Integer.parseInt(T.substring(0, T.length()-1));
		if (l.equals("c")) 
		{
		double temp = ((z*1.8)+32);
		System.out.println(temp +"f");
		}
		else if (l.equals("f")) 
		{
		  double temp1 =((z-32)*0.5555);
			System.out.println(temp1+"c");
		}
	}

}
