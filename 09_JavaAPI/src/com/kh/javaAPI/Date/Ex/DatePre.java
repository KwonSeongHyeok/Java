package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		
		// 1. yyyy-MM-dd
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 날짜11 = 날짜1.format(date);
		System.out.println(날짜11);
		
		// 2. HH:mm:ss
		SimpleDateFormat 날짜2 = new SimpleDateFormat("HH:mm:ss");
		String 날짜22 = 날짜2.format(date);
		System.out.println(날짜22);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜33 = 날짜3.format(date);
		System.out.println(날짜33);
		
		// 4. SipleDateFormat 날짜 3 = E를 사용해서 요일 나타내기
		SimpleDateFormat 날짜4 = new SimpleDateFormat("EEEE");
		String 날짜44 = 날짜4.format(date);
		System.out.println("오늘의 요일 : " + 날짜44);
				


	}

}
