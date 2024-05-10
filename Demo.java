
public class Demo extends Thread{
	static Thread mainthread;
	public void run()
	{
		
		try 
		{
			//mainthread.join();
			for(int i=1;i<=5;i++)
			{
				System.out.println("child thread : " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{		
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 mainthread=Thread.currentThread();
		Demo d=new Demo();
		d.start();

		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("main thread : " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{		
			System.out.println(e);
		}
				
	}

}
