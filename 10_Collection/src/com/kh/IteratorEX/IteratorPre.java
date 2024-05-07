package com.kh.IteratorEX;

import java.util.*;
/*
���� ��ġ�� ������ ��
������ ���� ��ġ���� ���� ������ ������ ����
 * ����ؼ� ��� �������⸦ ���ش�.
 			* ��ü����
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
*/
public class IteratorPre {

	public static void main(String[] args) {
		// 100, 10, 20, 30, 50, 70
		// ArrayList<Integer> ���ڵ� = new ArrayList<>();
		ArrayList<Integer> ���ڵ� = new ArrayList<>(Arrays.asList(100, 10, 20, 30, 50));
		// ���ڸ� �߰��ϴ� ��� 1ź
		// 	���ڵ�.add(100);
		���ڵ�.add(70);
		// ���ڸ� �߰��ϴ� ��� 2ź
		// Arrays.asList();
		
		// Iterator ����
		Iterator<Integer> �ݺ��ϱ� = ���ڵ�.iterator();
		
		// while �� ����ؼ� hasNext()�� ���� ��Ұ� �ִ��� Ȯ���ϰ�
		while(�ݺ��ϱ�.hasNext()) {
			int num = �ݺ��ϱ�.next();
			System.out.println(num);
		}
		// next()�� ����ϱ�
	}

}
