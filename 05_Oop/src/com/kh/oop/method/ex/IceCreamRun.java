package com.kh.oop.method.ex;

public class IceCreamRun {
	public static void main(String[] args) {
		IceCream ice1 = new IceCream();
		ice1.setName("�޷γ�");
		ice1.setSugar(10);
		ice1.setMilk(true);
		ice1.makeIceCream();
		System.out.println("-----------------------");
		
		IceCream ice2 = new IceCream("��ũ����", 10, false);
		ice2.makeIceCream();
		
	}
}
