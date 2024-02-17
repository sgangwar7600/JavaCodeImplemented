package com.q3tech.SuperPower;

public class Stackk {
	
	void m1() {
		
		System.out.println("m1 method");
		m3();
		System.out.println("m1");
		
	}
	
	void m2() {
		
		System.out.println("m2 method");
		m1();
		System.out.println("m2 ");

	}
	
	void m3() {
		
		System.out.println("m3 method");
		System.out.println("m3 ");

	}


	public static void main(String[] args) {
		
		Stackk p1 = new Stackk();
		p1.m2();
		
	}
}
