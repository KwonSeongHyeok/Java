package com.kh.oop.method.ex;

public class HamburgerStore {
	// �ʵ� �ܹ��� �̸� ����
	private String name;
	private int price;
	// �޼���
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	// ������ : �⺻
	public HamburgerStore() {
		
	}
	//������ : �ʼ�
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// ������ : void
	public void info() {
		System.out.println("�ܹ��� �̸� : " + name);
		System.out.println("�ܹ��� ���� : " + price);
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		HamburgerStore ham1 = new HamburgerStore();
		ham1.setName("�Ұ�����");
		ham1.setPrice(2000);
		ham1.info();
		
		HamburgerStore ham2 = new HamburgerStore("ġ�����", 3000);
		ham2.info();
	}
	
}
