package com.kh.CollectionEx;
/*
 Collection �������̽� ���ϵ��� ��������ִ� ����
 List, set�� �θ�Ŭ����
 ���������� ȸ�K�ϸ鼭 �ڵ带 ��ȸ�ϰų� �ڵ�ȿ� �ۼ��� ������ ��ȸ�ϰ�,
 �߰� ���� �˻� �� �⺻ �۾��� ����
 
 sort = ����Ʈ�� �⺻ ���� ������ ���� ����
 	1. ���� : �������� ���� ���� ������ ū �� ������ ����
 	2. ���ڿ� : ������ ���� ������ ���� ����
 	3. �츮�� ������ ���� ���� ���� : compareTo() �޼ҵ带 Ȱ���ؼ� ���� ������ �ۼ��� �� ����
 min,max = �ּҰ�, �ִ밪
 binarySearch = ����Ž���� ����ؼ� ����Ʈ���� ������ ��� ã��
 		���� Ž�� = ���ĵ� �迭�̳� ����Ʈ���� Ư���� ���� ��ġ�� ã�� �˰���
 		 			�迭 �Ǵ� ����Ʈ�� ������ ������ Ž�� ������ �������鼭 ���� ã�Ƴ��� ��
 					��� (�� ���� ������ ���� �ǹ�)
 					��� (�� ���� ������ ���ư��ٴ� ���� �ǹ�)
 addAll : ���� �߰��ϰ����ϴ� ��� ���� �߰�
					
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ColletionEx {
	public static void main(String[] args) {
		// ����
		ArrayList<Integer> ���ڵ� = new ArrayList<>();
		���ڵ�.add(3);
		���ڵ�.add(5);
		���ڵ�.add(4);
		���ڵ�.add(1);
		System.out.println(���ڵ�);
		
		// �÷����� �̿��ؼ� ������������ �����ϱ�!
		Collections.sort(���ڵ�);
		System.out.println(���ڵ�);
		
		
		// ArrayList���� add�� �ϳ��� �߰��ϴ� ���� �ƴ϶�
		// �ѹ��� ���� �߰��ϱ�
												//()�� Arrays.asList() �ְ������ŭ �߰� ����
		ArrayList<String> ����� = new ArrayList<>(Arrays.asList("black", "white"));
		System.out.println(�����);

	}
}
