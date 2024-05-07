package com.kh.oop.method.ex;

public class HamburgerStore {
	// 필드 햄버거 이름 가격
	private String name;
	private int price;
	// 메서드
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
	// 생성자 : 기본
	public HamburgerStore() {
		
	}
	//생성자 : 필수
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 생성자 : void
	public void info() {
		System.out.println("햄버거 이름 : " + name);
		System.out.println("햄버거 가격 : " + price);
		System.out.println("-----------------");
	}
	
	public static void main(String[] args) {
		HamburgerStore ham1 = new HamburgerStore();
		ham1.setName("불고기버거");
		ham1.setPrice(2000);
		ham1.info();
		
		HamburgerStore ham2 = new HamburgerStore("치즈버거", 3000);
		ham2.info();
	}
	
}
