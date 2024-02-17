package com.q3tech.SuperPower;

import java.util.Arrays;
import java.util.Scanner;

class ArrayCopyOf {

	public static void main(String[] args) {
		
		int a[] = new int[3];	

		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		int a2[] = Arrays.copyOf(a, 5);

		System.out.println("Data in Array2 ");
		
		for(int i=0; i< a.length; i++) {
		
			System.out.println(a2[i]);
		}		
		
	}
	
}
