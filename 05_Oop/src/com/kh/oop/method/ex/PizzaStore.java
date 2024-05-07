package com.kh.oop.method.ex;

public class PizzaStore {
	// 필드
	private String pizzaName; // 피자명
	private int pizzaPrice; // 피자 가격
	
	// 메서드 : setter
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzsPrice(int pizzsPrice) {
		this.pizzaPrice = pizzsPrice;
	}
	// 메서드 : getter
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzsPrice() {
		return pizzaPrice;
	}
	
	// 메서드 : 생성자 : 기본
	public PizzaStore() {
		
	}
	// 메서드 : 생성자 : 필수
	public PizzaStore(String pizzaName, int pizzaPrice) {
		this.pizzaName = pizzaName;
		this.pizzaPrice = pizzaPrice;
	}
	
	// 메서드 : void
	public void infoPizza() {
		System.out.println("피자이름 : " + pizzaName);
		System.out.println("피자가격 : " + pizzaPrice);
		System.out.println("------------------");
	}
	
	// 메서드 : main
	public static void main(String[] args) {
		// 피자 객체
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페퍼로니 피자");
		pizza1.setPizzsPrice(11000);
		pizza1.infoPizza();
		
		
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		// 가격 적는 것을 잊음
		pizza2.infoPizza();
		
		
		// 필수 생성자로 피자 생성
		PizzaStore pizza3 = new PizzaStore("치즈피자", 13000);
		pizza3.infoPizza();
		
	}
	
	
}
