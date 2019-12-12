package com.multithreading;

public class MultithreadingDemo extends Thread {
	
	@Override
	public void run()
	{
		System.out.println("Thread"+Thread.currentThread().getId()+"is running");
	}
	
	

}
