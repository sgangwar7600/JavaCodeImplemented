package com.q3tech.SuperPower;

import java.util.ArrayList;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		int[] are = new int[4];
		
		are[0] = 10;
		are[1] = 12;
		are[2] = 15;
		are[3] = 18;
		
		System.out.println(are);    	//oUtput - [I@515f550a
		
// ************************************************************************
		
		for(int i: are) {
			System.out.println(i);
		}									//oUtput -    10 12 15 18

//********************************************************************************************************
		for(int i=0; i<are.length; i++) {
			
			System.out.println(are[i]);
		}									//oUtput -    10 12 15 18
		
//**************************************************************************************************		
		
		ArrayList<Object> p = new ArrayList<Object>();
		
		p.add(80);
		p.add(90);
		p.add(100);		
		
		System.out.println(p);
		for (Object k : p) {
			System.out.println(k);
		}

//**************************************************************************************************		

		for (int i = 0; i<p.size(); i++) {
			System.out.println(p.get(i));
		}
		
	}
}

