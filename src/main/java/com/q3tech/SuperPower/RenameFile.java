package com.q3tech.SuperPower;
import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		
		File hh = new File("C:\\fileJAVA\\aaaa.txt") ;
		
		File hh1 = new File("C:\\fileJAVA\\ff.txt");
		
		boolean kd = hh.renameTo((hh1));
		
		if (kd == true) {
			System.out.println("success");
		} 
		else {
			System.out.println("failed");
		}
		
		
	}
}
