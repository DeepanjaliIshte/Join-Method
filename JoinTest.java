
public class JoinTest extends Thread {
	public void run()
	{
		try {
	
		for (int i=1;i<=5;i++)
		{
			System.out.println("Child thread : "+i);
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		JoinTest jt= new JoinTest();
		jt.start();
		jt.join();
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main Thread : "+i);
				Thread.sleep(1000);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


