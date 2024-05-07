package com.kh.oop.method.ex;

public class IceCreamRun {
	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("메로나");
		ice1.setSugar(10);
		ice1.setMilk(true);
		ice1.makeIceCream();
		System.out.println("-----------------------");
		
		IceCream ice2 = new IceCream("스크류바", 10, false);
		ice2.makeIceCream();
		
	}
}
