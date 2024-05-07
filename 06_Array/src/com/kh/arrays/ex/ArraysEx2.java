package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

	// �⺻ ������
	public ArraysEx2() {
		
	}
	
	public void method1() {
		// ���� �迭 �����ϱ�
		int num[] = {6, 4, 2, 3, 5, 7, 9};
		
		// ���� �����ϱ�
		Arrays.sort(num);
		// ���ĵ� ���� ����ϱ�
		System.out.println(Arrays.toString(num));
		
		// �迭 �����ϱ�
		int abc[] = Arrays.copyOf(num, num.length);
		
		// num�� abc�� ������ ��
		boolean same = Arrays.equals(num, abc);
		System.out.println(same);
		
		
		// Arrays.fill�� �̿��ؼ� ���� 6���� ��� ä���
		int[] ä��� =  new int[3];
		Arrays.fill(ä���, 6);
		System.out.println(Arrays.toString(ä���));
	}
	
	
	

	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();
		
		
	}
}
