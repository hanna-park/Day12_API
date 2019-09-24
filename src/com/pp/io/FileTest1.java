package com.pp.io;

import java.io.File;

public class FileTest1 {
	
	public static void main(String[] args) {
		File f = new File("C:\\Ppp\\test");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		f = new File("C:\\Ppp\\test\\t1");
		if(!f.exists()) {
			f.mkdir();
		}
		
		f= new File("C:\\Ppp\\test","sub1.txt");
		System.out.println(f.isFile());
		f.delete();
	}

}
