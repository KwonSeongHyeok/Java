package com.kh.interfaceEx;
// ctrl + z ���ư���
public class ������ {
	public static void main(String[] args) {
		��ǻ�� ������ = new ��ǻ��();
		������.�����ѱ�();
		������.��������();
		
		��Ź�� ������ = new ��Ź��();
		������.�����ѱ�();
		������.��������();		
		
		// ��̿� ��� ����
		��̿���� c1 = new ��̿����();
		c1.�����ѱ�();
		c1.��������();

		// ��̿� ���� ��� �׽�Ʈ
		int a = 10;
		int b = 5;
		// ctrl alt ȭ��ǥ �Ʒ����
		System.out.println(a + " + " + b + " = " + c1.��(a, b));
		System.out.println(a + " - " + b + " = " + c1.��(a, b));
		System.out.println(a + " * " + b + " = " + c1.��(a, b));
		System.out.println(a + " / " + b + " = " + c1.��(a, b));
		System.out.println(a + " % " + b + " = " + c1.������(a, b));
		
		
		// ���л��� ���
		���л����� m1 = new ���л�����();
		
		m1.�����ѱ�();
		a = 5;
		b = 3;
		System.out.println(a + " + " + b + " = " + m1.��(a, b));
		System.out.println(a + " - " + b + " = " + m1.��(a, b));
		System.out.println(a + " * " + b + " = " + m1.��(a, b));
		System.out.println(a + " / " + b + " = " + m1.��(a, b));
		System.out.println(a + " % " + b + " = " + m1.������(a, b));
		m1.��������();
	}	
}
