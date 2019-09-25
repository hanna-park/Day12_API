package com.pp.io.ex1;

import java.util.ArrayList;

public class WeatherView {
	
	/*public static void main(String[] args) {
		int [] a = {10,30,60,55};
		for(int ar: a) {
			System.out.println(ar);
		}
	}*/
	
	public void view(ArrayList<Weather> ar) {
		//향상된 for문
		//for(저장된 DataType 변수명 : 컬렉션의 변수명){}
		for(Weather weather:ar) {
			System.out.println(weather.getCity());
			System.out.println(weather.getGion());
			System.out.println(weather.getHumidity());
			System.out.println(weather.getStatus());
		}
		
		/*
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i).getCity());
			System.out.println(ar.get(i).getGion());
			System.out.println(ar.get(i).getHumidity());
			System.out.println(ar.get(i).getStatus());
			
		}*/
		
	}

}
