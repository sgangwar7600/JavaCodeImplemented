package com.q3tech.SuperPower;

import java.io.File;
import java.io.IOException;
public class DeleteFile {

	public static void main(String[] args) throws IOException {
		
		File fq = new File("C:\\fileJAVA\\aa.txt");
		boolean s = fq.delete();
		
		if ( s == true) {
			System.out.println("successfully deleted");
		} 
		else {
			System.out.println("not successfully deleted");

		}
	}
}


