package shyam;

public class Trangle 
{
	public static void main(String[] args) 
	{
		int r=5;
		for(int row=1;row<=r;row++)
		{
			for(int col=r;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
