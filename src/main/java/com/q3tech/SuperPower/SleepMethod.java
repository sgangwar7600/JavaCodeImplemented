package com.q3tech.SuperPower;

class AA extends Thread {
	
	public static synchronized void runn()  {
		
		String nn = Thread.currentThread().getName();
		for (int i =1; i<=3; i++) {
			System.out.println(nn);
			
			try {
			Thread.sleep(1000); // putting thread in tempopry waiting stage
			} 
			catch (InterruptedException e) {
			}
		}
	}
	public void run() {
		
		runn();
		
	}
}
class SleepMethod {

	public static void main(String[] args) {
		
		AA r1 = new AA();
		AA r2 = new AA();
		AA r3 = new AA();

		r1.setName("thread 1");
		r2.setName("thread 2");
		r3.setName("thread 3");
		
		r1.start();
		r2.start();
		r3.start();
		
	}
}
