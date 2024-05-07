package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {

	public void practice1() {
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}
	
	
	public void practice2() {
	
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = num.length - i;
			System.out.print(num[i] + " ");
		}
		/*int num[] = new int[10];
		int j = 0;
		for(int i = num.length; i > 0; i--) {
				num[j] = i;
				System.out.print(num[j] + " ");
				j++;
		}*/
		
	}
	
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		// 입력 받은 정수 크기의 배열 생성
		
		int[] numbers = new int[size]; //size = 5
		//	numbers.length =   size  도 가능
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
		
		
		
		
		
		/*System.out.print("양의 정수 : ");
		int num[] = new int[sc.nextInt()];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.print(num[i] + " ");
		}*/
	}
	
	
	public void practice4() {
						//	0	   1	 2		3		 4	
		String fruits[] = {"사과", "귤", "포도", "복숭아", " 참외"};
		System.out.println(fruits[1]);
	}
	

	// int number[] = new int[5];
	// index 0부터 마지막숫자 -1	0 1 2 3 4 
	// lenght 5  1부터 길이를 보여줌
	public void practice6() {
		// 요일 생성
			// length	7    
			// index 	  0		1	 2	  3		4	 5	  6
		String week[] = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 ~ 6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	
	
	public void practice9() {
		
		// 길이가 7인 배열 생성
		int num[] = new int[7]; // index[0 1 2 3 4 5 6] length : 8

		
						// num의 최종 길이를 알기 위해서 num.length를 사용함
		for(int i = 0; i < num.length; i++) {
			// 랜덤으로 숫자 랜덤으로 숫자 출력하기
			// 랜덤으로 숫자를 출력하는 방법
			// 1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤을 사용
			// 2. Math 객체에서 random() 메서드를 사용 : 위 Random객체보다 작은 범위로 사용 가능			
			num[i] = (int)(Math.random() * 45 + 1); // 45	0~44 -> 1~45
			System.out.println("num[" + i + "] = " + num[i]);
		}
		
		
		/*int num[] = new int[6];
		
		Random ran = new Random();
		
		for(int i = 0; i < num.length; i++) {
			int randomNumber = ran.nextInt(45) + 1;
			num[i] = randomNumber;
			System.out.println(num[i]);
		}*/
	}
	
	
	

	public void practice17() {
		String menu[] = {"후라이드", "양념"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String want = sc.next();
		
		for(int i = 0; i < menu.length; i++) {
			if(want.equals(menu[i])) {
				System.out.println(menu[i] + "치킨 배달 가능");
				return;
			} 
		}
		System.out.println(want + "치킨은 없는 메뉴입니다.");
	}
	

	
	public void method1( ) {
		// 정수 1 2 3 10 20 30 출력하기
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		System.out.println("num[2] : " + num[2]);
		
		// 문자열 각 자리에 월 화 수 목 금 토 일
		// 각 자리에 어던 요일이 들어가 있는지 출력
		String str[] = {"월", "화", "수", "목", "금", "토", "일"};
		// for 문을 활용한 출력
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println("");
		
		// 실수 index 2 까지 만들어주고 출력  실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.print(dbl[i] + " ");	
		}
		System.out.println();
		
		// char 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
		
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		/*// for 문을 활용한 배열 출력하기
		int numbers[] = new int[5];
		
		// 1부터 4 까지 배열에 숫자를 넣기
		// index가 영부터 시작하기 때문에 i = 0
		// length = 길이 
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = i;
			
			System.out.println("numbers[" + i +"] : " + i);
		}*/
		
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice6();
		//ae2.practice9();
		//ae2.method1();
	}

}
