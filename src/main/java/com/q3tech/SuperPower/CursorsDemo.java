package com.q3tech.SuperPower;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsDemo {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		v.addElement("aaa");
		v.addElement("bbb");
		v.addElement("ccc");
		v.addElement("ddd");

		Enumeration<Object> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println((e.nextElement()));
		}
		
	
	}
}
