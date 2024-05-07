package com.kh.setEx;

import java.util.HashSet;

/*
 set(����, �ָӴ�)
  	������ �������� ����
  	�ߺ� ������ ����x(������ ������ �����)
  	 �� HashSet(��ǥ)	 : ó�� �ӵ��� ���� set
 set �� LinkedHashSet : ������ �����ϴ� set
     �� TreeSet		 : �ڵ����ĵǴ� set
     
     HashSet ��� ����
     	��� ���� 1 : ��ü�� equals() �����ε� �Ǿ� �־����
     	��� ���� 2 : ��ü�� hashCode() �����ε� �Ǿ� �־����
     
     Set<�ڷ���> �� = new HashSet<>();
     HashSet<�ڷ���> �ؽü� = new HashSet<>();
     
 * */

public class SetEx {

	public static void main(String[] args) {
		// �ߺ��� ������� �ʰ� �� ���� �����ϴ� ���� �����ؼ�
		// ������ �ߺ� Ȯ�� ���� ���
		HashSet<String> set = new HashSet<>();
		// �����͸� �߰�			add
		set.add("�θǽ�");
		set.add("����");
		set.add("�׼�");
		set.add("������");
		System.out.println(set);
		
		/*
		 * �ڸ� ������ Ȯ�� 			get
		 * System.out.println(set.get(1));
		 * set �ڸ��� �����̰� Ư���ϰ� �ڸ���ȣ�� ������ �ڸ��� ����
		*/
		
		// ������ ����				remove
		set.remove("�θǽ�");
		System.out.println(set);
		
		// ������ ũ�� Ȯ�� 			size
		System.out.println(set.size());
		
		// ������ ��� ���� 			clear
		set.clear();
		
		// Ư�� �����Ͱ� �����ϴ��� Ȯ�� contains
		System.out.println(set.contains("������"));
		
		// ������ ����	���� ���� �ڸ����� ��� �Ұ� set
		// get, set ���Ұ�
	}

}
