package com.kh.operatorPre;

import java.util.Scanner;

public class LoopPractice {

	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		while(num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			System.out.print("다시 입력하세요!! : ");
			num = sc.nextInt();
		}
		
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}
	
	public static void main(String[] args) {
		practice2();
	}
	
}
