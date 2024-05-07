package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	
	/*
	 public static void �ۼ��ϰ� ���� �̸�() {
	 }
	 
	  - public -
	 public -> ��𼭵� ���� ������ : ��ü����
	 protected -> ���� ���� �ȿ����� ���� ����
	 default -> ���� ���� �ȿ��� ���� ����
	 			protected���� ���ѵǰ� ���� ����
	 private -> �� class�ȿ����� ���� ����
	 			�ۼ��� ���� �ȿ����� ���� ����

	  - void - 
	 void -> ��ȯ�ϴ� �� ���� �ٷ� ����� �� �� ���
	 * */
	
	
	
	/*
	 while���� ����ؼ�
	 4���� ������ ���α׷��� �����ϴ� �ڵ带 �ۼ��ϱ�
	 * */
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("==========[�޴���]==========");
			System.out.println("1.�Ƹ޸�ī�� 2.ī��� 3.���� 4.�ֹ����");
			System.out.print("�޴��� �Է��� �ּ��� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("�Ƹ޸�ī��");
				break;
			case 2 :
				System.out.println("ī���");
				break;
			case 3 :
				System.out.println("����");
				break;
			case 4 :
				System.out.println("�ֹ����");
				return;
			default :
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�.");
			}
		}
	}
	
	
	public static void khī��() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("khī�信 ���Ű� ȯ���մϴ�. ^^*\n"
					+ "���ϴ� �޴��� �Է����ּ���.\n"
					+ "1.�Ƹ޸�ī�� 2.ī��� 3.���� 4.������Ƽ 5. �ֹ����");
			String menu = sc.next();
			
			switch(menu) {
			case "1" : case "�Ƹ޸�ī��" : case "1.�Ƹ޸�ī��" :
				System.out.println("�Ƹ޸�ī�� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "2" : case "ī���" : case "2.ī���" :
				System.out.println("ī��� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "3" : case "����" : case "3.����" :
				System.out.println("���� �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "4" : case "������Ƽ" : case "4.������Ƽ" :
				System.out.println("������Ƽ �ֹ� �߰��Ǿ����ϴ�.");
				break;
			case "5" : case "�ֹ����" : case "5.�ֹ����" :
				System.out.println("�ֹ��� ��ҵǾ����ϴ�. ������ �湮���ּ���.");
				return;
			default :
				System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
		}
	}
	
	
	public static void getMoney() {
		// Ŀ�� 10�� Ŀ�ǰ� 300��
		int coffee = 10;
		int  money = 300;
		
		while(money > 0) {
			System.out.println("���� �޾����� Ŀ�Ǹ� ����");
			coffee--;
			System.out.println("���� Ŀ���� ���� " + coffee + "�� �Դϴ�.");
			// Ŀ�ǰ� ��� �������ڸ� �ǸŸ� ��������
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �� �����ƽ��ϴ�. �ǸŸ� �����մϴ�.");
				return;
			}
		}
	}
	
	// 1���� 5���� ���ڸ� ���
	public static void allNumber() {
		int num = 1;
		
		while(num <= 5) {
			System.out.println(num);
			num++;
		}
	}
	
	// 10�� �� �ȳѾ�� ���� �����ϴ�.~!
	// ������ 10�������� ���� �ѱ��
	public static void tree() {
		// ������ ������̱� ������ ���� 0
		int hit = 0;
		
		while(hit < 10) {
			// ������ ��� ������� Ȯ��
			hit++; // ���� 1�� ���� ������ hit = hit + 1;
			System.out.println("������ " + hit + "�� ������ϴ�.");
			// ���࿡ ������ ������ ���� 10���� �Ǹ� ���� �Ѿ�ϴ� ǥ��
			if(hit == 10) {
				System.out.println("������ �Ѿ�ϴ�~~!!!!! ����.");
			}
		}

	}
	
	
	/*
	 ����ڷκ��� 1���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڸ� ��� ���
	 �� �Է��� ���� 1���� ũ�ų� ���ƾ� ��
	 ���࿡ 1 �̸��� ���ڰ� �Էµ��ڸ� 1�̻��� ���ڸ� �Է����ּ��� ����ϱ�
	 * */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0���� ū ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���");
		} else {
			System.out.println("1���� " + num + "������ ���ڵ�");
		}
		
		int abc = 1;
		while(abc <= num) {
			System.out.println(abc);
			abc++;
		}
	}


	
	// Ŀ�ǰ� 100�� ���� ������ Ŀ�Ǹ� �������� ���ϴ� ���
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ī�信 ���Ű� ȯ���մϴ�.");
		System.out.print("���� ���� ���� �Է����ּ��� : ");
		// Ŀ�ǰ��� coffeePrice
		int coffeePrice = 100;
		// ���� ������ �ִ� �ݾ� �Է�
		int money = sc.nextInt();
		
		// ���࿡ ������ �ִ� ���� Ŀ�ǰ����� ����
		while(money < coffeePrice) {
			System.out.println("���� �����մϴ�.\n"
							 + "Ŀ�Ǹ� �����ϱ� ���� �� ���� ���� �־��ּ���");
			System.out.print("���� ���� ���� �ٽ� �Է����ּ��� : ");
			money = sc.nextInt();
		}
		//int remain = money - coffeePrice;
		System.out.println("Ŀ�Ǹ� �����߽��ϴ�.\n"
						 + "�Ž������� "+ (money - coffeePrice) +"�� �Դϴ�.");
	}

	
	// 10000�� �̻� ���� ���� ��� �������� ��Ű�� ���ϴ� ����
	public static void iLovePork() {
		System.out.println("�ȳ��ϼ���. ���������Դϴ�.");
		Scanner sc = new Scanner(System.in);
		
		int tangsuyuk = 10000;
		System.out.print("���� �����ϰ� �ִ� �ݾ��� �Է��ϼ��� : ");
		int myMoney = sc.nextInt();
		
		while (myMoney < tangsuyuk) {
			System.out.print("�ܾ��� �����մϴ�\n"
					+ "�ٽ� �Ա����ּ��� : ");
			myMoney = sc.nextInt();
		}
		System.out.println("�ֹ��� �Ϸ�Ǿ����ϴ�.\n"
				+ "���� �ܾ���" + (myMoney - tangsuyuk) + "�� �Դϴ�.");
		
		
		// ���� 10000�� �̻��̸� �ֹ��� �Ϸ�Ǿ�����ϴ�.
		// ���� �ܾ��� 00�Դϴ�.
	}
	
	
	public static void main(String[] args) {
		//method1();
		//khī��();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		iLovePork();
	}

}
