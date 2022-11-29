package JAVA;

class Test extends Thread
{
	public void run() 
	{
		for(int i=1;i<=4;i++) 
		{
			try 
			{
				System.out.println(i);
				Thread.sleep(400); //sleep method
			} catch (Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class MyThread
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.start();//start method
	}
}
