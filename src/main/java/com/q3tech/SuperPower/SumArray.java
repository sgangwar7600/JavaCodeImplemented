package com.q3tech.SuperPower;

import java.util.Scanner;

class SumArray {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		int Sum=0;
		
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		System.out.println("first Array elemets  ");
		
		for (int i=0; i<a.length; i++) {
			
			Sum = a[i] + Sum;
			
			System.out.print(a[i] + " ");
			
		}
		System.out.println("\nAddition of elements  " + Sum);

	}
	
	
}
