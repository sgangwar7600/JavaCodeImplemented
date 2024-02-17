package com.q3tech.SuperPower;


class p11 extends Thread {
	
	public   void run() {
	try {
				
				for(int i=1; i<=5; i++) {
					
					System.out.println("t1 thread running");
					Thread.sleep(1000);
				} }
				
				catch(InterruptedException i) {
				System.out.println("t1 thread terminated");
			}
		}
	}
public class InterruptThreadMethod {

	public static void main(String[] args) {
		p11 r1 = new p11();
		
	r1.start();

	r1.interrupt();
	}
	
}

