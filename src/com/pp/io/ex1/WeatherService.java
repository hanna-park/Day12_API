package com.pp.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;


import com.pp.io.ex1.Weather;

public class WeatherService {
	
	public ArrayList<Weather> init() {
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		
		
		//HashMap<String, Weather> map =new HashMap<String, Weather>();
		
		ArrayList<Weather> ar = new ArrayList<Weather>();
		File f = new File("c:\\Ppp\\test","weatherInfo.txt");
		FileReader fr =null;
		BufferedReader br =null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String str= null;
			//while((str= br.readLine())!=null) { 지워도 한 번만 돔
				
				//str =str.replace(" ", "");
				
				StringTokenizer st = new StringTokenizer(str,",");
				
				//while(st.hasMoreTokens()) {
					Weather weather = new Weather();
					weather.setCity(st.nextToken().trim()); //trim 앞뒤 공백 제거
					weather.setGion(Double.parseDouble(st.nextToken().trim()));
					weather.setHumidity(Integer.parseInt(st.nextToken().trim()));
					weather.setStatus(st.nextToken().trim());
					ar.add(weather);
					
					//System.out.println(weather.getCity());
					//System.out.println(weather.getGion());
					//System.out.println(weather.getHumidity());
					//System.out.println(weather.getStatus());
				//}		
			
				/*for(int i=0;i<ar.size();i++) {
					System.out.println(ar.get(i).getCity());
					System.out.println(ar.get(i).getGion());
					System.out.println(ar.get(i).getHumidity());
					System.out.println(ar.get(i).getStatus());
					
				}
				*/
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
			
		
	return ar;	
	}
	
	
	
}
