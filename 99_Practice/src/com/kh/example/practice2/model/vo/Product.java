package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;
	
	// setter 
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	// getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	// �޼��� : ������ : �⺻
	public Product() {
		
	}
	// �޼��� : void
	public void information() {
		// �̸� ���� �귣��
		System.out.println("�� �� : " + pName);
		System.out.println("�� �� : " + price);
		System.out.println("�귣�� : " + brand);
		
	}
}
