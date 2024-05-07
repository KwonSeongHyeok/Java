package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	//�⺻ �޼���
	
	// LoopForEx���� ����ϱ� ���Ѵٸ�
	// public static void guguDan ���� static�� �߰����ش�����
	// public static void main(String[] args) {
	//	guguDan();
	// }
	
	// static�� ������ �ʰ� ����ϱ� ���Ѵٸ�
	// ��¿� Ŭ������ ���� ����ϱ�
	
	// ���Ḧ �ϱ� ������ �ݺ��ؼ� ���
	public void guguDan() {
		// ����ڷκ��� ���ڸ� �Է¹ް� ���ڿ� �ش��ϴ� �������� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� ���� ���� ȯ���մϴ�.");
			
			// �������� 0�� �Է��ϱ� ������ �ݺ��ؼ� ����ϱ�
			// �ݺ��ϱ� ���� while�� ���
			while(true) {
				System.out.println("���Ḧ ���ϸ� 0 �Է��ϱ�");
				System.out.println("���ϴ� ���� �Է����ּ���.");
				int dan = sc.nextInt();
				
				// ���࿡ ���� 0�� ������ ���α׷� ����
				
				// ���� ���� for�� �̿��ؼ� ���.
				if(dan == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				System.out.println("=====" + dan + "�� =====");
				for(int a = 1; a <= 9; a++) {
					System.out.println(dan + " * " + a + " = " + (dan * a));
				}	
			}
	}


	// ������ �Է� �޾� �Ųٷ� ����ϱ�
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ųٷ� ���迡 ���� ���� ȯ���մϴ�.");
		
		while(true) {
			System.out.println("���Ḧ ���� ��� 0 �Է��ϱ�");
			System.out.print("���ϴ� ���� �Է��ϼ��� : ");
			int dan = sc.nextInt();
			
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // for while switch ��� ���� if �ܵ� x
			}
			
			// continue ���� ������ ����
			// if 1~9������ �Է� �����ϵ��� ����
			if (dan < 1 || dan > 9) {
				System.out.println("1���� 9������ ���ڸ� �Է����ּ���.");
				continue;
				
			}
			System.out.println(dan + "�� �Ųٷ� ����ϱ�");
			for(int a = 9; a >= 1; a--) {
				System.out.println(dan +" * " + a + " = " + (dan * a));
			}
		}
	}


	// �������� 1�ܺ��� 9�ܱ��� ��� ���0
	public void guguDan3() {
		// int dan = ���ϴ� �ܸ� �����ؼ� ���
	
		// 1�ܺ��� 9�ܱ��� ���
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println("***** " + dan + "�� *****");
			// 1�ܿ��� ���� 1~9�� ������ ���� ���
			for(int num = 1; num <= 9; num++) {
				
				System.out.println(dan + " * " + num + " = " +(dan*num));
			}
		}
	}
	
	
	// �������� 2�ܺ��� 9�ܱ��� ���
	public void guguDan4() {
		for(int �� = 2; �� <= 9; ��++) {
			System.out.println("==== " + �� + "�� ====");
			for(int ���� = 1; ���� <= 9; ����++) {
				System.out.println(�� + " * " + ���� + " = " +(��*����));
			}
		}
	}
	
	
	// 10���� ���� ����ϱ� ��������
	public void randomNumber() {
		// Random �ҷ��� ���� ������ �������� ���ڸ� �������� ����ϱ�
		Random ���� = new Random(); // �ζ� ��ȣ ����
		// nextInt() �ȿ� ���ڸ� �־ ��𼭺��� �����̿��� �������� ���ڰ� ���;��ϴ���
		// ������ ������ �� ����
		int �������� = ����.nextInt(5); // 0~4 ���̿� ���ڰ� ����
		// ���ڸ� �� �� �ڵ� �ȿ����� -1~ ���� ��� 0 ���� ����
		// �������� ������ ���� -1
		System.out.println("�������� : " + ��������);
		
	}
	
	// �������� ���� 3�� ����ϱ�		1 ~ 10 ������ ����
	public void randomFor() {
		// Random ȣ���ϱ�
		Random ran = new Random();
		
		// �������� 3�� ����ϱ� 1~10 ������ ����
		
		for(int num = 1; num <= 3; num++) {
			// �������� ���ڸ� ������ֱ�
			//								10�� �����ָ� 0 ~ 9
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("�������� "+ num + " : " + randomNumber);
		}
	}
	
	
	public void randomFor2() {
		// ������ 1~45 ��ȣ 6�ڸ� for �� ���
		Random random = new Random();
		
		for(int num = 1; num <= 6; num++) {
			int lottoNumber = random.nextInt(45) + 1;
			// if ���� ���ڰ� ���ٸ� ��ȣ�� �����ϰ� ����ϱ�
			System.out.println("���� ��ȣ ��÷ : " + lottoNumber);
		}
	}


	// 1���� 10������ ���� �߿��� Ȧ���� ����ϱ�
	// Ȧ�� = odd
	public void oddNum() {
		for (int num = 1; num <= 10; num++) {
			// ���࿡ ���ڰ� Ȧ����� ����ϱ�
			if(num % 2 != 0) {
				System.out.println(num);
			}
		}
	}
	
	
	// ¦���� 1 ~ 10���� ����ϱ�
	// ¦�� = even
	public void evenNum() {
		for(int num = 1; num <= 10; num++) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
	
	
	// ���簢�� ����� �� ���
	public void squareStar() {
		int star = 3;
		for(int i = 0; i < star; i++) { // ���� ��� 0 1 2
			
			for(int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			
			System.out.println(); // ���η� ���� ����� ���� �ٹٲ�
		}
	}
	
	
	// ���簢�� ����� �� ��� ���η� 5���� ���
	public void  fiveStar() {
		int star = 5;
		
		
		for(int i = 0; i < star; i++) {
			for(int j = 0; j < star; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	// ���ڸ� ���� ������ ��� ������ Ǯ���� �ϱ� while(true)
	// for ��ȸ 2�� �ֱ�
	// if�� �����ؼ� ���ڰ��� ���亸�� ������ ���ڰ� �۽��ϴ�.
	// hint ���ڰ��� ���亸�� ������ ���ڰ� �ʹ� Ů�ϴ�.
	
	public void numberGame() {
		// ������ ������� ���ڰ� �������� Ű����� ���ߴ� ����
		Scanner sc = new Scanner(System.in);
		// �������� ���� �����
		Random random = new Random();
		
		while(true) {
			int randomNumber = random.nextInt(3) + 1;
			System.out.println("���ڸ� ���纸����!!!!");
			// for�� �ȿ� ������ �� ������ ������ ���ΰ�? ������ 2���� �����ϰڴ�.
			for(int attack = 1; attack <= 2; attack++) {
				System.out.print("������ " + attack + "ȸ �õ��մϴ�. (��������) : ");
				int guest = sc.nextInt(); // �Խ�Ʈ�� �Է��� ���� ��������
				
				if(guest == randomNumber) {
					System.out.println("�����մϴ�.!! ���ڸ� ������ϴ�.!");
					break;
				// Ʋ���� �� ���亸�� ���ڸ� �۰� �ۼ��ߴ��� ���ڸ� ���亸�� ���� �ۼ��ߴ��� ��Ʈ�� �� �� ����
				} else if(guest < randomNumber) {
					System.out.println("���亸�� �Է��� ���ڰ� �۽��ϴ�."); 
				} else if(guest > randomNumber) {
					System.out.println("���亸�� �Է��� ���ڰ� Ů�ϴ�.");
				} 
			}
			System.out.println("������ " + randomNumber + "�Դϴ�.");
			System.out.print("������ �ٽ� �����Ͻðڽ��ϱ�? (1�� yes / 2�� no) : ");
			int playAgain = sc.nextInt();
			// ���࿡ 2���� ������ break; �ɾ��ֱ�
			if(playAgain == 2) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}	
	}


}
