package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
// �޼���
	// ������ : �⺻
	public ArrayPre() {
		
	}
	
	// void
	public void practice1() {

		// �迭�� ����ؼ� ��ü �� ���ϱ�
		// �迭�� ����� �� ���� ����
		// �������� ���ڿ����� �������� �Ǽ����� ������ ���� �� [] ǥ�� �ۼ�

		// index	 0	1  2  3  4		lenth = 5
		int[] num = {1, 2, 3, 4, 5};
		int result = 0;
		
		// for - each �� ó������ ������ �ݺ��ؼ� ���𰡸� ������ �� ���
		for(int ���� : num) {
			// num �ȿ� �ִ� ��� ���ڰ� �ϳ��� '����' �ȿ� ����
			// ���ڵ��� ��
			result += ����;
		}
		System.out.println("���ڵ��� �� : " + result);
	}
	
	
	public void practice2() {
		// ArrayList ����ؼ� ���� �߰��ϱ�
		// new ArrayList<>()�� <>�ȿ� �ڷ����� �־ �ǰ� �ȳ־ ��
		ArrayList<String> goods = new ArrayList<>();
		
		// ��ǰ�� �߰��� ���� add ���ϱ�
		goods.add("��ǻ��");
		goods.add("�����");
		goods.add("T  V");
		goods.add("������");
		
		//��� ���� 2����
		System.out.println(goods);
		
		// for - each ���� Ȱ���ؼ� ���
		for(String a : goods) {
			System.out.print(a + ", ");
		}
	}
	
	
	public void practice3() {
		// �迭�� ����ؼ� �ִ밪 ã��
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0];
		
		for(int num : numbers) { 
			if(num > max) {
				max = num;
			}
		}
		System.out.println("�ִ밪 : " + max);
	}

	
	public void practice4() {
		// ã�� ��ã��~~!
		// ���ϰ��� ��� �ٳ��� ���� ������
		String fruit[] = {"���", "�ٳ���", "����", "������"};

		String search = "Ű��";
		boolean found = false;// ������ ã�Ҵ��� ��ã�Ҵ��� �𸣱� ������ false
		
		// for - each �� Ȱ���ؼ� �ٳ��� ã��
		for(String f : fruit) {
			// ���� ���� ã�� ���ϰ� �̸��� �Ȱ��ٸ�  ã�Ҵ�~! ���ֱ�
			if(f.equals(search)) {
				found = true;
				break;// ã�ұ� ������ �̸��� �Ȱ����� Ȯ���ϴ� if�� Ż��
			}
		}
		System.out.println(search +" ã�ƽ��ϱ�? " + (found ? "ã��" : "��ã��"));
	}
	
	
	public void practice5() {
		// ��ĳ�� ������ �Է��ϰ� �迭�� ������ �ִ��� Ȯ���� ��
		Scanner sc = new Scanner(System.in);
		// 4 search ��ĳ�ʷ� ����
		System.out.print("������� ������ �Է��ϼ��� : ");
		String search = sc.next();
		boolean found = false;
		
		String zoo[] = {"�ڳ���", "������", "Ǫ�ٿ�", "�䳢", "����"};
		
		for(String f : zoo) {
			if(f.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + "��(��) " + (found ? "����" : "����"));
	}

	
}
