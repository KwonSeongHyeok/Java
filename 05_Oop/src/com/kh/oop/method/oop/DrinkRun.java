package com.kh.oop.method.oop;

public class DrinkRun {
	// 메인 메서드
	public static void main(String[] args) {
		// 음료 제조 객체 생성
		DrinkMaker tea = new DrinkMaker("허브티", 1, 5);
		// 음료 가게 객체 생성
		DrinkStore st = new DrinkStore(tea, "경기", "멕아커피", false);
		
		st.orderDrink();
		System.out.println("-------------------------");
		
		DrinkMaker cof = new DrinkMaker("아메리카노", 3, 1);
		
		DrinkStore st2 = new DrinkStore(cof, "서울 서초구", "빠나쁘레쏘", true);
		
		st2.orderDrink();
	}
}
