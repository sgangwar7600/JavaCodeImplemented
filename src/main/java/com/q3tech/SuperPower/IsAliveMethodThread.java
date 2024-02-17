package com.q3tech.SuperPower;


class pp11 extends Thread {
	
	public  void run() {
					
			System.out.println("IsAlive method programme");
		}}


class IsAliveMethodThread {
	
	public static void main(String[] args) {
		
		pp11 a1 = new pp11();
		
		pp11 a2 = new pp11();
		
		System.out.println(a1.isAlive());
		a1.start();
		System.out.println(a1.isAlive());
		a2.start();
		System.out.println(a1.isAlive());

		
	}
}