package com.kh.setEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		// set.add ����� ���� �ɰԶ� ������ ��¡��� �˻���Ĩ �ɰԶ� �ɰԶ� �ɰԶ�
		set.add("�����");
		set.add("����");
		set.add("�ɰԶ�");
		set.add("������");
		set.add("��¡���");
		set.add("�˻���Ĩ");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		set.add("�ɰԶ�");
		 
		System.out.println(set);
		
		System.out.println(set.size()); // ũ�� Ȯ��
		
		System.out.println(set.contains("������")); // contains ����ؼ� �������� �����ϴ��� Ȯ��
		
		set.remove("����"); // ����
		System.out.println(set.contains("����"));
		
		System.out.println(set);
		set.isEmpty(); //�����Ͱ� ��� ���ŵǾ����� Ȯ��

		
		
		
		
	}
}
