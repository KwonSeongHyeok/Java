package com.kh.operatorPre;

import java.util.Scanner;

public class LoopPractice {

	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		while(num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			System.out.print("�ٽ� �Է��ϼ���!! : ");
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
