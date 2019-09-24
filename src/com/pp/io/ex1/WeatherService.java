package com.pp.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import com.pp.io.ex1.Weather;

public class WeatherService {

	public HashMap<String, Weather> init() {
		//날씨 정보 초기화
		//weatherInfo.txt 읽어서
		//파싱, 객체를 모아서 리턴
		HashMap<String, Weather> map =new HashMap<String, Weather>();
		
		File f = new File("c:\\Ppp\\test","weatherInfo.txt");
		FileReader fr =null;
		BufferedReader br =null;
		String str ="";
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			boolean check =true;
			
			while(check) {
				str = br.readLine();
				if(str==null) {
					break;
					
				}
				
				
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		StringTokenizer st = new StringTokenizer(str,",");
		
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			weather.setCity(st.nextToken());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			map.put(weather.getCity(), weather);
		}
		
		
		
	return map;	
	}
	
}
