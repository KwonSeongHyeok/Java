package com.kh.ListEx;

import java.util.ArrayList;

public class ArrayListPre {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		
		// ���� add ��� �ٳ��� ������
		a.add("���");
		a.add("�ٳ���");
		a.add("������");
		
		// ���
		System.out.println(a);
		
		// get(1)�� ����ؼ� 1�� ����ִ� �� ��ȯ
		System.out.println(a.get(1));
		
		// set(1, "����") �� ����ؼ� �ٳ����� ������ ����
		a.set(1, "����");
		System.out.println(a.get(1));
		
		// size �̿��ؼ� ũ�� ��ȯ
		System.out.println(a.size());
		
		// isEmpty() ����Ʈ�� ����ִ��� Ȯ��
		System.out.println(a.isEmpty());
		
		// remove(2) ������ �ڸ� ����
		a.remove(2);
		
		// remove("���") ��� ����
		a.remove("���");
		
		// clear ��� ����
		a.clear();
		System.out.println(a.isEmpty());
	}

}
