package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat Ȱ���ؼ� ��¥�����
		
		// 1. yyyy-MM-dd
		SimpleDateFormat ��¥1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String ��¥11 = ��¥1.format(date);
		System.out.println(��¥11);
		
		// 2. HH:mm:ss
		SimpleDateFormat ��¥2 = new SimpleDateFormat("HH:mm:ss");
		String ��¥22 = ��¥2.format(date);
		System.out.println(��¥22);
		
		// 3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat ��¥3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ��¥33 = ��¥3.format(date);
		System.out.println(��¥33);
		
		// 4. SipleDateFormat ��¥ 3 = E�� ����ؼ� ���� ��Ÿ����
		SimpleDateFormat ��¥4 = new SimpleDateFormat("EEEE");
		String ��¥44 = ��¥4.format(date);
		System.out.println("������ ���� : " + ��¥44);
				


	}

}
