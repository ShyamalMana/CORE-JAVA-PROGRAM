package shyam;

public class Excep  
{
	static void vote(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for vote");
		}
		else
		{
			System.out.println("eligible for vote-");
		}
	}
	public static void main(String[] args) 
	{
		try {
			vote(16);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
}

