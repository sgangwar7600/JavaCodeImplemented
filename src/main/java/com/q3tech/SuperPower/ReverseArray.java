package com.q3tech.SuperPower;

import java.util.Scanner;

class ReverseArray {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		System.out.println("Array elemets  ");
		
		for (int i=0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nArray in Revesre order");
		for(int i=a.length-1; i>=0; i-- ) {
			System.out.print(a[i] + " ");
			
		}
	}
	
	
}
