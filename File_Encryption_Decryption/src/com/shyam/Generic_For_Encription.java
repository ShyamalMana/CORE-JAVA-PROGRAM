package com.shyam;

public class Generic_For_Encription 
{
	public static char[] Gen(char[]en ,int seckey) {
		int key1= seckey;
		System.out.println();
		for (char c : en) 
		{
			c-=key1;
		}
		return en;
		
	
	
	}

}
