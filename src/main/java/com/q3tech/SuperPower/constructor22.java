package com.q3tech.SuperPower;

class classname {
	
	int j; String k;
	
	classname(int a, String b) {
		
		 j = a;
		 k = b;
		
		System.out.println(j + k);
	}
	
	classname(int a, int b) {
		
	System.out.println(a + " "+ b);
	}
	
	void method2(){
		
		System.out.println(j + "  " + k);	}	
}
public class constructor22 {

	public static void main(String[] args) {
		
		classname d = new classname(100, "  Gangs");
		
		classname e = new classname(100, 120);
		
		d.method2();
		
	}
}

