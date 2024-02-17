package com.q3tech.SuperPower;

import java.util.Scanner;

// nextInt() -- scanner class having nextInt() method to put integer values along with integer variable
// In dynamic array, you can increase or decrease the size of array accordingly
class DynamicArray {

	public static void main(String[] args)  {
		int size, i ;
		
		Scanner rr = new Scanner(System.in);
		System.out.println("enter size of array");
		size = rr.nextInt();
		int a[] = new int[size];
		
		for(i=0; i<size; i++) {
			a[i] = rr.nextInt();
		}
		System.out.println("Printed Array Elements");
		
		for(i=0; i<size; i++) {
			System.out.println(a[i] + " ");
		}
		
	}
}
