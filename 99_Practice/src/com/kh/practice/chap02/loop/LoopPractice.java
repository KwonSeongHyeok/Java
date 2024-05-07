package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		// �Է¹��� ���ڰ� 1 �̸��� ��� ������ֱ�
		if(num < 1) {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			return;
		}
		
		// �Է¹��� ���ڰ� 1 �̻��̸� 1���� �Է¹��� ���ڱ��� ��� ������ֱ�
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		// �������� �ٹٲ��� ���ֱ� ���Ѵٸ�
		System.out.println(); // �ٹٲ� �ϼ�!
		
	}
	
	
	
	// 1�̸��� ���ڰ� �Էµƴٸ�
	// 1 �̻��� ���ڸ� �Է����ּ��䰡 ��µǸ鼭
	// �ٽ� ����ڰ� ���� �Է��ϵ��� �ϱ�
	public void practice2() {
		// �Է¹ޱ� ���ؼ��� ��ĳ�ʸ� ���ؼ� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.print("1 �̻��� ���ڸ� �ٽ� �Է��ϼ��� : ");
			} else {
				break;
			}
		}
		// 1���� ~������ ���ڵ��� ���Դ��� ����� ����ʹٸ�
		System.out.println("1���� " + num + "������ ���ڵ�");
		int i = 1;
		while(i <= num) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
	}
	
	
	public void practice3() {
		// ����ڷκ��� �� ���� ���� �Է¹޾�
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** pratice 3 ���� ****");
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է��ϼ���");
			} else {
				break;
			}	
		}
		// 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϱ�
		System.out.println(num + "���� 1������ ���ڵ��� �Ųٷ� ����մϴ�.");
		int i = 1;
		while(num >= 1) {
			System.out.print(num + " ");
			num--; // Ű����� �Է¹��� ���ڿ��� -1�� �ϸ鼭 1�� �ɶ� ���� ���
		}	
		// System.out.println();
	}
	
	
	public void practice4() {
		// 1 �̸��� ���ڰ� �ԷµǸ� 1�̻��� ���ڸ� �Է����ּ��� ��µǸ鼭
		// ����ڰ� ���� �Է��ϵ��� �ϱ�
		// ���ڸ� �Է¹��� ���ں��� 1���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int num; // practice4 �ȿ��� ��𿡼��� num�� �� �� �ֵ��� �ٱ����� ȣ������
		// do - while : ������ ���� �ƴϾ ������ ���� 1ȸ�� ����
		do {
			System.out.print("���ڸ� �Է��� �ּ��� : ");
			num = sc.nextInt();
			// 1 �̸��� ���ڰ� ������ ! 
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			// ���ǿ� ������� do�� ���� ������ 1ȸ ����Ǵ� ���̱� ������ return�̳� break��
			// �ۼ������� �ʾƵ� �� ��찡 ����
			}
		} while(num < 1);
		
		// ���࿡ 1���� Ŀ�� ������ �����´ٸ�
		// num���� 1���� �Ųٷ� ������ִ� for�� �ۼ����ֱ�
		for(int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	
	public void practice5() {
		// 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		// �Է� ���� ���� �� ���� �� �ٱ���
		int result = 0;
		
		// ���ڰ� ������ �� 1���� �Է¹��� ���ڱ��� ���ؼ� ���� ���ϱ�
		for(int i = 1; i <= num; i++) {
			result += i;
			
			// �������� ���� ����ϱ�
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
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
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
			System.out.print("ù ��° ���� : ");
			int firstNum = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int secondNum = sc.nextInt();
			
			// ���࿡ ù ��° ���ڿ� �� ��° ���� ��� 1���� ũ�ų� ���� ���
			if(firstNum >= 1 && secondNum >= 1) {
				// �� ���� ���ؼ� �ּҰ� �ִ밪 ���ϱ�
				// Math(���� ���Ͽ���) ���� ���� ���� ã�� min�� Ȱ���ؼ�
				// �˾Ƽ� ���ϰ� ���� ���� ���ϰ� �ϱ�
				// (   ,   ) ��ȣ �ȿ� ���ڸ� ���� �� ���� ������ �������
				// Math���� random�� �ִ����� ?!
				// Random����		Math.random����
				// Math�� �ִ� random���� Random�� �ִ� ���� ����� ��
				// ������ �� �� ����ϴµ� ū ���̴� ����
				int �ּҰ� = Math.min(firstNum, secondNum);
				int �ִ밪 = Math.max(firstNum, secondNum);
				
				for(int i = �ּҰ�; i <= �ִ밪; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
					System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
				}
			}
		}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		// �� ������ �����ȣ�� �޾Ƽ� ����ϴ� �޼���
		// ������ ��쿡�� + - * / %
		String operator; // char operator -> charAt
		
		while(true) {
			System.out.println("���α׷� ���Ḧ ���� ��� exit �Է��� ��");
			System.out.print("�����Է�(+, -, *, /, %) : ");
			
			operator = sc.next();
			
			// ���࿡ exit�� �Է��ؼ� ���α׷� ���Ḧ ���� ���
			// ���ڿ�(String)���� �񱳸� �� ��� equals(==)
			if(operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} 
				
			// ���� 1�� ���� 2�� �Է¹޾Ƽ� ����ϱ�
			System.out.print("����1 : ");
			int ����1 = sc.nextInt();
			System.out.print("����2 : ");
			int ����2 = sc.nextInt();
			
			// ����1�� ����2 ��꿡 ���� ���(=result)
			int ���;
			
			// switch case "+"
			if(operator.equals("+")) {
				��� = ����1 + ����2;
			} else if(operator.equals("-")) {
				��� = ����1 - ����2;
			} else if(operator.equals("*")) {
				��� = ����1 * ����2;
			} else if(operator.equals("/")) {
				// �� ���� ��쿡�� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����.
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					continue;
				}
				��� = ����1 / ����2;
			} else if(operator.equals("%")) {
				// ������ ��� 0���� ���� �� ���� ������ ����2�� 0�� �� �� ����.
				if(����2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
					continue;
				}
				��� = ����1 % ����2;
				
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
			System.out.println(����1 + " " + operator + " " + ����2 + " = " + ���);
		}
		
	}
	
	// 13�� 14�� ���� ���� for�� ����
	public void practice13() {
		//Ű����� ���ڸ� �Է¹ް� ����⸦ �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
	
		// �Է¹��� ����ŭ ������ ��� ex? 2 -> ���η� � ĭ
		for(int ������ = 1; ������ <= num; ������++) {
			// ���پ� ���� ����� �ְ� ����
			// �� ��-�ϳ�		�� ��-��		�� ��-�� ...num�� = num
			for(int �� = 1; �� <= ������; ��++) {
				System.out.print("*");
			}
			// �ٹٲ��� ���� enter�� ������ ���η� ��� ���
			System.out.println();
		}
	}
	
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		
		/* ���� ����
			for(int line = num; ���ǽ�; ������) {
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
		System.out.print("���� �Է� : ");
		// Ű����� �Է� ���� ���� size �ȿ� �־���
		int size = sc.nextInt();
		// line�� ���η� �� ���� ��ȣ�� ��Ÿ��
		for(int line = 0; line < size; line++) {
			// blank ������ ����ϱ� ���� for��
			// line ���� �ٿ����� line���� ������ ����ϰڴ�
			 for(int blank = 0; blank < line; blank++) {
				 System.out.print("  ");
			 }
			 // star ���� ����ϱ� for��
			 // line ��° �ٿ����� size = line���� ���� ���
			 // ù ��° �� size
			 // �� ��° �� size - line
			 for(int star = size; star > line; star--) {
				 System.out.print("* ");
			 } 
			 System.out.println();
		}
		
	}
	
	
	
	/*
	 break; -> �߰�ȣ Ż��
	 continue; -> ���� �ݺ� ����
	 * */
	
	
	
	//Greeting : �ȳ��ϼ��� �λ縦 ����ϴ� �޼���
	public void Greeting() {
		System.out.println("�ȳ��ϼ���");
	}

	//Greeting2 : �ݰ����ϴ� �λ縦 ����ϴ� �޼���
	public void Greeting2 () {
		System.out.println("�ݰ����ϴ�.");
	}




}
