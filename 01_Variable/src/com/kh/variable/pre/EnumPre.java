package com.kh.variable.pre;

public class EnumPre {
//�ʵ�  ctrl shift f : ����ϰ� ����
	enum ������{ ��, ��, ��, ��, ��, ��, �� };
	
	// enum���� �Һ��� {�л�, ������, ������}
	enum �Һ��� {�л�, ������, ������};
	// enum���� �Ǹ��� {�Ҹž�, ���ž�, �߸ž�}
	enum �Ǹ��� {�Ҹž�, ���ž�, �߸ž�};
	
// ������ : �ʼ�	
	public EnumPre() {
	}
	
//�޼���	
	// void
	public void �޼���1() {
		// ��~�� ���
		
		// ��ٱ��� = �迭�� ���
		//				  enum �ؿ� �ִ� �޼���
		������[] �迭 = ������.values(); // enum���� �ۼ��� ���� �������
		// for-each
		for(������ �� : �迭) {
			System.out.println(��);
		}
	}

	
	// void �޼��� 2�� ���� �Һ��ڿ� �Ǹ��ڸ� for-each ����ؼ� ���� ���
	public void �޼���2() {
		System.out.println("=== �Һ��� ===");
		
		�Һ���[] �Һ��ڵ� = �Һ���.values();
		for(�Һ��� �� : �Һ��ڵ�) {
			System.out.println(��);
		}
		
		System.out.println("=== �Ǹ��� ===");
		�Ǹ���[] �Ǹ��ڵ� = �Ǹ���.values();
		for(�Ǹ��� �� : �Ǹ��ڵ�) {
			System.out.println(��);
		}
		// �Һ��� �л�	�Ǹ��� �Ҹž� ordinal() if �� ����ؼ� ���ϴ� ������ �޼��� 2 �ۼ�
		�Һ��� c = �Һ���.�л�;
		System.out.println("�л��� ��� : " + c.ordinal());
		�Ǹ��� s = �Ǹ���.�Ҹž�;
		System.out.println("�Ҹž��� ��� : " + s.ordinal());
		
		if(c.ordinal() >  s.ordinal()) {
			// sysout �Һ����� ����� �� �����ϴ�.
			System.out.println("�Һ����� ����� �� �����ϴ�.");
		} else if(c.ordinal() ==  s.ordinal()) {
			System.out.println("�Һ��ڿ� �Ǹ����� ����� �����ϴ�.");
		} else {
			System.out.println("�Ǹ����� ����� �� �����ϴ�.");
		}
	}
	
	
	
	
	// ���θ޼���
	public static void main(String[] args) {
		EnumPre ep = new EnumPre();
		//ep.�޼���1();
		ep.�޼���2();
	}}
