package com.kh.op;

public class OperatorPre {
	// ���� ������ִ� ���� �޼���
	public static void main(String[] args) {
		method1();
	}
	// �������� ����ϴ� �޼���� �ƴ�
	// ���� �ʿ��� �� ������ ����ϴ� �޼���
	// �޼��� : Ư�� ���³� ����� �����س��� ����
	
	// static : ������ �̶�� ���� ������ ����
		// static �� �ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�
	// �ܵ����� ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ��
	
	public static void method1() {
	//public void method1() { 
		// 1. int num1 =10, int mum2 = 3
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		int num1 = 10;
		int num2 = 3;
		
		int ���ϱ� = num1+num2;
		System.out.println("���� ��� : " + ���ϱ�);		
		int ���� = num1-num2;
		System.out.println("���� ��� : " + ����);	
		int ���ϱ� = num1*num2;
		System.out.println("���� ��� : " + ���ϱ�);	
		int ������ = num1/num2;
		System.out.println("������ ��� : " + ������);
		
		// 2. double num3 = 2.5, double num4 =3.5
		// ���ϱ� ���� ���ϱ� ������ ����� ����ϱ�
		
		double num3 = 2.5;
		double num4 = 3.5;
		
		double sum = num3+num4;
		System.out.println("���� ��� : " + sum);
		double sub = num3-num4;
		System.out.println("���� ��� : " + sub);
		double mul = num3*num4;
		System.out.println("���� ��� : " + mul);
		double div = num3/num4;
		System.out.println("������ ��� : " + div);
		
	}

}
