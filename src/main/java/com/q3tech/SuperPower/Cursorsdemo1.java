package com.q3tech.SuperPower;

import java.util.ArrayList;
import java.util.Iterator;

public class Cursorsdemo1 {

	public static void main(String[] args) {
		
		ArrayList<Object> all = new ArrayList<>();
		
		all.add("aaa");
		all.add("bbb");
		all.add("ccc");
		all.add("ddd");
		all.add("eee");

		System.out.println(all);
		
		Iterator<Object> itr = all.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
			String element = (String)itr.next();
			if (element.equals("bbb")) {
				
				itr.remove();
				System.out.println("elemet removed successfully");
			}
			else {
				all.add(element);
			}
			
			
		}
		
		System.out.println(all);
		
	}
}

