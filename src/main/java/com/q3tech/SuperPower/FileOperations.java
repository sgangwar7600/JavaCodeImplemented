package com.q3tech.SuperPower;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\fileJAVA\\aaaa.txt");
		boolean b = f.createNewFile();
		
		if(b==true) {
		System.out.println("file created successfully");
		} 
		else {
			System.out.println("file not created due to some error");
		}
		
	}
	
	
}
