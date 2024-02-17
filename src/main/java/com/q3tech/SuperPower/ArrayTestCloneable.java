package com.q3tech.SuperPower;

public class ArrayTestCloneable implements Cloneable {

		
		int i;
		String str;
		ArrayTestCloneable() {}
		
		ArrayTestCloneable(int i, String str) {
			
			this.i = i;
			this.str = str;

		}
		
		public static void main(String[] args) throws CloneNotSupportedException {
			
			ArrayTestCloneable t1 = new ArrayTestCloneable(10, "Jeremy");
			
			ArrayTestCloneable t2 = (ArrayTestCloneable)t1.clone();
						
			System.out.println(t2.i);
			
			System.out.println(t2.str);

		
	}
}

