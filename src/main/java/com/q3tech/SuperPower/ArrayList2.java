package com.q3tech.SuperPower;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Object> r1 = new ArrayList<>();
		
		r1.add(10);
		r1.add(11);
		r1.add("JaiShreeRam");
		r1.add("Gangwar");
		
		System.out.println(r1.size());
		
		Object[] obj = r1.toArray();
		
		for(int i=0; i<obj.length; i++) {
			
			System.out.println(obj[i]);
		};
		
	}
}
