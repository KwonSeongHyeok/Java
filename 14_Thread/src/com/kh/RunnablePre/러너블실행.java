package com.kh.RunnablePre;

public class ���ʺ���� {
	// main �޼��� ����
	public static void main(String[] args) {
		
		// for ������ ������ 5�� ���� ��
		for(int i = 0; i < 5; i++) {
			���ʺ��� r = new ���ʺ���(i);
			Thread ������ = new Thread(r);
			
			������.start();
		}
		System.out.println("���θ޼��� �����ϱ��?");
		// for���� Ż���ϸ� ���θ޼��� �����ϱ��? ��� ���
	}

}
