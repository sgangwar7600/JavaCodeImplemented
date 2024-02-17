package com.q3tech.SuperPower;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		File ff = new File("C:\\fileJAVA\\creatingFolderrrccccc");
		
		if(ff.mkdir()) {
			
			System.out.println("successfully folder created");
		} 
		
		else 
		{
			System.out.println("failed");
		}
	}
}
