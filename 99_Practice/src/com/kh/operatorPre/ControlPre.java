package com.kh.operatorPre;
//99_Practice

import java.util.Scanner;

//잘라내기(ctrl + x)  복사(ctrl + c)  붙여넣기(ctrl + v)
public class ControlPre {
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
		//practice4();
		//practice5();
	}
	
	// 실습문제 1번 홀수 짝수 나타내기
	public static void practice1() {
		// 키보드로 입력받은 정수가 양수이면서 짝수일 때만 짝수입니다. 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt(); // 키보드로 숫자 입력받기
		
		if(number > 0) { // 입력받은 숫자가 양수일 경우에만 홀짝 실행하기
			if(number % 2 == 0) { // 숫자가 짝수일 경우 출력하기
				System.out.println("짝수입니다.");
			} else {			  // 숫자가 홀수일 경우 출력하기
				System.out.println("홀수입니다.");
			}
		} else {		// 입력받은 숫자가 음수일 경우 출력하기
			System.out.println("양수만 입력해 주세요.");
		}
	//-------------------------------------------------------		
		/*if (num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else if (num > 0 && num % 2 == 1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("양수만 입력해주세요.");
		}*/
	//-------------------------------------------------------		
		/*String result;
		
		if (num > 0 && num % 2 == 0) {
			result = "짝수입니다.";
		} else if(num > 0 && num % 2 == 1) {
			result = "홀수입니다.";
		} else {
			result = "양수만 입력해주세요.";
		}
		System.out.println(result);
		*/
	}

	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		// 합계와 평균 계산
		int totalScore = korean + english + math;
		double averageScore = (double)totalScore / 3.0;
		// 합격 여부 판별
		// 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
		if(korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
			System.out.println("국어 점수 : " + korean);
			System.out.println("영어 점수 : " + english);
			System.out.println("수학 점수 : " + math);
			System.out.println("합	 계 : " + totalScore);
			System.out.println("평	 균 : " + averageScore);
			
			System.out.println("축하합니다. 합격입니다!!!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	// -----------------------------------------------------	
		/*
		System.out.print("국어점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double ave = sum / 3.0;
		
		if(ave < 60.0 || korean < 40 || english < 40 || math < 40) {
			System.out.println("불합격입니다.");
		} else {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ave);
			System.out.println("축하합니다, 합격입니다!");
		}
		*/
	}

		
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt(); // 키보드로 입력한 달

		int daysMonth; // 해당하는 달의 일수
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
				daysMonth = 31;
				break;
			case 2 :
				daysMonth = 28;
				break;
			case 4 : case 6 : case 9 : case 11 :
				daysMonth = 30;
				break;
			default :
				System.out.println(month + "월은 존재하지 않는 달입니다.");
				// daysMonth = 0;
				return;
		}
		System.out.println(month + "월은 " + daysMonth + "일까지 있습니다.");
	
		//------------------------------------------------
		/*
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		String result;
		
		if (month == 2) {
			result = "2월은 28일까지 있습니다.";
		} else if(month == 1 || month == 3 || month == 5 ||
				  month == 7 || month == 8 || month ==10 || month == 12) {
			result = month + "월은 31일까지 있습니다";
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			result = month + "월은 30일까지 있습니다";
		} else {
			result = month + "월은 잘못 입력된 달입니다.";
		}
		System.out.println(result);
		*/
	}

	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		//키와 몸무게 입력 받기
		System.out.print("키(m)를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력하세요 : ");
		double weight = sc.nextDouble();
		
		// BMI 계산
		double bmi = weight / (height * height);
		
		// BMI 지수에 따라 결과 출력
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과제중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
	//------------------------------------------------------	
		/*
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result;
		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		*/
	}
	
	
	public static void practice5() {
		// 중간 기말 과제 출석 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 점수 : ");
		double mid = sc.nextDouble();
		System.out.print("기말 점수 : ");
		double fin = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double assig = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		// 출석 비율 계산
		double attendPer = attend / 20 * 100;
		// attend / 20 = 출석한 횟구를 전체 강의 횟수로 나눠서 출석 비율을 계산
		// double 소수점 밑에 있는 수까지 얻어옴
		// 실수로 된 값을 100을 곱해서 백분율로 변환
		
		// 평가 비율에 따른 총점 계산
		// 중간 20 기말 30 과제 30 출석 20 = 100점
		// 중간 점수 20
		double midScore = mid * 0.2;
		// 기말 점수 30
		double fiScore = fin * 0.3; // 100점 만점에서 30%
		// 과제
		double asScore = assig * 0.3;
		// 출석 점수 20
		double attendScore = attendPer * 0.2; // 100점 만점에서 0.2
		double totalScore = midScore + fiScore + asScore + attendScore;

		// 평가에 따른 Pass 또는 Fail 출력
		if(totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("=========== 결과 ==========");
		System.out.println("중간고사 점수(20점 만점) : " + midScore);
		System.out.println("기말고사 점수(30점 만점) : " + fiScore);
		System.out.println("과	제 점수(30점 만점) : " + asScore);
		System.out.println("출	석 점수(20점 만점) : " + attendScore);
		System.out.println("총              점  : " + totalScore);
		
	//------------------------------------------------------
		/*
		System.out.print("중간 고사 점수 : ");
		int mScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hScore = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int att = sc.nextInt();
		
		double 중간 = mScore * 0.2;
		double 기말 = fScore * 0.3;
		double 과제 = hScore * 0.3;
		double 출석 = att;
		double sum = 중간 + 기말 + 과제 + 출석;
		
		System.out.println("============== 결과 ==============");
		
		if(출석 < 20 * 0.7) {
			System.out.println("Fail [출석 횟수 부족 (" + att + "/20)]");
		} else if (sum < 70) {
			System.out.println("Fail [점수 미달]");
		} else {
		System.out.println("중간 고사 점수(20) : " + 중간);
		System.out.println("기말 고사 점수(30) : " + 기말);
		System.out.println("과제		점수(20) : " + 과제);
		System.out.println("출석		점수(20) : " + 출석);
		System.out.println("총점 : " + sum);
		System.out.println("PASS");
		}
		*/
	}
}
