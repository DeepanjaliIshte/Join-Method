
public class License_Demo extends Thread 
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Medical med=new Medical();
		med.start();
		med.join();
		System.out.println();
		TestDriver td=new TestDriver();
		td.start();
		td.join();
		System.out.println();
		Officer_sign os=new Officer_sign();
		os.start();
		
	}
}

class Medical extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Medical starts");
			Thread.sleep(3000);
			System.out.println("Medical completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class TestDriver extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Test drive Starts");
			Thread.sleep(5000);
			System.out.println("Test drive completed");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Officer_sign extends Thread
{
	public void run()
	{
		try
		{
		System.out.println("Officer takes the file");	
		Thread.sleep(10000);
		System.out.println("Officer Work Completed");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
