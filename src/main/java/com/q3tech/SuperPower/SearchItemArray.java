package com.q3tech.SuperPower;

import java.util.Scanner;

class SearchItemArray {

	public static void main(String[] args) {
		
		int a[] = new int[3];	
		int n; int count = 0;
		Scanner rr = new Scanner(System.in);
		System.out.println("Enters elements in Array ");
		
		
		for(int i=0; i< a.length; i++) {
			
			a[i] = rr.nextInt();
		}
		
		System.out.println("Array elements  ");
		for (int i=0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");	
		}
		
		
		System.out.println("\nEnters search elements ");
		n = rr.nextInt();
		for(int i=0; i<a.length; i++) 
		{
			if(a[i] == n) {
				count++;
			}}
		if(count>0)
			System.out.println("item found " + count + " times");
		else
			System.out.println("item not found");
	}
	
	
}
