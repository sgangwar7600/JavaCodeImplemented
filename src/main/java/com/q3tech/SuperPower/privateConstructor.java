package com.q3tech.SuperPower;

public class privateConstructor {
	
	int a; double b; String c;
	
	privateConstructor() {
		
		a = 10; b=30.5; c="ankit";
		
		System.out.println(a + " " + b + " " + c + " ");
		
	}
	
	
	public static void main (String[] args) {
		
		privateConstructor d = new privateConstructor();
		
	}
}
