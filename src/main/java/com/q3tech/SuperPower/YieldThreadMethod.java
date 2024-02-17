package com.q3tech.SuperPower;

//if any thread is waiting with same priority, then yield method will
//give the chance to run that waiting thread

class Yield1 extends Thread {
	
	public  void run() {
		
		String name2 = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			
			System.out.println(name2);
			Thread.yield();
		}
	}}
	
class Yield2  extends Thread {
		
	
	public  void run() {
		
		String name2 = Thread.currentThread().getName();
		
		for(int i=1; i<=3; i++) {
			
			System.out.println(name2);
		}

}}

 class YieldThreadMethod {

	public static void main(String[] args) {
		
		Yield1 pp1 = new Yield1();
		Yield2 pp2 = new Yield2();		
		
		pp1.start();
		pp2.start();		
	}
}
