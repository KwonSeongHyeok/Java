package com.kh.operatorPre;
//99_Practice

import java.util.Scanner;

//�߶󳻱�(ctrl + x)  ����(ctrl + c)  �ٿ��ֱ�(ctrl + v)
public class ControlPre {
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
		//practice4();
		//practice5();
	}
	
	// �ǽ����� 1�� Ȧ�� ¦�� ��Ÿ����
	public static void practice1() {
		// Ű����� �Է¹��� ������ ����̸鼭 ¦���� ���� ¦���Դϴ�. ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt(); // Ű����� ���� �Է¹ޱ�
		
		if(number > 0) { // �Է¹��� ���ڰ� ����� ��쿡�� Ȧ¦ �����ϱ�
			if(number % 2 == 0) { // ���ڰ� ¦���� ��� ����ϱ�
				System.out.println("¦���Դϴ�.");
			} else {			  // ���ڰ� Ȧ���� ��� ����ϱ�
				System.out.println("Ȧ���Դϴ�.");
			}
		} else {		// �Է¹��� ���ڰ� ������ ��� ����ϱ�
			System.out.println("����� �Է��� �ּ���.");
		}
	//-------------------------------------------------------		
		/*if (num > 0 && num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else if (num > 0 && num % 2 == 1) {
			System.out.println("Ȧ���Դϴ�.");
		} else {
			System.out.println("����� �Է����ּ���.");
		}*/
	//-------------------------------------------------------		
		/*String result;
		
		if (num > 0 && num % 2 == 0) {
			result = "¦���Դϴ�.";
		} else if(num > 0 && num % 2 == 1) {
			result = "Ȧ���Դϴ�.";
		} else {
			result = "����� �Է����ּ���.";
		}
		System.out.println(result);
		*/
	}

	
	public static void practice2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� : ");
		int korean = sc.nextInt();
		
		System.out.print("�������� : ");
		int english = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		// �հ�� ��� ���
		int totalScore = korean + english + math;
		double averageScore = (double)totalScore / 3.0;
		// �հ� ���� �Ǻ�
		// �� ������ ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� ���
		if(korean >= 40 && english >= 40 && math >= 40 && averageScore >= 60) {
			System.out.println("���� ���� : " + korean);
			System.out.println("���� ���� : " + english);
			System.out.println("���� ���� : " + math);
			System.out.println("��	 �� : " + totalScore);
			System.out.println("��	 �� : " + averageScore);
			
			System.out.println("�����մϴ�. �հ��Դϴ�!!!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
	// -----------------------------------------------------	
		/*
		System.out.print("�������� : ");
		int korean = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double ave = sum / 3.0;
		
		if(ave < 60.0 || korean < 40 || english < 40 || math < 40) {
			System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���� : " + korean);
			System.out.println("���� : " + math);
			System.out.println("���� : " + english);
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + ave);
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}
		*/
	}

		
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt(); // Ű����� �Է��� ��

		int daysMonth; // �ش��ϴ� ���� �ϼ�
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
				System.out.println(month + "���� �������� �ʴ� ���Դϴ�.");
				// daysMonth = 0;
				return;
		}
		System.out.println(month + "���� " + daysMonth + "�ϱ��� �ֽ��ϴ�.");
	
		//------------------------------------------------
		/*
		System.out.print("���� �Է��ϼ��� : ");
		int month = sc.nextInt();
		String result;
		
		if (month == 2) {
			result = "2���� 28�ϱ��� �ֽ��ϴ�.";
		} else if(month == 1 || month == 3 || month == 5 ||
				  month == 7 || month == 8 || month ==10 || month == 12) {
			result = month + "���� 31�ϱ��� �ֽ��ϴ�";
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			result = month + "���� 30�ϱ��� �ֽ��ϴ�";
		} else {
			result = month + "���� �߸� �Էµ� ���Դϴ�.";
		}
		System.out.println(result);
		*/
	}

	
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		
		//Ű�� ������ �Է� �ޱ�
		System.out.print("Ű(m)�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��ϼ��� : ");
		double weight = sc.nextDouble();
		
		// BMI ���
		double bmi = weight / (height * height);
		
		// BMI ������ ���� ��� ���
		if(bmi < 18.5) {
			System.out.println("��ü��");
		} else if(bmi < 23) {
			System.out.println("����ü��");
		} else if(bmi < 25) {
			System.out.println("������");
		} else if(bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}
		
	//------------------------------------------------------	
		/*
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		String result;
		if (bmi < 18.5) {
			result = "��ü��";
		} else if (bmi < 23) {
			result = "����ü��";
		} else if (bmi < 25) {
			result = "��ü��";
		} else if (bmi < 30) {
			result = "��";
		} else {
			result = "�� ��";
		}
		System.out.println("BMI ���� : " + bmi);
		System.out.println(result);
		*/
	}
	
	
	public static void practice5() {
		// �߰� �⸻ ���� �⼮ �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ���� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ���� : ");
		double fin = sc.nextDouble();
		System.out.print("���� ���� : ");
		double assig = sc.nextDouble();
		System.out.print("�⼮ Ƚ�� : ");
		int attend = sc.nextInt();
		
		// �⼮ ���� ���
		double attendPer = attend / 20 * 100;
		// attend / 20 = �⼮�� Ƚ���� ��ü ���� Ƚ���� ������ �⼮ ������ ���
		// double �Ҽ��� �ؿ� �ִ� ������ ����
		// �Ǽ��� �� ���� 100�� ���ؼ� ������� ��ȯ
		
		// �� ������ ���� ���� ���
		// �߰� 20 �⸻ 30 ���� 30 �⼮ 20 = 100��
		// �߰� ���� 20
		double midScore = mid * 0.2;
		// �⸻ ���� 30
		double fiScore = fin * 0.3; // 100�� �������� 30%
		// ����
		double asScore = assig * 0.3;
		// �⼮ ���� 20
		double attendScore = attendPer * 0.2; // 100�� �������� 0.2
		double totalScore = midScore + fiScore + asScore + attendScore;

		// �򰡿� ���� Pass �Ǵ� Fail ���
		if(totalScore >= 70 && attendPer >= 70) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("=========== ��� ==========");
		System.out.println("�߰���� ����(20�� ����) : " + midScore);
		System.out.println("�⸻��� ����(30�� ����) : " + fiScore);
		System.out.println("��	�� ����(30�� ����) : " + asScore);
		System.out.println("��	�� ����(20�� ����) : " + attendScore);
		System.out.println("��              ��  : " + totalScore);
		
	//------------------------------------------------------
		/*
		System.out.print("�߰� ��� ���� : ");
		int mScore = sc.nextInt();
		System.out.print("�⸻ ��� ���� : ");
		int fScore = sc.nextInt();
		System.out.print("���� ���� : ");
		int hScore = sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		int att = sc.nextInt();
		
		double �߰� = mScore * 0.2;
		double �⸻ = fScore * 0.3;
		double ���� = hScore * 0.3;
		double �⼮ = att;
		double sum = �߰� + �⸻ + ���� + �⼮;
		
		System.out.println("============== ��� ==============");
		
		if(�⼮ < 20 * 0.7) {
			System.out.println("Fail [�⼮ Ƚ�� ���� (" + att + "/20)]");
		} else if (sum < 70) {
			System.out.println("Fail [���� �̴�]");
		} else {
		System.out.println("�߰� ��� ����(20) : " + �߰�);
		System.out.println("�⸻ ��� ����(30) : " + �⸻);
		System.out.println("����		����(20) : " + ����);
		System.out.println("�⼮		����(20) : " + �⼮);
		System.out.println("���� : " + sum);
		System.out.println("PASS");
		}
		*/
	}
}
