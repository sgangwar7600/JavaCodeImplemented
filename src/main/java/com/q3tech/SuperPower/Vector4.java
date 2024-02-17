package com.q3tech.SuperPower;

import java.util.Vector;


public class Vector4 {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		System.out.println(v.capacity());
		
		for(int i=0; i<=12; i++) {

		v.addElement(i);
			
		}
		
		System.out.println(v.firstElement());                          //0
		System.out.println(v.lastElement());                           //12
		System.out.println(v.removeElement(5));                        //true
		v.removeAllElements();
		
		System.out.println(v);
		//System.out.println(v);
		
		//System.out.println(v.capacity());
	}
}
