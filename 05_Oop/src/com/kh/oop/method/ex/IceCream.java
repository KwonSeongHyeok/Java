package com.kh.oop.method.ex;

public class IceCream {
// �ʵ�
	private String name;
	private int sugar;
	private boolean milk;
// �޼���
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	// getter
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}

	// ������ : �⺻
	public IceCream() {
		
	}
	// ������ : �ʼ� �̸� ���� ���� ����
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}

	// void makeIceCream() {
	public void makeIceCream() {
		System.out.println("���̽�ũ���� ����� ���Դϴ�.");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sugar +"g");
		if(milk) {
			System.out.println("���� �߰�");
		} else {
			System.out.println("���� ���߰�");
		}
		System.out.println("���̽�ũ���� �ϼ��Ǿ����ϴ�.");
	}
	
// IceCreamRun -> ���θ޼���
}
