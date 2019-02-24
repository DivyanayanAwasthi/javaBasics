package com.Threads;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		
		Thread1 t=new Thread1();
		t.setName("thread1");
		t.start();
		try {
			t.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0;i<100;i++) {
			
			
			System.out.println(i+"--"+Thread.currentThread().getName());
		}
	}

}
