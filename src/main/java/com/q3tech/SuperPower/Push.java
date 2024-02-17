package com.q3tech.SuperPower;

import java.util.Stack;


 public class Push {
	
	public static void main(String[] args) {
		
		Stack<Object> t1 = new Stack<Object>();
		
		t1.push("a");
		t1.push("b");	
		t1.push("c");
		t1.push("d");
		t1.push("e");
		t1.push("f");
		t1.push("g");
		t1.push("h");

		
		System.out.println(t1);
		//System.out.println(t1.peek());
		//System.out.println(t1.pop());
		
		System.out.println(t1.search("c"));
		System.out.println(t1.search("d"));
		System.out.println(t1.search("e"));
		System.out.println(t1.search("f"));
		System.out.println(t1.search("a"));
		System.out.println(t1.search("b"));

		


	}

}
