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
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		// �Է� ���� ���� ũ���� �迭 ����
		
		int[] numbers = new int[size]; //size = 5
		//	numbers.length =   size  �� ����
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
		
		
		
		
		
		/*System.out.print("���� ���� : ");
		int num[] = new int[sc.nextInt()];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
			System.out.print(num[i] + " ");
		}*/
	}
	
	
	public void practice4() {
						//	0	   1	 2		3		 4	
		String fruits[] = {"���", "��", "����", "������", " ����"};
		System.out.println(fruits[1]);
	}
	

	// int number[] = new int[5];
	// index 0���� ���������� -1	0 1 2 3 4 
	// lenght 5  1���� ���̸� ������
	public void practice6() {
		// ���� ����
			// length	7    
			// index 	  0		1	 2	  3		4	 5	  6
		String week[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 ~ 6 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(week[num] + "����");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	
	
	public void practice9() {
		
		// ���̰� 7�� �迭 ����
		int num[] = new int[7]; // index[0 1 2 3 4 5 6] length : 8

		
						// num�� ���� ���̸� �˱� ���ؼ� num.length�� �����
		for(int i = 0; i < num.length; i++) {
			// �������� ���� �������� ���� ����ϱ�
			// �������� ���ڸ� ����ϴ� ���
			// 1. Random ��ü ��� : ���� �� ���� ������ ������ ���
			// 2. Math ��ü���� random() �޼��带 ��� : �� Random��ü���� ���� ������ ��� ����			
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
		String menu[] = {"�Ķ��̵�", "���"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String want = sc.next();
		
		for(int i = 0; i < menu.length; i++) {
			if(want.equals(menu[i])) {
				System.out.println(menu[i] + "ġŲ ��� ����");
				return;
			} 
		}
		System.out.println(want + "ġŲ�� ���� �޴��Դϴ�.");
	}
	

	
	public void method1( ) {
		// ���� 1 2 3 10 20 30 ����ϱ�
		int num[] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		System.out.println("num[2] : " + num[2]);
		
		// ���ڿ� �� �ڸ��� �� ȭ �� �� �� �� ��
		// �� �ڸ��� ��� ������ �� �ִ��� ���
		String str[] = {"��", "ȭ", "��", "��", "��", "��", "��"};
		// for ���� Ȱ���� ���
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println("");
		
		// �Ǽ� index 2 ���� ������ְ� ���  �Ǽ� ����
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for(int i = 0; i < dbl.length; i++) {
			System.out.print(dbl[i] + " ");	
		}
		System.out.println();
		
		// char 'A' 'B' 'C' �־��� ���� �� �ڸ� ����غ���
		char chr[] = {'A', 'B', 'C'};
		
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i] + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		/*// for ���� Ȱ���� �迭 ����ϱ�
		int numbers[] = new int[5];
		
		// 1���� 4 ���� �迭�� ���ڸ� �ֱ�
		// index�� ������ �����ϱ� ������ i = 0
		// length = ���� 
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
