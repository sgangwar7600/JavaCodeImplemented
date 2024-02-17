package com.q3tech.SuperPower;
@SuppressWarnings("removal")


public class WrappeRClass {

	public static void main(String[] args) {
		
	int a = 10;     // primitive data type
	Integer b = new Integer(a);  //boxing, Integer is a wrapping class ,  convert from primitive to object
	
	
	//Integer b = new Integer(a);   // object
	int k = b.intValue();  // unboxing , convert from object to primitive  
	
	Integer p = a;  // auto boxing
	
	int o = p;   // auto unboxing
	
	String str = "123";
	int num = Integer.parseInt(str);
	
	
	
	System.out.println(num);
	
	}
	
	
}
