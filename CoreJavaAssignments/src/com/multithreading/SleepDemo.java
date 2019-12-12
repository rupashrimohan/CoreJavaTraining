package com.multithreading;

public class SleepDemo extends Thread {
	
	public void run()
	{
			for(int i=0;i<4;i++)
			{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
}
	}
}
