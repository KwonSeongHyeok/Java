package com.kh.ThreadPre;

public class ��������� {
	//main �޼��� ����
	public static void main(String[] args) {
		for(int i = 0; i < 2; i++) {
			�����忬�� n = new �����忬��(i);
			n.start();
		}
		System.out.println("���� ����~~");
	}
		// for ������ ������ 2�� �����
		// start() ������ ����
	// for �� } �ݴ� �߰�ȣ �ؿ� ���θ޼��� ���� ��� �ۼ� �� �����غ���
}
