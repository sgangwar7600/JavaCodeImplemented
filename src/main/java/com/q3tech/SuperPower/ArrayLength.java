package com.q3tech.SuperPower;

//base index of array is 0.

import java.util.Scanner;

class ArrayLength {

	public static void main(String[] args) {
		
		int a[] = new int[2];
		
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		System.out.println("Array elemets  ");
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println(a[i] + " ");
		}
		
		System.out.println("\nArray Length  "  +  " " + a.length);
	}
	
	
}
