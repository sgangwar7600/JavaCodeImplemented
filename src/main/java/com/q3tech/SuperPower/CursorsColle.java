package com.q3tech.SuperPower;

import java.util.ArrayList;

public class CursorsColle {

	String name;
	int id;
	
	 public String toString() {
		
		return name + " " + id;
	}
	
	public static void main(String[] args) {
		
		CursorsColle t1 = new CursorsColle();
		t1.name="Sam";
		t1.id = 101;
		
		System.out.println(t1);
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		
		System.out.println(al);  	// o/p =  [aaa, bbb, ccc, ddd]

	}
}
