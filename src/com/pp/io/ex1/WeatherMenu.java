package com.pp.io.ex1;

import java.util.Scanner;

import com.pp.io.ex1.WeatherService;

public class WeatherMenu {

	
	public void start() {
		//1. 날씨 정보 초기화
		//2. 날씨 정보 전체 출력 WeatherView view 호출
		//3. 날씨 검색 출력
		//4. 날씨 정보 추가
		//5. 날씨 정보 삭제
		//6. 종료
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		WeatherService ws = new WeatherService();
		
		while(check) {
			
			System.out.println("1. 날씨 정보 초기화");
			System.out.println("2. 날씨 정보 전체 출력");
			System.out.println("3. 날씨 검색 출력");
			System.out.println("4. 날씨 정보 추가");
			System.out.println("5. 날씨 정보 삭제");
			System.out.println("6. 프로그램 종료");
			
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					ws.init();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					check = !check;
					break;
			
			}
			
			
		}
		
		
	}

	
}
