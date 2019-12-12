package com.multithreading;

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread one=new Thread(new RunnableDemo());
		/*
		 * Thread two = new Thread(new RunnableDemo()); Thread three= new Thread();
		 */
		
		one.start();
		/*
		 * two.start(); three.start();
		 */
	}

}
