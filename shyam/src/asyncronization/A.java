package asyncronization;

public class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			try {
				Thread.sleep(1000);
				System.out.println("hiiiiii");
			} catch (InterruptedException e) {
				
			}
			
			
		}
	}

}
