package com.kh.conditionEx;

import java.util.Scanner;

// ��Ű�� : �ۼ��� ������ ���� ��ġ

// ���ǹ� ��ɿ� Ŭ����
public class ConditionEx {
	
	/*
	 if �־��� ������ ���� �� ����Ǵ� �ڵ� ���
	 else ������ ������ �� ����Ǵ� �ڵ� ���(�ʼ��� �ƴ�)
	 
	 �����
	 if (���ǹ�) {
	 	������ ���� ��� ������ �ڵ� �ۼ�
	 	���࿡ ���ǹ��� ������ ���� �ƴ� ���
	 	�ڵ����� ���� ����
	 }
	 * */
	
	// �޼��� 1 : 19�� �̻��� �����Դϴ�. ����ϱ�
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		// ���࿡ ���� ���̰� 19�� �̻��̶��
		// �����Դϴ�. �� ����� ��
		
		if (age >= 19) {
		// age�� ���� 19 �̻��̸� �����Դϴ� ��µǰ� �ϱ�
			System.out.println("�����Դϴ�.");
		} else {
			// ���࿡ ������ �ƴ϶�� ������ �ƴմϴ�. ����ϰ� �ϱ�
			System.out.println("������ �ƴմϴ�.");
		}
		
	}
	
	
	public static void method2() {
		int num = 3;
		
		// ���࿡ num�� ¦���� ��� ¦���Դϴ�. ����ϱ�
		// ¦�� % 2 => 0	
		if (num % 2 == 0) {
			System.out.println("¦���Դϴ�!!!");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		// num�� Ȧ���� ��� Ȧ���Դϴ�. ����ϱ�
	}
	
	
	public static void method3() {
		int age = 20;
		
		if (age > 0 && age < 14) {
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("��̰� �ƴմϴ�.");
		}
	
	}
	
	
	// Scanner Ȱ���ؼ� �����ϱ�
	
	// public static void practice1()
		// ���̰� 10�� �̻� 20�� �̸��� ���� 10��
		// �� �ܴ� 10�밡 �ƴ� ���	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if(age >= 10 && age <20) {
			System.out.println("10���Դϴ�.");
		} else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
	}
	
	// public static void practice2()
		// ���̰� 80�� �̻��̸� 80�� �̻��Դϴ�. ����ϱ�
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if (age >= 80) {
			System.out.println("80�� �̻��Դϴ�.");
		}
	}
	
	// ���� �޼���
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//practice1();
		//practice2();
	}

}
