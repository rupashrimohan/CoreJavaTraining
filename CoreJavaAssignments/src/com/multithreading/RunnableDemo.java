package com.multithreading;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {

		// TODO Auto-generated method stub
		for(int i=0;i<8;i++)
		{
		System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		}
	}

}
