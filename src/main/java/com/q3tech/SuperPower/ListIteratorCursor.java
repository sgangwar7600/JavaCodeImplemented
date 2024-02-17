package com.q3tech.SuperPower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorCursor {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		al.add("ddd");
		al.add("eee");
		
		System.out.println(al);
		System.out.println("-----------------------------------------------------------------");

		
// forward direction -------------------------------------------------------------------------
		
		ListIterator<Object> li = al.listIterator();
		
		while(li.hasNext()) {
		
			System.out.println(li.next());
		}
		
		System.out.println("-----------------------------------------------------------------");
// backward direction -------------------------------------------------------------------------
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
		System.out.println("-----------------------------------------------------------------");

		
	}
}

