package com.q3tech.SuperPower;

import java.util.Scanner;

class CopyPasteArray {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		int b[] = new int[3];

		
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		System.out.println("first Array elemets  ");
		
		for (int i=0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nSecond Array ");
		
		for(int i=0; i<a.length; i++ ) {
			b[i] = a[i];	
			System.out.print(b[i] + " ");
		}
	}
	
	
}
