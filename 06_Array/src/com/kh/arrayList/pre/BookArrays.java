package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {

	public static void main(String[] args) {
		Book[] å�� = new Book[3];
		å��[0] = new Book("�Ƹ��", "�տ���");
		å��[1] = new Book("�Һ��� ��Ģ", "��� �Ͽ���");
		å��[2] = new Book("���� �а� ���� ������", "�տ���");

		// å ���� ����
		Book[] ������������ = Arrays.copyOf(å��, å��.length);

		// ������ ������ ���� ���
		System.out.println("=== ������ ������ å ���� ===");
		for(Book å : ������������) {
			System.out.println(å.getBookName() + ", " + å.getAuthor());
		}
		
		// å��� ������ ������ å�� ������ ��
		boolean same = Arrays.equals(å��, ������������);
		System.out.println("å��� ������ ������ å �� ������ ? " + same);
		
		// ������������ ��Ȳ������ �����ؼ� ������ ���µ�
		Book[] ��Ȳ������ = Arrays.copyOf(������������, 3);
		for(Book book : ��Ȳ������) {
			System.out.println(book.getBookName() + ", " + book.getAuthor());
		}
				
		// for - each �� ��� ��Ȳ���������� ���� å ���� ���
		
	}

}
