package com.pp.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTest1 {
	
	public static void main(String[] args) {
		String str = "iu";
		File file = new File("C:\\Ppp\\test","t1.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file,false);
			fw.write(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
