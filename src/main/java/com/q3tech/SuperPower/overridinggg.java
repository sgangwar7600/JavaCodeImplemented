package com.q3tech.SuperPower;


class classNamee {
	
	void methodd() {
		
		System.out.println("1");
	}
}

class B extends classNamee {
	
	@Override
	void methodd() {
		
		System.out.println("2");
	}
}

public class overridinggg   {
	
	public static void main(String[] args) {
		
		classNamee aa = new B();
		aa.methodd();
		
	}
}
