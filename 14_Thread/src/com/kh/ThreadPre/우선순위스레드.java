package com.kh.ThreadPre;

public class �켱���������� {
	// main
	public static void main(String[] args) {
		// for ������ 1���� 3���� �ݺ�
		for(int i = 1; i <= 3; i++) {
			�����忬�� n = new �����忬��(i);
			
			if(i == 1) {
				n.setPriority(Thread.MAX_PRIORITY);
			} else if(i == 2) {
				n.setPriority(Thread.NORM_PRIORITY);
			} else {
				n.setPriority(Thread.MIN_PRIORITY);
			}
			n.start();
		}
		// 1~3���� ���ʴ�� ������ �� �ֵ��� ����
	}
}
