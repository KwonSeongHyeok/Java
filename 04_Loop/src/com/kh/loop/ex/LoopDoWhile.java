package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	 do-while : do���� while ���ǿ� ������� ������ �� ���� ����
	 			������ false���� ���� 1ȸ�� ������ ����
	 
	 ���  ���� :
	 do {
	 	����� ����;
	 	} while (���ǽ�);
	 
	 * */
	
	public static void main(String[] args) {
		int count = 1;
		
		do {
			System.out.println("���ڰ� : " + count);
			// ���ǿ� ���� �������� �߰��ϱ⵵ ��
			count++;
		} while(count <= 5);
		
	}
	
}
