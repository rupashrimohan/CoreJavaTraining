package com.multithreading;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultithreadingDemo threadone = new MultithreadingDemo();
		MultithreadingDemo threadtwo = new MultithreadingDemo();
		
		threadone.start();
		threadtwo.start();

	}

}
