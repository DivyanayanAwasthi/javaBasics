package com.Threads;
public class StartingPoint {

	public static void main(String[] args) throws InterruptedException {
	
		
		Thread2 thread2=new Thread2();
		Thread th2=new Thread(thread2);
		th2.setName("thread2");


		
		th2.start();
		th2.join();
		
		System.out.println("threads executed");
		
	}
}