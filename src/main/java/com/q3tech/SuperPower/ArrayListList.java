package com.q3tech.SuperPower;

import java.util.ArrayList;

public class ArrayListList {

	public static void main(String[] args) {
		
		ArrayList<Object> all = new ArrayList<Object>();
		all.add(10);
		all.add(12);
		all.add(15);
		all.add("deepak");
		all.add(20);
		
		System.out.println(all);
		
		System.out.println(all.get(2));
		
		all.set(2, 101);
		
		System.out.println(all.get(2));

		int a = all.indexOf("deepak");
		
		int b = all.indexOf(20);

		System.out.println(a);
		System.out.println(b);

	}
}
