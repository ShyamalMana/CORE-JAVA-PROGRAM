package shyam;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
