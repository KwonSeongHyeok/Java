package com.kh.oop.method.oop;

public class DrinkMaker {
//�ʵ�
	private String drinkType; // ���� ����
	private    int quantity;  // ���� ��
	private    int temp;	  // �µ�
// �޼���
	// setter
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	// getter
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}
	
	// ������ : �⺻
	public DrinkMaker() {
		
	}
	// ������ : �ʼ� �������� ���� �� �µ�
	public DrinkMaker(String drinkType, int quantity, int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	// void makeDrink
	public void makeDrink() {
		System.out.println("�ֹ� ���� : " + drinkType);
		System.out.println("���� �� : " + quantity);
		if(temp < 5) {
			System.out.println("�µ� : ������");
		} else if(temp < 10) {
			System.out.println("�µ� : �������ϰ�");
		} else {
			System.out.println("�µ� : �̰߰�");
		}
		System.out.println("���������� �Ϸ�Ǿ����ϴ�.");
	}
}
