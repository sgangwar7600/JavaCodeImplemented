package com.q3tech.SuperPower;

class BaseOfArray {
	
	//int rollno ;
	//int[] rollno ;
	
		public static void main(String[] args) {
		
			int[] a = new int[3];     // creation  //dynamic array
			
			a[0] = 10;
			a[1] = 20;
			a[2] = 30;
			
			int[] aa = {10, 20, 30};  //static array
			
			System.out.println("Array length : " + a.length );
			
			System.out.println("............................................");
			
			for(int i=0; i<a.length ; i++) {
				System.out.println(a[i]);
			}
		
	}
}
