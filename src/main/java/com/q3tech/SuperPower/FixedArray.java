package com.q3tech.SuperPower;

class FixedArray {

	public static void main(String[] args) {
		
		int a[] = new int[5]; // 5  representing that there are 5 array
	
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// a[5] = 60;  - throw ArrayIndexOutOfBoundsException
		
	//  i  -  presenting index of Array
		
		for(int i=0; i<=4 ; i++ ) {
			
			System.out.println(a[i]);
		}
	}
}






