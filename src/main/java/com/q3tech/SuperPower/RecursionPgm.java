package com.q3tech.SuperPower;


public class RecursionPgm {

	public static void main(String[] args) {
	
		RecursionPgm mm = new RecursionPgm();
		int a = mm.sum(10);    //calling 
		
		System.out.println("sum of n natural number  " + a );
		
	}
		 int sum(int b) {
			 
			 if(b>0) {
				 
				return b+sum(b-1);  // calling
				 
			 } else {
				 return 0;
			 }
		 }

}
