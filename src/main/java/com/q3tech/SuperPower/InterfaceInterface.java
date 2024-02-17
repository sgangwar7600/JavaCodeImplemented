package com.q3tech.SuperPower;

interface AX {
	
	void a1();								// public + abstract
	
	void a2();								// public + abstract
	
	default void a3() {
		
		System.out.println("may or may not override");
		System.out.println("============================================================================== ");
		System.out.println("============================================================================== ");

	}
}

class BX implements AX {
	
	public void a1() {
		
		System.out.println("class one ");
	};
	
	public void a2() {
		
		System.out.println("class two ");
		
	}
	
}


class BXX implements AX {
	
	public void a1() {
		
		System.out.println("class three ");
	};
	
	public void a2() {
		
		System.out.println("class four ");
	}
	
}



public class InterfaceInterface {
	
	public static void main(String[] args) {
		 
		BX l = new BX();
		
		l.a1();
		l.a2();
		l.a3();
		
		BXX ll = new BXX();
		
		ll.a1();
		ll.a2();
		ll.a3();
		
		
	}
}
