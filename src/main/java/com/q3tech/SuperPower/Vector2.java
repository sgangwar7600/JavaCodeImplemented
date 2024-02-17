package com.q3tech.SuperPower;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>(7);
		
		System.out.println(v.capacity());
		
		for(int i=0; i<15; i++) {

		v.addElement(i);
			
		}
		System.out.println(v);
		
		System.out.println(v.capacity());
	}
}
