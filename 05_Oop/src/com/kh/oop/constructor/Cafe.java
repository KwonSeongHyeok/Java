package com.kh.oop.constructor;

public class Cafe { // �� ���� () ���� ����
	//�ʵ� ����
		// ī�� �̸� ���� ���̺��
	public String name;
	public String location;
	public 	  int tableNum;
	
	
	
	// �⺻ �����ڿ� �ʼ� ������
	public Cafe() {
		
	}
	
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	// void �޼��� �����
	public void cafeInfo() {
		// ī���̸� ���� ���̺�� ����ϱ�
		System.out.println("ī���̸� : " + name);
		System.out.println("ī����ġ : " + location);
		System.out.println("���̺�� : " + tableNum);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���. kh�����Դϴ�.");
		System.out.println("---- ī�� ��ȸ�ϱ� ----");
		
		Cafe cafe1 = new Cafe();
		cafe1.name = "khī��";
		cafe1.tableNum = 5;
		cafe1.cafeInfo();
		
		Cafe cafe2 = new Cafe();
		cafe2.location = "����";
		cafe2.tableNum = 10;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("cafeKH", "Seoul", 6);
		cafe3.cafeInfo();
	}

}
