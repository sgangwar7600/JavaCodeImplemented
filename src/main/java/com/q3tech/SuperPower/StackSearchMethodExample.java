package com.q3tech.SuperPower;

import java.util.Stack;  

public class StackSearchMethodExample {

	public static void main(String[] args)   
	{  
	Stack<String> stk= new Stack<>();  
	//pushing elements into Stack  
	stk.push("Mac Book");  
	stk.push("HP");  
	stk.push("DELL");  
	stk.push("Asus");  
	System.out.println("Stack: " + stk);  
	// Search an element  
	int location = stk.search("HP");  
	int location1 = stk.search("DELL");  
	int location2 = stk.search("Asus");  
	int location3 = stk.search("Mac Book");  

	System.out.println("Location of Dell: " + location);  
	System.out.println("Location of Dell: " + location1);  
	System.out.println("Location of Dell: " + location2);  
	System.out.println("Location of Dell: " + location3);  

	}  
	}  
	

