package com.q3tech.SuperPower;

public class overloadingg {

	
	void savage() {
		
		int a = 10; int b = 15;
		
		int c= a+b;
		
		System.out.println(c);
		
	}
	
	void savage(int z, double x) {
		
		double q= z+x;
		
		System.out.println(q);
	}
	
void savage(int m, int n, int g) {
		
		int qq= m+n+g;
		
		System.out.println(qq);
	}
	
	
	public static void main(String[] args) {
		
		overloadingg op = new overloadingg();
		op.savage();
		op.savage(10, 50.1);
		op.savage(11, 12, 13);

		
	}
}
