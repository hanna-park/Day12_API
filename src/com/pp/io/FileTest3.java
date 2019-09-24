package com.pp.io;

import java.io.File;

public class FileTest3 {
	
	public static void main(String[] args) {
		File file = new File("C:\\Ppp\\test\\sub1");
		
		//String [] ar= file.list();
		File[] ar = file.listFiles();
		
		for(int i=0;i<ar.length;i++) {
			
			System.out.println(ar[i]);
			ar[i].delete();
			
		}
		
		
		
		file.delete();
		
	}

}
