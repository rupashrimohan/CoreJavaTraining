package com.multithreading;

public class YeildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Thread ym = new Thread(new YeildMethodDemo());
   ym.start();
   //ym.yield();
   for (int i=0; i<5; i++) 
   { 
       // Control passes to child thread 
       Thread.yield(); 

       // After execution of child Thread 
       // main thread takes over 
       System.out.println(Thread.currentThread().getName() 
                           + " in n control"); 
    

	}

	}
}