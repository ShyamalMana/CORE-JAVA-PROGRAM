package COM.SHYAM;

import java.util.Scanner;

public class Fibonacci
{
	
	void ad(int n)
	 {
		
	  int p=0;
	  int q=1;
	  System.out.println(p+" "+q);
	  for(int i=1;i<=n;i++)
	  {
	   int r=p+q;
	   System.out.println(r);
	   p=q;
	   q=r;
	  }
	 }
	
	
	 public static void main(String[]args)
	 {
	  Fibonacci f = new Fibonacci();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number to check--");
		int n=sc.nextInt();
	  f.ad(n);
	 }

	 }
