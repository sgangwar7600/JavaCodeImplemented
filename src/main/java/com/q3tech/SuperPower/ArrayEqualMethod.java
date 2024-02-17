package com.q3tech.SuperPower;

import java.util.Arrays;
import java.util.Scanner;

class ArrayEqualMethod {

	public static void main(String[] args) {
		
		int a[] = new int[1];	
		int b[] = new int[1];	

		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		for(int i=0; i< a.length; i++) {
			
			b[i] = rr.nextInt();
		}		
		
		boolean c= Arrays.equals(a, b);
		System.out.println("Value  " + c);
	}
	
}
