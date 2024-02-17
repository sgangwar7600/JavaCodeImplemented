package com.q3tech.SuperPower;
import java.io.File;

public class ReadOnlyDemo {

	public static void main(String[] args) {
		File gg = new File("C:\\fileJAVA\\aaaa.txt");
		
		boolean kk = gg.setReadOnly();
		
		boolean jj = gg.canRead();
		
		boolean oo = gg.canWrite();
		
//**************************************************************************************************************	
//**************************************************************************************************************	
		if(kk==true) {
			System.out.println("read already");
		} 
		else {
			System.out.println("not read");
		}
		
//**************************************************************************************************************	
//**************************************************************************************************************	
		
		if(jj==true) {
			System.out.println("read already");
		} 
		else {
			System.out.println("not read");
		}

//**************************************************************************************************************	
//**************************************************************************************************************	

		if(oo==true) {
			System.out.println("read already");
		} 
		else {
			System.out.println("not read");
		}
	}
}
