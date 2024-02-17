package com.q3tech.SuperPower;

import java.util.Arrays;

//	toString()		asList() 	deepToString() - all these methods are static methods, not dynamic of Array	 
class ArrayStaticMethods {
	
	public static void main(String[] args) {
		
		String a[] = {"Adam", "Jeremy","Sami", "Pascale", "James" };
		
		System.out.println("toString() method output----" + "  " + Arrays.toString(a));  // for single dimensional
		
		
		System.out.println("asList() method output----" + "  " + Arrays.asList(a));  // for single dimensional

		
		int arr[][] = {{10, 20}, {30, 40}};
		
		System.out.println("deepString method output----" + "  " + Arrays.deepToString(arr)); //for multidimensional
		
		
		int ari[] = {50, 80};

		System.out.println("asList() method output----" + "  " + Arrays.asList(ari)); //for multidimensional

	}

}
