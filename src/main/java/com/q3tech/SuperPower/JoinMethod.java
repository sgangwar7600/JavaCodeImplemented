package com.q3tech.SuperPower;

 class AAA extends Thread  {
	
	public static synchronized void runnn()  {
		
		String nnn = Thread.currentThread().getName();
		
		for (int i =1; i<=3; i++) {
			System.out.println(nnn);
			try { Thread.sleep(1000); }
			catch(InterruptedException e) {}
		}
	}
	public void run() {
		runnn();

	}	
}

public class JoinMethod  {

	public static void main(String[] args) {
		
		AAA r111 = new AAA();
		AAA r222= new AAA();
		AAA r333 = new AAA();
		
		r111.setName("Thread 1");
		r222.setName("thread 2");
		r333.setName("Thread 3");
		
		
		r111.start();
		r333.start();
		
		r222.start();
		
		try {r222.join();} catch(InterruptedException e) {};
		
				
	}
}
