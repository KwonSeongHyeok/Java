package com.kh.oop.method.ex;

public class PizzaStore {
	// �ʵ�
	private String pizzaName; // ���ڸ�
	private int pizzaPrice; // ���� ����
	
	// �޼��� : setter
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzsPrice(int pizzsPrice) {
		this.pizzaPrice = pizzsPrice;
	}
	// �޼��� : getter
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzsPrice() {
		return pizzaPrice;
	}
	
	// �޼��� : ������ : �⺻
	public PizzaStore() {
		
	}
	// �޼��� : ������ : �ʼ�
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}
	
	// �޼��� : void
	public void infoPizza() {
		System.out.println("�����̸� : " + pizzaName);
		System.out.println("���ڰ��� : " + pizzaPrice);
		System.out.println("------------------");
	}
	
	// �޼��� : main
	public static void main(String[] args) {
		// ���� ��ü
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("���۷δ� ����");
		pizza1.setPizzsPrice(11000);
		pizza1.infoPizza();
		
		
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("�������� ����");
		// ���� ���� ���� ����
		pizza2.infoPizza();
		
		
		// �ʼ� �����ڷ� ���� ����
		PizzaStore pizza3 = new PizzaStore("ġ������", 13000);
		pizza3.infoPizza();
		
	}
	
	
}
