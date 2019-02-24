package com.Threads;

public class Thread3 implements Runnable {

	@Override
	public void run() {
		
		for (int i=0;i<100;i++) {
			System.out.println(i+"--"+Thread.currentThread().getName());
		}
	}

}
