package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	
	public static void practice1() {
		int num[] = new int[10];
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}
	
	public static void practice2() {
		int num[] = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = num.length - i;
			System.out.print(num[i] + " ");
		}
	}
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void practice4() {
		String[]fruit = {"���", "��", "����", "������", "����"};
		
		System.out.println(fruit[1]);
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		String[] sArr = {str};
		
		System.out.print("���� : ");
		String str2 = sc.next();
		
		
	}
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
	}

}
