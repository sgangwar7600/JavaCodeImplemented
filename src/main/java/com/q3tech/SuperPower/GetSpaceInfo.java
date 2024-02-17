package com.q3tech.SuperPower;

import java.io.File;

public class GetSpaceInfo {

	public static void main(String[] args) {
		
		File  d =  new  File("C:\\");
		
		long x = d.getFreeSpace();
		
		long y = d.getTotalSpace();
		
		System.out.println("free space - " + x/(1024*1021*1021)   );
		
		System.out.println("total free space - " + y/(1024*1021*1021)   );

	
	}
}
