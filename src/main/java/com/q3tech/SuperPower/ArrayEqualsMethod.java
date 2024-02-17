package com.q3tech.SuperPower;

import java.util.Arrays;

class ArrayEqualsMethod {

	public static void main(String[] args) 
	{
		int a[] = {10,20,30};
		int b[] = {10,20,30};
		
		if(Arrays.equals(a,b)) 
		{
			System.out.println("both are equal ");
		}
		
		else 
		{
			System.out.println("both are not equal ");
		}
		
	}
}

