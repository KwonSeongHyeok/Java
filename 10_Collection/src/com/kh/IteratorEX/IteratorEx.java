package com.kh.IteratorEX;

import java.util.ArrayList;
import java.util.Iterator;



/*
 Collection(List, Set, Map)�ݺ��ϴµ� ���
 Enumeration : ���̻� ���� x Vector�� ���� ������ ���� Ŭ���������� ����
 
 Iterator : �ݺ��ϴµ� ���(���������� ȸ��)
 			�б⸸ ����, �߰��ϰų� ������ �� ����
 
 ListIterator : Iterator ���׷��̵� ����
 				List(Vector, ArrayList, LinkedList) �÷��ǿ����� ���
 				��������� ���������� ȸ���� �� ����
 				��������� ��ȸ = �յڷ� �̵� ����
 				�߰��ϰų� ������ �� ����

 Iterator �ؿ� �ִ� �޼���
 	hasNext() : ������ �ִ��� ������ Ȯ��
 				���࿡ �����Ѵٸ� true �������� �ʴ´ٸ� false
 	Next()	  : ���� ���� ������ ���µ� ���
 				next()�� ����ϱ� ���� hasNext()�� ����ؼ� �� ������ �ִ��� �������� Ȯ���ϰ�
 					next()�� ����ϴ� ���� ������(�ͼ��� ������ ��)
 
 * */

public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ���ϵ� = new ArrayList<>();
		���ϵ�.add("���");
		���ϵ�.add("��纣��");
		���ϵ�.add("�м��ĸ���"); // ����
		���ϵ�.add("����");
		
		//import javax.swing.text.html.HTMLDocument.Iterator; xxxxxx
		//import java.util.Iterator; OK!
		//  Iterator ����
		Iterator<String> �ݺ� = ���ϵ�.iterator();
		
		// hasNext() ���� ���� �ִ��� Ȯ�� = true false
		while(�ݺ�.hasNext()) {
			//next()�� ���� �� ������ ����
			String ���� = �ݺ�.next();
			System.out.println(����);
		}
		
	}
	
	
	
}
