package com.q3tech.SuperPower;


class pp extends Thread {
	
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
public class StopThreadMethod {

	public static void main(String[] args) {
		pp r1 = new pp();
		pp r2 =  new pp();
		pp r3 = new pp();
	
	r1.setName("thread1_1");
	r2.setName("thread_2");
	r3.setName("thread_3");
	
	r1.start();
	r2.start();
	r3.start();
	
	r2.stop();
	r2.resume(); // resume method will not work incase of stop method
	
	}}