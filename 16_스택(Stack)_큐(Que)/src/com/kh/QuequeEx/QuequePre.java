package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QuequePre {
	public static void main(String[] args) {
		Queue<Integer> ť = new LinkedList<>();
		
		ť.offer(80);
		ť.offer(60);
		ť.offer(30);
		ť.offer(20);
		
		int ���� = ť.poll();
		System.out.println(����);
		
		int �Ǿ� = ť.peek();
		System.out.println(�Ǿ�);
		
		boolean ���� = ť.isEmpty();
		System.out.println(����);
		
	}
}
