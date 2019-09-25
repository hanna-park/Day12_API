package com.pp.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OutputTest2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		// c:\\Ppp\\test\\t2.txt
		// q나 Q를 입력하면 종료
		boolean check = true;
		
		while(check) {
			System.out.println("저장할 내용을 입력하세요.");
			str = sc.next();
			
			if(str.toUpperCase().equals("Q")) { //
				check= false;
				break;
			}
			
			File f = new File("C:\\Ppp\\test","t2.txt");
			FileWriter fw = null;
			
			try {
				
				fw = new FileWriter(f,true);
				fw.write(str+"\r\n"); // \r : 커서를 앞으로 \n : 엔터
				//fw.flush(); 버퍼를 강제로 비우세요
				
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

}
