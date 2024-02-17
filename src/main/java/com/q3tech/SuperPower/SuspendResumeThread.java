package com.q3tech.SuperPower;


class p extends Thread {
	
	public static synchronized void run1() {
		
		String name1 = Thread.currentThread().getName();
		for(int i=1; i<=3; i++) {
			
			System.out.println(i + "  " + name1);
		}
	}
	
	public void run() {
		run1();
	}
	
}
public class SuspendResumeThread {

	public static void main(String[] args) {
		p r1 = new p();
		p r2 =  new p();
		p r3 = new p();
	
	r1.setName("thread1_1");
	r2.setName("thread_2");
	r3.setName("thread_3");
	
	r1.start();
	r2.start();
	r3.start();
	
	
	r2.suspend();  //suspend
	
	r2.resume();  //resume
	
	
	
	}
	
}
