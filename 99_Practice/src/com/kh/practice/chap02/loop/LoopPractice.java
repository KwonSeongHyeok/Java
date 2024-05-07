package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 숫자가 1 미만일 경우 출력해주기
		if(num < 1) {
			System.out.println("1이상의 숫자를 입력해주세요.");
			return;
		}
		
		// 입력받은 숫자가 1 이상이면 1부터 입력받은 숫자까지 모두 출력해주기
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		// 마무리로 줄바꿈을 해주길 원한다면
		System.out.println(); // 줄바꿈 완성!
		
	}
	
	
	
	// 1미만의 숫자가 입력됐다면
	// 1 이상의 숫자를 입력해주세요가 출력되면서
	// 다시 사용자가 값을 입력하도록 하기
	public void practice2() {
		// 입력받기 위해서는 스캐너를 통해서 입력 받기
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.print("1 이상의 숫자를 다시 입력하세요 : ");
			} else {
				break;
			}
		}
		// 1부터 ~까지의 숫자들이 나왔는지 출력을 보고싶다면
		System.out.println("1부터 " + num + "까지의 숫자들");
		int i = 1;
		while(i <= num) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}
	
	
	public void practice3() {
		// 사용자로부터 한 개의 값을 입력받아
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** pratice 3 시작 ****");
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 이상의 숫자만 입력하세요");
			} else {
				break;
			}	
		}
		// 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		System.out.println(num + "부터 1까지의 숫자들을 거꾸로 출력합니다.");
		int i = 1;
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // 키보드로 입력받은 숫자에서 -1을 하면서 1이 될때 까지 출력
		}	
		// System.out.println();
	}
	
	
	public void practice4() {
		// 1 미만의 숫자가 입력되면 1이상의 숫자를 입력해주세요 출력되면서
		// 사용자가 값을 입력하도록 하기
		// 숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc = new Scanner(System.in);
		
		int num; // practice4 안에서 어디에서든 num을 알 수 있도록 바깥으로 호출해줌
		// do - while : 조건이 참이 아니어도 무조건 최초 1회는 실행
		do {
			System.out.print("숫자를 입력해 주세요 : ");
			num = sc.nextInt();
			// 1 미만의 숫자가 들어오면 ! 
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			// 조건에 관계없이 do로 인해 무조건 1회 실행되는 것이기 때문에 return이나 break를
			// 작성해주지 않아도 될 경우가 많음
			}
		} while(num < 1);
		
		// 만약에 1보다 커서 밑으로 내려온다면
		// num부터 1까지 거꾸로 출력해주는 for문 작성해주기
		for(int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	
	public void practice5() {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		// 입력 받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		// 숫자가 들어왔을 때 1부터 입력받은 숫자까지 더해서 총합 구하기
		for(int i = 1; i <= num; i++) {
			result += i;
			
			// 더해지는 숫자 출력하기
			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.print(result);
	}

	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		if(num1 < num2) {
			while(num1 <= num2) {
				System.out.print(num1 +" ");
				num1++;
			}
		} else if (num2 < num1) {
			while(num2 <= num1) {
				System.out.print(num2 +" ");
				num2++;
			}
		}
	}

	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int firstNum = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int secondNum = sc.nextInt();
			
			// 만약에 첫 번째 숫자와 두 번째 숫자 모두 1보다 크거나 같을 경우
			if(firstNum >= 1 && secondNum >= 1) {
				// 두 수를 비교해서 최소값 최대값 구하기
				// Math(수학 파일에서) 가장 작은 값을 찾는 min을 활용해서
				// 알아서 비교하고 작은 값을 구하게 하기
				// (   ,   ) 괄호 안에 숫자를 넣을 때 숫자 순서는 상관없음
				// Math에도 random이 있던데요 ?!
				// Random파일		Math.random파일
				// Math에 있는 random보다 Random에 있는 램덤 기능이 더
				// 많지만 둘 다 사용하는데 큰 차이는 없음
				int 최소값 = Math.min(firstNum, secondNum);
				int 최대값 = Math.max(firstNum, secondNum);
				
				for(int i = 최소값; i <= 최대값; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
					System.out.println("1 이상의 숫자를 입력해주세요");
				}
			}
		}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		// 두 정수와 연산기호를 받아서 계산하는 메서드
		// 연산의 경우에는 + - * / %
		String operator; // char operator -> charAt
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할 것");
			System.out.print("연산입력(+, -, *, /, %) : ");
			
			operator = sc.next();
			
			// 만약에 exit를 입력해서 프로그램 종료를 원할 경우
			// 문자열(String)으로 비교를 할 경우 equals(==)
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} 
				
			// 정수 1과 정수 2를 입력받아서 계산하기
			System.out.print("정수1 : ");
			int 정수1 = sc.nextInt();
			System.out.print("정수2 : ");
			int 정수2 = sc.nextInt();
			
			// 정수1과 정수2 계산에 대한 결과(=result)
			int 결과;
			
			// switch case "+"
			if(operator.equals("+")) {
				결과 = 정수1 + 정수2;
			} else if(operator.equals("-")) {
				결과 = 정수1 - 정수2;
			} else if(operator.equals("*")) {
				결과 = 정수1 * 정수2;
			} else if(operator.equals("/")) {
				// 몫 같은 경우에는 0으로 나눌 수 없기 때문에 정수2는 0이 될 수 없음.
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					continue;
				}
				결과 = 정수1 / 정수2;
			} else if(operator.equals("%")) {
				// 나머지 경우 0으로 나눌 수 없기 때문에 정수2는 0이 될 수 없음.
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					continue;
				}
				결과 = 정수1 % 정수2;
				
			} else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			System.out.println(정수1 + " " + operator + " " + 정수2 + " = " + 결과);
		}
		
	}
	
	// 13과 14번 문제 이중 for문 문제
	public void practice13() {
		//키보드로 숫자를 입력받고 별찍기를 진행한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
	
		// 입력받은 수만큼 세로줄 출력 ex? 2 -> 세로로 二 칸
		for(int 세로줄 = 1; 세로줄 <= num; 세로줄++) {
			// 한줄씩 별을 만들어 주고 싶음
			// 한 줄-하나		두 줄-둘		세 줄-삼 ...num줄 = num
			for(int 별 = 1; 별 <= 세로줄; 별++) {
				System.out.print("*");
			}
			// 줄바꿈을 해줄 enter가 없으면 가로로 모두 출력
			System.out.println();
		}
	}
	
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		/* 이중 포문
			for(int line = num; 조건식; 증감식) {
				for(int star = 1; line <= star; star++) {
					System.out.print("*")
				}
				System.out.println();
			}
		 
		 * */	
		
		for(int line = num; line >= 1; line--) {
			for(int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/*
	 ****
	  ***
	   **
	    *
	 * */
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		// 키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			// blank 공백을 출력하기 위한 for문
			// line 번재 줄에서는 line개의 공백을 출력하겠다
			 for(int blank = 0; blank < line; blank++) {
				 System.out.print("  ");
			 }
			 // star 별을 출력하기 for문
			 // line 번째 줄에서는 size = line개의 별을 출력
			 // 첫 번째 줄 size
			 // 두 번째 줄 size - line
			 for(int star = size; star > line; star--) {
				 System.out.print("* ");
			 } 
			 System.out.println();
		}
		
	}
	
	
	
	/*
	 break; -> 중괄호 탈출
	 continue; -> 다음 반복 실행
	 * */
	
	
	
	//Greeting : 안녕하세요 인사를 출력하는 메서드
	public void Greeting() {
		System.out.println("안녕하세요");
	}

	//Greeting2 : 반갑습니다 인사를 출력하는 메서드
	public void Greeting2 () {
		System.out.println("반갑습니다.");
	}




}
