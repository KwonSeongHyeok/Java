package com.kh.setEx;
/*
 TreeSet
 �ߺ��� ������� �ʰ�, ���� �ڵ����� �����ϴ� ����
 �˻� Ʈ���� ���·� �����͸� �����ϸ�, �ڵ����� ���ĵ� ���� ����
 
 �ڵ����� 0~9, A-Z, a-z, ��-�� ��������

 	  add() : �߰�
   remove() : ����
 contains() : ������ ���� �ִ��� Ȯ��
  isEmpty() : TreeSet�� ����ִ��� Ȯ��
 	 size() : ���� Ȯ��
 	first() : ���� ���� ������ ��ȯ
   	 last() : ���� ū �����͸� ��ȯ
 	clear() : ��� �� ����

 * */

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		
		//�߰�
		ts.add(5);
		ts.add(2);
		ts.add(1);
		
		System.out.println("TreeSet ��� ���� : " + ts);
		
		// Set �ߺ��� �ȵǴ� ȣ�ָӴ� ���� ����
		// �ָӴϰ��� = �ȿ� ������� ������ �Ǿ����� �ʴٴ� �ǹ�
		
		ts.remove(2);
		// ����Ű : �ڵ� �� �̵� alt ȭ��ǥ �� �Ʒ���
		// ����Ű : �� ����		ctrl + D
		System.out.println("TreeSet ��� ���� : " + ts);		

		// �� ������ �Ǿ��ִ��� Ȯ��
		System.out.println(ts.contains(5)); // ������ true
		
		// ����ִ��� Ȯ��
		System.out.println(ts.isEmpty()); // ��������� true
		
		// ������ ����
		System.out.println(ts.size());
		
		// ���� ���� ��
		System.out.println(ts.first());
		
		// ���� ū ��
		System.out.println(ts.last());
		
		// ��� �� ����
		ts.clear();
		System.out.println("��κ��� : " + ts);
		
	}
	
	
}