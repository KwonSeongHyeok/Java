package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	
	public static void practice8() {
		// �ֹι�ȣ�� �̿��ؼ� �������� �������� �����ؼ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		String idNumber = sc.next();
		
		// �ֹι�ȣ ���ڸ��� ù ��° ���ڸ� ������ �ɴϴ�.
		// charAt 7��° �ڸ��� �ִ� ���� ������ �ͼ� �������� �������� �����ؼ� ���
		char genderCode = idNumber.charAt(7); // - �����ؼ� 7�ڸ�
		// �ֹι�ȣ�� - �����ϰ� �ֹι�ȣ ���ڸ� �Է��Ѵٸ� 6��° �ڸ��� �ִ� ���� ������ �;���
		
		// �ֹι�ȣ ���ڸ� ù ��° ���ڷ� ������ �Ǻ�
		String gender; // ���߿� �������� �������� Ȯ�����ִ� ��� �����ֱ�
		
		// "" String '' char  char�� ����ؼ� ���ڰ��� �������� ������ '' ���
		if(genderCode == '1' || genderCode == '3') {
			gender = "����";
		} else if(genderCode == '2' || genderCode == '4') {
			gender = "����";
		} else {
			System.out.println("�ùٸ� �ֹι�ȣ�� �ƴմϴ�.");
			// 1. gender = "�ùٸ� �ֹι�ȣ�� �ƴմϴ�."
			// else���� ���������� return
			return;
		}
		// �������� ���������� ���� ���
		System.out.println("�Է��� �ֹι�ȣ�� " + gender + "�Դϴ�.");
		
	}
				
	
	/*
	 ǥ��� : �ڵ带 �ۼ��� �� ������ ���̿� �ڵ带 ��Ȯ�ϰ� �����ֱ� ���� �ۼ��ϴ� ���
	 
	 ������ũ ���̽�
	 ������ �����(_)�� ����ִ� ǥ�� ����� ��ó�� ������ؼ� �ٿ��� �̸�
	 ex) snake_case, one_two_three, gender_code
	 
	 �Ľ�Į ���̽�
	 ù���ڿ� �߰� ���ڸ� �빮�ڷ� ����ϴ� ǥ�����
	 ex) PascalCase, OneTwoThree, GenderCode
	 
	 ī�����̽�
	 �߰����ڸ� �빮�ڷ� �����ؼ� ǥ���ϴ� ���
	 ex) camelCase, oneTwoThree, genderCode
	 
	 �ɹ�ǥ���
	 �߰��� ���(-)�� �����ؼ� �������� �ۼ����ִ� ǥ�� ���
	 ex) kebab-case, one-two-three, gender-code
	 * */
	
	public static void castingPractice1() {
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char inputChar = sc.next().charAt(0);
		
		// �����ڵ� ��� 16����
		// �� ������ ��� ���ڳ� ���ڸ� ��ǻ�Ϳ��� �ϰ��ǰ� ǥ���ϱ� ���� ���
		// ���ڿ� ���ڸ� �ٿ��� ��ǻ�Ͱ� ���� �� �ֵ��� ���ִ� ���
		int unicode = inputChar; //char 2byte int 8byte
		System.out.println("�Է��� ���� " + inputChar + "�� �����ڵ�� " + unicode + "�Դϴ�.");
	}
	
	
	public static void castingPractice3() {
		// �־��� �ڵ忡�� ��ĭ�� ä��� ��� ����� �������� ���� ��
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f; // �⺻���� double�̱� ������ float�� �������ִ� f�ٿ���
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2 : ���� 2�� �������ٸ�?
		System.out.println((int) dNum); // 2
		// double �Ǽ��� �Ǿ��ִ� ���� ������ ����
		// double 8byte int 4byte���� ����ȯ�� (int) �����ϰڴٴ� ǥ�ø� �ۼ� �� ������ ��
		
		System.out.println((double)iNum2 * dNum); // 10.0
		// ���� ���� ū ���� ������ �ڵ����� ū ������ ����Ǳ� ������ (double) �ʼ��� �ƴ�
		System.out.println((double) iNum1); // 10.0
		
		System.out.println((double)iNum1 / iNum2); // 2.5 // ���� -> �Ǽ���
		System.out.println(dNum); // 2.5
		
		System.out.println((int)fNum); // 3
		System.out.println((int)(iNum1 / fNum)); // 3 // �����⸦ �ؼ� ���� 3
		// int�� float�� ���� ũ���� byte �������� �Ǽ����� ǥ��
		
		System.out.println(iNum1 / fNum); // 3.3333333
		System.out.println((double)iNum1 / fNum); // 3.3333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int)ch); // 65
		System.out.println(ch +iNum1); // 75
		// 'A' ���� (int)ch�� ���� 65
		// ū byte�� ���� byte�� ������ �ڵ����� ū byte�� �����
		// 65 + (int inum1 = 10) = 75
		System.out.println((char)(ch + iNum1)); // 'k'
		
	}
	
	
	public static void controlPractice1() {
		// Ű����� �Է¹ް� �Է� ���� ��ȸ ���� ���� ��ư������ �����ϱ�
		Scanner sc = new Scanner(System.in);
		
		// �޴� ����ϱ�
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		
		// �޴� ��ȣ �Է� �ޱ�
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		// ���õ� �޴��� ���� ���� ����
		switch(menuNumber) {
		case 1 :
			System.out.println("�Է� �޴� �Դϴ�.");
			break;
		case 2 :
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 3 :
			System.out.println("��ȸ �޴� �Դϴ�.");
			break;
		case 4 :
			System.out.println("���� �޴� �Դϴ�.");
			break;
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default :
			System.out.println("�߸��� �޴� ��ȣ�Դϴ�.");
		}
	}
	
	
	public static void controlPractice10() {
		Scanner sc = new Scanner(System.in);
		/* System.out.print���� ����� ������ �������
			\n �� �ٲ����� ���� �ۼ��ϰ� �ʹٸ� �̿��ؼ� �ٹٲ��ؼ� ����ϰڴٴ� ǥ��
			\n = ���η� �ٹٲ��ؼ� ���
			\r = Ű���� �Է��ϴ� ��ġ�� ���� ���� �� ó������ �̵�
			System.out.print();
			 +�� ); ������ �ʴ� �� ���� �ٲ㼭 ��� �̾ �ۼ��� �� ����
		*/
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���\n"
				+ "2. ¦��/Ȧ��\n"
				+ "3. �հ�/���հ�\n"
				+ "4. ����\n"
				+ "5. �α���\n"
				+ "6. ���� Ȯ��\n"
				+ "7. BMI\n"
				+ "8. ����\n"
				+ "9. P/F");
		System.out.print("���� : ");
		int menuNumber = sc.nextInt();
		
		// ���õ� �޴��� ���� ���� ����
		switch(menuNumber) {
		case 1 :
			System.out.println("�޴� ���");
			break;
		case 2 :
			System.out.println("¦��/Ȧ��");
			break;
		case 3 :
			System.out.println("�հ�/���հ�");
			break;
		case 4 :
			System.out.println("����");
			break;
		case 5 :
			System.out.println("�α���");
			break;
		case 6 :
			System.out.println("���� Ȯ��");
			break;
		case 7 :
			System.out.println("BMI");
			break;
		case 8 :
			System.out.println("����");
			break;
		case 9 :
			System.out.println("P/F");
			break;
		default :
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
	}

	
	public static void controlpractice5() {
		// ���̵� ��й�ȣ ���� �� ���̵� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
		// ����ڰ� ������ ���̵� ��й�ȣ
		
		String userID = "myId";
		String userPW = "myPassword12";
				
		// ��������� �Է¹��� ���̵� ��й�ȣ
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� : ");
		String inputID = sc.next();
		System.out.print("��й�ȣ : ");
		String inputPW = sc.next();
		
		
		// �Է¹��� ���� ����� ���̵� ��й�ȣ�� ��ġ�ϴ��� Ȯ��
		if(inputID.equals(userID) && inputPW.equals(userPW)) {
			System.out.println("�α����� �Ǿ����ϴ�.");
			// ���̵� Ʋ�ȴ��� // ��й�ȣ�� Ʋ�ȴ��� �����ؼ� ���
		
		/*
			// ! Ư�� ������ �����ϴµ� ���
			inputID.equals(userId) : inputID�� userId�� ��ġ�ϴ� Ȯ�� ��ġ�ϸ� ��
			!inputID.equals(userId) : inputID�� userId�� ���� ��ġ���� ������ ��
										!�� ������ ���̵� Ʋ���� �� ���� �ȴ�.
		*/
		} else if(!inputID.equals(userID)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		} else if(!inputPW.equals(userPW)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�ߺ� �Էµ� ���Դϴ�.");
		}
	}
	
	
	public static void controlpractice6() {
		// ����ڷκ��� ȸ�� ����� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		// �����̳� ��Ģ�� ������ �� ���� ����ϴ� ������ : Role
		String userRole = sc.next();
		
		// ���� ���
		System.out.println("�ش� ȸ�� ����� ����");
		
		switch(userRole) {
		case "������" :
			System.out.println("-ȸ������ \n"
					+ "-�Խñ� ���� \n"
					+ "-�Խñ� �ۼ� \n"
					+ "-�Խñ� ��ȸ \n"
					+ "-��� �ۼ�");
			break;
		case "ȸ��" :
			System.out.println("-�Խñ� �ۼ� \n"
					+ "-�Խñ� ��ȸ \n"
					+ "-��� �ۼ�");
			break;
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		default :
			System.out.println("�߸��� ȸ�� ����Դϴ�.");
		}
	}
	
	
	public static void controlpractice8() {
		/*
		 Ű����� �� ���� ������ ���� ��ȣ�� �Է¹޾� ���� ��ȣ�� ���� ���� ��� ���
		 (�� ���� ���� ��� ����϶��� �۵��ϸ� ���� ���� ��ȣ�� �Է����� ���
		 "�߸� �Է��߽��ϴ�." ���
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		String operator = sc.next();
		
		double result;
		switch(operator) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
			// / % 0���� ���� �� ���� ������ if������ ���� 0�� �� ��� ó���� �������
		case "/" :	
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = (double)num1 / num2;
			break;
		case "%" :
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
			result = num1 % num2;
			break;
		default : 
			System.out.println("�߸� �Է��߽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		if (num1 > 0 && num2 > 0) {
			System.out.println(num1 +" " + operator + " " + num2 + " = " + result);
		} else {
			return;
		}
	}
		
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingPractice3();
		//controlPractice1();
		//controlPractice10();
		//controlpractice5();
		//controlpractice6();
		controlpractice8();
	}

}
