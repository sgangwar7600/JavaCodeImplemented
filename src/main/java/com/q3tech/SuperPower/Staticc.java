package com.q3tech.SuperPower;


class KK {
	
	int salary;
	String name;
	static String place = "Nawabganj";
	
	KK(int salary, String name) {
		
		this.salary = salary;
		this.name = name;
		//this.place = place;
		
	}
	
	void jk () {
		
		System.out.println(salary + "  " + name + "  "  +  place);
	}
	
}
public class Staticc {
	
	public static void main(String[] args) {
		
		KK dk = new KK(101, "Ravikant");
		dk.jk();
		
		KK dk1 = new KK(102 , "MoolChand");
		dk1.jk();
		
		KK dk2 = new KK(102 , "Maheshwari devi");
		dk2.jk();
		
		
		
	}
	
}
