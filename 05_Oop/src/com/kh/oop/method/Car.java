package com.kh.oop.method;

public class Car {
	
	// �ʵ�
	public String brand; // �� �귣��
	public String model; // �� ��
	public 	  int year;  // �� ����
	
	// ������
	
	// ������ : �⺻
	public Car() {
		
	}
	// ������ : �ʼ�
	public Car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	// ������ : ctrl ����ä�� ������ ���콺�� ��� ó�� ������� �������� ��ġ�� ��
	
	// return �޼���
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int year() {
		return year;
	}
	
	public static void main(String[] args) {
		
		// �ڵ��� car1 ���
		Car car1 = new Car("Toyota", "Camry", 2022);
		
		//���� ���
		System.out.println(car1.getBrand() + "   " + car1.getModel() + "   " + car1.year());
		

	}

}








