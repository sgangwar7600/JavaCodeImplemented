package com.q3tech.SuperPower;

import java.util.Vector;


public class Vector3 {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>(8, 2);
		
		System.out.println(v.capacity());
		
		for(int i=0; i<13; i++) {

		v.addElement(i);
			
		}
		System.out.println(v);
		
		System.out.println(v.capacity());
	}
}
