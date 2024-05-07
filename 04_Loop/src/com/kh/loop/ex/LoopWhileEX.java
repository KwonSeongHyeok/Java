package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	
	/*
	 public static void 작성하고 싶은 이름() {
	 }
	 
	  - public -
	 public -> 어디서든 접근 가능한 : 전체공개
	 protected -> 같은 폴더 안에서만 접근 가능
	 default -> 같은 폴더 안에서 접근 가능
	 			protected보다 제한되게 접근 가능
	 private -> 한 class안에서만 접근 가능
	 			작성한 공간 안에서만 접근 가능

	  - void - 
	 void -> 반환하는 것 없이 바로 출력이 될 때 사용
	 * */
	
	
	
	/*
	 while문을 사용해서
	 4번을 누르면 프로그램을 종료하는 코드를 작성하기
	 * */
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==========[메뉴판]==========");
			System.out.println("1.아메리카노 2.카페라떼 3.녹차 4.주문취소");
			System.out.print("메뉴를 입력해 주세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("아메리카노");
				break;
			case 2 :
				System.out.println("카페라떼");
				break;
			case 3 :
				System.out.println("녹차");
				break;
			case 4 :
				System.out.println("주문취소");
				return;
			default :
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}
	}
	
	
	public static void kh카페() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kh카페에 오신걸 환영합니다. ^^*\n"
					+ "원하는 메뉴를 입력해주세요.\n"
					+ "1.아메리카노 2.카페라떼 3.녹차 4.흑당버블티 5. 주문취소");
			String menu = sc.next();
			
			switch(menu) {
			case "1" : case "아메리카노" : case "1.아메리카노" :
				System.out.println("아메리카노 주문 추가되었습니다.");
				break;
			case "2" : case "카페라떼" : case "2.카페라떼" :
				System.out.println("카페라떼 주문 추가되었습니다.");
				break;
			case "3" : case "녹차" : case "3.녹차" :
				System.out.println("녹차 주문 추가되었습니다.");
				break;
			case "4" : case "흑당버블티" : case "4.흑당버블티" :
				System.out.println("흑당버블티 주문 추가되었습니다.");
				break;
			case "5" : case "주문취소" : case "5.주문취소" :
				System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
				return;
			default :
				System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	
	public static void getMoney() {
		// 커피 10잔 커피값 300원
		int coffee = 10;
		int  money = 300;
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			coffee--;
			System.out.println("남은 커피의 양은 " + coffee + "잔 입니다.");
			// 커피가 모두 소진됐자면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	// 1부터 5까지 숫자를 출력
	public static void allNumber() {
		int num = 1;
		
		while(num <= 5) {
			System.out.println(num);
			num++;
		}
	}
	
	// 10번 찍어서 안넘어가는 나무 없습니다.~!
	// 나무를 10번찍으면 나무 넘기기
	public static void tree() {
		// 나무를 찍기전이기 때문에 공격 0
		int hit = 0;
		
		while(hit < 10) {
			// 나무를 몇번 찍었는지 확인
			hit++; // 나무 1번 찍을 때마다 hit = hit + 1;
			System.out.println("나무를 " + hit + "번 찍었습니다.");
			// 만약에 나무를 공격한 수가 10번이 되면 나무 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다~~!!!!! 성공.");
			}
		}

	}
	
	
	/*
	 사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
	 단 입력한 수를 1보다 크거나 같아야 함
	 만약에 1 미만의 숫자가 입력됐자면 1이상의 숫자를 입력해주세요 출력하기
	 * */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0보다 큰 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		} else {
			System.out.println("1부터 " + num + "까지의 숫자들");
		}
		
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}


	
	// 커피가 100원 돈이 없으면 커피를 구매하지 못하는 경우
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.print("현재 가진 돈을 입력해주세요 : ");
		// 커피가격 coffeePrice
		int coffeePrice = 100;
		// 현재 가지고 있는 금액 입력
		int money = sc.nextInt();
		
		// 만약에 가지고 있는 돈이 커피값보다 적음
		while(money < coffeePrice) {
			System.out.println("돈이 부족합니다.\n"
							 + "커피를 구매하기 위해 더 많은 돈을 넣어주세요");
			System.out.print("현재 가진 돈을 다시 입력해주세요 : ");
			money = sc.nextInt();
		}
		//int remain = money - coffeePrice;
		System.out.println("커피를 구매했습니다.\n"
						 + "거스름돈은 "+ (money - coffeePrice) +"원 입니다.");
	}

	
	// 10000원 이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
	public static void iLovePork() {
		System.out.println("안녕하세요. 탕수육점입니다.");
		Scanner sc = new Scanner(System.in);
		
		int tangsuyuk = 10000;
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int myMoney = sc.nextInt();
		
		while (myMoney < tangsuyuk) {
			System.out.print("잔액이 부족합니다\n"
					+ "다시 입금해주세요 : ");
			myMoney = sc.nextInt();
		}
		System.out.println("주문이 완료되었습니다.\n"
				+ "현재 잔액은" + (myMoney - tangsuyuk) + "원 입니다.");
		
		
		// 돈이 10000원 이상이면 주문이 완료되었ㅅ브니다.
		// 현재 잔액을 00입니다.
	}
	
	
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		iLovePork();
	}

}
