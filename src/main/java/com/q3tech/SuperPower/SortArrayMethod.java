package com.q3tech.SuperPower;

import java.util.Arrays;
import java.util.Scanner;

class SortArrayMethod {

	public static void main(String[] args) {
		
		int a[] = new int[5];	
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		Arrays.sort(a);
		
		for (int i=0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");	
		}
	}
	
}
