package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	// main 메인메서드 에서 작성
	public static void main(String[] args) {
		
		Stack<Integer> sp = new Stack<>();
		
		// Stack 을 활용해서 10 30 50 40 20 을 넣고  push 사용
		sp.push(10);
		sp.push(30);
		sp.push(50);
		sp.push(40);
		sp.push(20);
		System.out.println(sp);
		
		// 맨 위 값을 지우고 반환해서 확인
		int 없애기 = sp.pop();
		System.out.println(없애기);
		
		//현재 맨 위 값 확인
		System.out.println(sp.peek());
		
		// 비어있는지 확인
		System.out.println(sp.isEmpty());
		
		// 크기는 몇인지 확인
		System.out.println(sp.size());
	}
	
}
