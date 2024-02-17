package com.q3tech.SuperPower;

import java.util.ArrayList;

public class ArrayListEmpty {

	public static void main(String[] args) {
		
		ArrayList<Object> r2 = new ArrayList<Object>();
		r2.add(10);
		r2.add("RAM");
		r2.add("Adam");
		r2.add(11);
		//System.out.println(r2);
		
		//System.out.println(r2.isEmpty());
		//r2.clear();
		//System.out.println(r2.isEmpty());
		//System.out.println(r2.contains(15));
		//r2.remove(1);
		//r2.removeAll(r2);
		//System.out.println(r2);
		//r2.retainAll(r2);
		//System.out.println(r2.retainAll(r2));
		
		r2.add(4, 11);
		r2.add(5, "Jeremy");
		r2.add("Nicolus");
		r2.add(11);
		
		System.out.println(r2);

		
		
		
	}
	
}

